package com.range.demo.poc.snakeyaml;

public class User {
    private String age;
    public String getAge() {
        System.out.println("getAge()");
        return age;
    }
    public void setAge(String age) {
        System.out.println("setAge()");
        this.age = age;
    }
    public String getName() {
        System.out.println("getName()");
        return name;
    }
    public void setName(String name) {
        System.out.println("setName()");
        this.name = name;
    }
    private String name;
    public User(){
        System.out.println("User constructor");
    }
    //最先被执行
    static {
        System.out.println("User static");
    }
}
