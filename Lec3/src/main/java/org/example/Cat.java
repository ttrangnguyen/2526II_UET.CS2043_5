package org.example;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Executing constructor Cat()");
    }

    public Cat(String _name){
        super(_name);
        System.out.println("Executing constructor Cat(String)");
    }
    @Override
    public void makeNoise() {
        System.out.println("Calling from class Cat:");
        System.out.println("Cat " + name + " is making noise");
    }
}
