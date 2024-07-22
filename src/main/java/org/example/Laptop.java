package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Default Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling with Laptop");
    }
}
