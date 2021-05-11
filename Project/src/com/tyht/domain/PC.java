package com.tyht.domain;

/**
 * @Description PC设备
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 13:31
 */
public class PC implements Equipment {
    private String model;//机器型号
    private String display;//显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
