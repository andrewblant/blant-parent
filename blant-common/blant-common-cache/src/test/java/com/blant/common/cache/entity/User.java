package com.blant.common.cache.entity;

import lombok.ToString;

/**
 * Created by Ace on 2017/5/21.
 */
@ToString
public class User {
    private String name;
    private int age;
    private String account;

    public User(String name, int age, String account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return account != null ? account.equals(user.account) : user.account == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        return result;
    }
}
