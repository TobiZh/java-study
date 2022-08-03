package com.sh.tobi.base.base.feature;

public class Test {

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.life);
        // protected（受保护）类似于 private，区别是子类可以访问 protected 的成员，但不能访问 private 成员。
        System.out.println(person.gender);


        Tobi tobi=new Tobi();
        String
        tobi.setAddress("上海市");

        tobi.print();
        System.out.println(tobi.getWork());
        System.out.println(tobi.toString());

    }
}
