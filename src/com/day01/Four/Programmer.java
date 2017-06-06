package com.day01.Four;

/**
 * 2.程序员类
 属性：姓名 工号 工资
 行为：工作work
 */
public class Programmer {
    private String name;
    private int num;
    private int pay;

    public Programmer() {
    }

    public Programmer(String name, int num, int pay) {
        this.name = name;
        this.num = num;
        this.pay = pay;
    }

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
    public void work(){
        System.out.println("姓名");
        System.out.println("我的心里只有编程");
    }
}
