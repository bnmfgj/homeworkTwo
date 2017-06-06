package com.day01.Four;

/**
 * 1.项目经理类
 * 属性：姓名 工号 工资 奖金
 * 行为：工作work
 */
public class ProjectManager {
    private String name;
    private int num;
    private int pay;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public ProjectManager() {
    }

    public ProjectManager(String name, int num, int pay, int money) {
        this.name = name;
        this.num = num;
        this.pay = pay;
        this.money = money;
    }

    public void work() {
        System.out.println("我的心里只有工作");
    }
}
