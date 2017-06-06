
/**
 * 第一题:分析以下需求,并用代码实现
	向集合中添加四个人姓名做为集合的元素:"张三","李四","王五","赵六"
	遍历集合中的元素并输出   */
/**
 * 1、创建集合
 * 2、将数据添加到集合中
 * 3.遍历集合输出每个元素*/
package com.day01.one;
import java.util.ArrayList;

public class One {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
