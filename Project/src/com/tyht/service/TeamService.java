package com.tyht.service;

import com.tyht.domain.Architect;
import com.tyht.domain.Designer;
import com.tyht.domain.Employee;
import com.tyht.domain.Programmer;

/**
 * @Description 关于开发团队成员的管理：增加删除等
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:43
 */
public class TeamService {
    private static int count = 1;//memberId赋值时使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队的实际人数

    public TeamService() {

    }
    /**
    * @Description 获取开放团队中的所有成员
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 17:48
    */
    public Programmer[] getTeam() {
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
    * @Description 将指定员工添加到开发团队中
    * @Return [e]
    * @Author 脱氧核糖
    * @Date 2021/4/10 17:51
    */
    public void addMember(Employee e) throws TeamException {

        //获取team中已有成员中架构师，设计师，程序员的个数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        } else if (!(e instanceof Programmer)) {
            throw new TeamException("该员工不是开发人员，无法添加");
        } else if (isExist(e)) {
            throw new TeamException("该员工已本开发团队成员");
        } else if (((Programmer) e).getStatus().equals("BUSY")) {
            throw new TeamException("该员工已是某团队成员");
        } else if (((Programmer) e).getStatus().equals("VOCATION")) {
            throw new TeamException("该员工正在休假");
        } else if (e instanceof Architect) {
            if (numOfArch >= 1)
                throw new TeamException("团队中至多只能有一名架构师");
        } else if (e instanceof Designer) {
            if (numOfDes >= 2)
                throw new TeamException("团队中至多只能有两名设计师");
        } else if (e instanceof Programmer) {
            if(numOfPro >= 3)
                throw new TeamException("团队中至多只能有三名程序员");
        }

        //添加操作
        team[total++] = (Programmer) e;
        ((Programmer) e).setStatus(Status.BUSY);
        ((Programmer) e).setMemberId(count++);
    }

    /**
    * @Description 判断指定的员工是否已存在现有的开发团队中
    * @Return [e]
    * @Author 脱氧核糖
    * @Date 2021/4/10 17:59
    */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
    * @Description 从团队中删除指定成员
    * @Return [memberId]
    * @Author 脱氧核糖
    * @Date 2021/4/10 18:30
    */
    public void removeMember(int memberId) throws TeamException {
        for (int i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                for (int j = i; j < total - 1; j++) {
                    team[j] = team[j + 1];
                }
                team[--total] = null;
                break;
            }
            if (i == total) {
                throw new TeamException("找不到指定memberId的员工，删除失败");
            }
        }
    }

}
