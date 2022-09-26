package com.sh.tobi.base.design.builder;

import cn.hutool.json.JSONUtil;
import lombok.Builder;

public class User {

    private int id;
    private String userName;


    private User(Builder builder){
        this.id=builder.id;
        this.userName= builder.userName;
    }

    public static class Builder{
        private int id;
        private String userName;

        public Builder setId(int id){
            this.id=id;
            return this;
        }

        public Builder setUserName(String userName){
            this.userName=userName;
            return this;
        }

        public User build(){

            return new User(this);
        }

    }

    public static void main(String[] args) {
        User user=new User.Builder().setId(1).setUserName("tobi").build();
        System.out.println(user.toString());
    }
}
