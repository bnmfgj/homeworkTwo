package com.day01.two;

/**
 * 第二题:分析以下需求,并用代码实现
 * 猜数字小游戏:
 * 1.系统产生一个随机数1~100之间的。
 * 2.键盘录入我们要猜的数据
 * 3.比较这两个数据(用if语句)
 * 大了：给出提示大了
 * 小了：给出提示小了
 * 猜中了：给出提示，恭喜你，猜中了
 * 4.一直猜,直到猜对为止
 */

import java.util.Scanner;

/**
 * 分析需求
 * 1.利用Math类产生随机数
 * 2.Scanner类录入数据
 * 3.if语句比较两个数据大小，根据大小分别给出提示
 * 4.循环语句直到猜对为止
 */
public class Two {
    public static void main(String[] args) {
        int answer = (int) (1 + Math.random() * 100);
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("请输入一个0-100的整数");
            int num = scanner.nextInt();
            if (answer > num) {
                System.out.println("小了");
            } else if (num > answer) {
                System.out.println("大了");
            } else {
                System.out.println("恭喜您猜对");
                break;
            }
        }



    }
}
