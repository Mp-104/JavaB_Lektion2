package com.Maksim.demo;

public class Student {
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;

    /*public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
}
