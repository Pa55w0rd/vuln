package com.range.demo.poc.snakeyaml;

import org.yaml.snakeyaml.Yaml;

public class serializeUser {
    public static void main(String[] args){
        User user=new User();
        user.setAge("30");
        user.setName("cor0ps");
        Yaml yaml=new Yaml();
        String serilize=yaml.dump(user);
        System.out.println(serilize);

    }
}
