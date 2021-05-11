package com.tyht.num;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/30 21:13
 */
public enum Season2 implements Runnable {
    //提供当前枚举类的对象,多个对象间用","隔开
    SPRING("春", "春天") {
        @Override
        public void run() {

        }
    },
    SUMMER("夏", "夏天") {
        @Override
        public void run() {

        }
    },
    AUTUMN("秋", "秋天") {
        @Override
        public void run() {

        }
    },
    WINTER("冬", "冬天") {
        @Override
        public void run() {

        }
    };

    //声明Season对象的属性: private final
    private final String seasonName;
    private final String seasonDesc;

    //私有化的构造器
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

}
