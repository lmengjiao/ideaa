package com.tian.demo;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) { //main方法快捷键 psvm
        System.out.println("hello java"); //输出快捷键 sout
        String name = "甜甜";
        System.out.println("name = " + name); //输出变量 soutv
        System.out.println("cc.main"); //输出方法 soutm
        System.out.println("args = [" + args + "]"); //输出参数 soutv
        int age = 21;
        if (age > 18) { //if快捷键 ifn
            System.out.println("您已成年");
        }
        ArrayList<String> aa = new ArrayList<>(); //自动补全 alt+回车
        aa.add("唐u"); //快速复制粘贴一行 ctrl+d
        aa.add("唐z"); //快速删除一行 ctrl+y
        aa.add("唐x"); //撤销一步 ctrl+z
        aa.add("唐c"); //撤销多行 ctrl+shift+za
        aa.add("唐v"); //多行编辑 alt+光标
        for (String s : aa) { //遍历循环 iter
            System.out.println(s);
        }

        //测试原型模式
        Computer c1=new Computer(); //构造方法是公开的才能new
        c1.setPrice(7000D);
        c1.setColor("银");
        c1.setName("联想");
        System.out.println("c1 = " + c1);

        Computer c2=new Computer();
        c2.setPrice(7000D);
        c2.setColor("银");
        c2.setName("联想");
        System.out.println("c2 = " + c2); //注释同toString会输出地址

        System.out.println(c1==c2); //false 地址不同
        //以上是原型模式 每次new都会创建一个新对象

        //测试单例模式
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1==p2); //true 只有一个对象

    }
}
