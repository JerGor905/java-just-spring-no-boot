package org.example;

public class Dev {

//    private int age;
    private Computer com;

    public Dev() {
        System.out.println("Dev Default Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev Parameterized Constructor");
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Dev(Computer com) {
//        this.com = com;
//        System.out.println("Dev Parameterized Constructor");
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Working on an AWESOME project!");
        com.compile();
    }
}
