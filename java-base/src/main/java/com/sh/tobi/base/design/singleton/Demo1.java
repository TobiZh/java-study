package com.sh.tobi.base.design.singleton;

public class Demo1 {

    private static final Demo1 instance=new Demo1();

    // 设置成
    private Demo1(){};

    public static Demo1 getInstance(){
        return instance;
    }


    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Demo1 demo=Demo1.getInstance();
                System.out.println(demo.hashCode());
            }).start();
        }
    }
}


