package com.day01.three;

/**
 * 第三题：分析以下需求，并用代码实现
 * 要求:完成代码(按照标准格式写)，然后在测试类中测试。
 * 1.手机类Phone
 * 属性:品牌brand,价格price
 * 无参构造,有参构造
 * 行为:打电话call,发短信sendMessage,玩游戏,playGame
 * 2.测试类
 * 创建Phone类对象,调用Phone类中的方法
 * <p>
 * 思考:假设所有的手机都有属性屏幕的尺寸(int size),而且假设所有手机的屏幕尺寸为6,应该如何实现?
 */
public class Three {
    public static void main(String[] args) {
        Phone.size=6;
        Phone p1=new Phone("苹果",6000);
        Phone p2=new Phone();
        System.out.println("手机品牌为："+p1.getBrand()+"价格："+p1.getPrice()+"尺寸：");
    }
}
