package com.java.oops.objects;

public class Student {
    int id;
    String name;
    int marks;

    public Student(){
        id = 1;
        name = "surya";
        marks = 80;
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

