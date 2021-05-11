package com.tyht.service;

import com.tyht.domain.*;

/**
 * @Description 将Data中的数据封装到Employee[]数组中，同时提供操作Employee[]方法
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:43
 */
public class NameListService {
    private Employee[] employees;

    /**
    * @Description
    *   根据Data类构建相应大小的数组
    *   根据Data类的数据构建不同的对象
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 14:11
    */
    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取EMPLOYEE的四个基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment = null;
            double bonus;
            int stock;

            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
    * @Description 获取指定index上的员工设备
    * @Return [index]
    * @Author 脱氧核糖
    * @Date 2021/4/10 14:31
    */
    private Equipment creatEquipment(int index) {
        int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        switch (type) {
            case Data.PC:
                return new PC(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
            case Data.NOTEBOOK:
                return new NoteBook(Data.EQUIPMENTS[index][1], Double.parseDouble(Data.EQUIPMENTS[index][2]));
            case Data.PRINTER:
                return new Printer(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
        }
        return null;
    }

    /**
    * @Description 获取当前所有的员工
    * @Return []
    * @Author 脱氧核糖
    * @Date 2021/4/10 14:49
    */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
    * @Description 获取指定id的员工
    * @Return [id]
    * @Author 脱氧核糖
    * @Date 2021/4/10 14:49
    */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
