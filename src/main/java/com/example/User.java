package com.example;


import lombok.Data;

@Data
public class User {

    private String name;
    private int age;
    private String email;


    public static void main(String[] args) {

        User user=new User();

        user.setName("Gemini");
        user.setAge(22);
        System.out.println("Name: " +user.getName());
        System.out.println("Age: " +user.getAge());
    }
}
