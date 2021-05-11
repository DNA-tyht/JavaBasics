package com.tyht.num;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/30 20:59
 */

//自定义枚举类
public class Season1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
    }
    //声明Season对象的属性: private final
    private final String seasonName;
    private final String seasonDesc;

    //私有化的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供单签枚举类的多个对象
    public static final Season1 SPRING = new Season1("春","春天");
    public static final Season1 SUMMER = new Season1("夏","夏天");
    public static final Season1 AUTUMN = new Season1("秋","秋天");
    public static final Season1 WINTER = new Season1("冬","冬天");
}
