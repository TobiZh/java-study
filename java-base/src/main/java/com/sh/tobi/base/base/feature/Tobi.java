package com.sh.tobi.base.base.feature;

/**
 * 继承
 * 在定义和实现一个类的时候，可以在一个已经存在的类的基础之上来进行，把这个已经存在的类所定义的内容作为自己的内容，
 * 并可以加入若干新的内容，或修改原来的方法使之更适合特殊的需要，这就是继承。比如，遗产的继承。
 */
public class Tobi extends Person{

    private String like;

    public Tobi(){

        System.out.println("初始化");

    }

    public String getWork(){
        return "it";
    }

}
