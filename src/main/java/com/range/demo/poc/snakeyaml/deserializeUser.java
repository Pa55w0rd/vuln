package com.range.demo.poc.snakeyaml;

import org.yaml.snakeyaml.Yaml;

public class deserializeUser {
    public static void main(String[] args){
        String user="!!com.range.demo.poc.snakeyaml.User {age: '30', name: cor0ps}";
        Yaml yaml=new Yaml();
        User user_desrial=yaml.load(user);
        System.out.println(user_desrial+" "+user_desrial.getName());
    }
}
