package com.tyht.domain;

import com.tyht.service.Status;

/**
 * @Description 程序员类，继承员工根父类
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:44
 */
public class Programmer extends Employee {
    private int memberId;//开发团队中的ID
    private Status status = Status.FREE;//程序员此时的状态
    private Equipment equipment;//使用设备

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
    }
}
