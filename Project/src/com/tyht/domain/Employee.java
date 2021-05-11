package com.tyht.domain;

/**
 * @Description 员工根父类
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:44
 */
public class Employee implements Comparable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetails() {
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }
    @Override
    public String toString() {
        return getDetails();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            int compare = this.name.compareTo(employee.name);
            if (compare != 0) {
                return compare;
            } else {
                if (this.id > employee.id) {
                    return 1;
                } else if (this.id < employee.id) {
                    return -1;
                } else {
                    if (this.age > employee.age) {
                        return 1;
                    } else if (this.age < employee.age) {
                        return -1;
                    } else {
                        if (this.salary > employee.salary) {
                            return 1;
                        } else if (this.salary < employee.salary) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("输入的数据类型错误");
        }
    }
}
