package com.tyht.view;

import com.tyht.domain.Employee;
import com.tyht.domain.Programmer;
import com.tyht.service.NameListService;
import com.tyht.service.TeamException;
import com.tyht.service.TeamService;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:42
 */
public class TeamView {
    private NameListService listService = new NameListService();
    private TeamService teamService = new TeamService();

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }

    private void enterMainMenu() {
        boolean isFlag = true;
        char menu = '0';
        while (isFlag) {
            if(menu != '1')
                listAllEmployees();
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':

                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y')
                        isFlag = false;
                    break;
            }
        }
    }

    /**
    * @Description 显示所有的员工信息
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 18:47
    */
    private void listAllEmployees() {
        System.out.println("------------------------------开发团队调度软件------------------------------\n");
        Employee[] allEmployees = listService.getAllEmployees();
        if (allEmployees == null || allEmployees.length == 0) {
            System.out.println("公司中没有任何员工信息");
        } else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (int i = 0; i < allEmployees.length; i++) {
                System.out.println(allEmployees[i]);
            }
        }
        System.out.println("--------------------------------------------------------------------------\n");
    }

    /**
    * @Description 显示团队中所有的成员
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 19:29
    */
    private void getTeam() {
        System.out.println("--------------------------------团队成员列表-------------------------------\n");
        Programmer[] team = teamService.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队中没有成员");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("--------------------------------------------------------------------------\n");
    }

    /**
    * @Description 在团队中添加指定成员
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 19:30
    */
    private void addMember() {
        System.out.println("---------------------------------添加成员----------------------------------\n");
        System.out.println("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();
        System.out.println("---------------------------------------------------------------------------\n");
    }

    /**
    * @Description 删除团队中的指定成员
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 19:30
    */
    private void deleteMember() {
        System.out.println("---------------------------------删除成员----------------------------------\n");
        System.out.println("请输入要删除的员工ID：");
        int memberId = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N)：");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N')
            return;

        try {
            teamService.removeMember(memberId);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();
        System.out.println("---------------------------------------------------------------------------\n");
    }

}
