package com.sh.tobi.base.base.feature;


import java.util.Objects;

/**
 * 封装
 * 面向对象的封装性指的是将对象封装成一个高度自治和相对封闭的个体，对象状态（属性）由这个对象自己的行为（方法）来读取和改变
 */
public class Person {


    public int life=1;
    private String name;

    private int age;

    /**
     *  protected（受保护）类似于 private，区别是子类可以访问 protected 的成员，
     *  但不能访问 private 成员。
     */
    protected int gender;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    static {
        System.out.println("static 静态代码块类加载调用");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (life != person.life) return false;
        if (age != person.age) return false;
        if (gender != person.gender) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        int result = life;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + gender;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
