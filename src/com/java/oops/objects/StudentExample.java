package com.java.oops.objects;

public class StudentExample {
    int id;
    String name;
    int age;
    String email;

    public void read(){
        System.out.println("Reading...");
    }

    public void write(){
        System.out.println("Writing...");
    }

    public int add(int a,int b){
        return a + b;
    }

    public void subtract(){
        int a = 3;
        int b = 2;
        System.out.println(a-b);
    }


    public StudentExample(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public StudentExample(int id, String name){
        this.id = id;
        this.name = name;
        age = 36;
        email = "random@gmail.com";
    }

    public StudentExample(int id){
        this.id = id;
    }

    public StudentExample(){
        id = 001;
        name = "Raju";
        age = 18;
        email = "raju@gmail.com";
    }

    public static void main(String[] args) {
        StudentExample student1 = new StudentExample(3,"balu",22,"balu@gmail.com");
        StudentExample student2 = new StudentExample(4,"ram",34,"ram@gmail.com");

        StudentExample student3 = new StudentExample(2,"ravi");
        StudentExample student4 = new StudentExample();

        student1.age = 23;
        System.out.println(student1.age);
        System.out.println(student1.name);
        int sum = student1.add(2,3);
        System.out.println(sum);

        System.out.println(student1.name);
        System.out.println(student3.id + " : " + student3.name + ": " + student3.age + " : " + student3.email);


        System.out.println(student4.id + " : " + student4.name + ": " + student4.age + " : " + student4.email);
        student4.subtract();

        Car car1 = new Car();
        car1.brand = "Maruti Suzuki";
        car1.price = 600000;
        car1.model = "Swift";

        System.out.println(car1.brand + " : " + car1.model + " : " + car1.price);
    }
}
