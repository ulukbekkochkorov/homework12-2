package com.company;

public class Main {

    public static void main(String[] args) {
	Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        parrot.setKind("Amazons");
        parrot.setAge(2d);
        System.out.println("The parrot's name is - " + parrot.getName());
        System.out.println("Its kind is " + parrot.getkind());
        System.out.println("It is - " + parrot.getAge());
        parrot.speak();
    }
}
