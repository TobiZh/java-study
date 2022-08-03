package com.sh.tobi.base.base.datatype;

public class test {

    public static void main(String[] args) {
        Integer i = 400;
        Integer j = 400;
        System.out.println(i==j);  //false
        Integer o = 12;
        Integer k = 12;
        System.out.println(o==12);  //true



       int a = Integer.parseInt("1024");
       int b = Integer.valueOf("1024").intValue();


       System.out.println(a==b);
    }
}
