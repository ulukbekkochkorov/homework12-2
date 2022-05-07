package com.company;

public class Parrot {
    private String name;
    private String kind;
    private double age;

    void setName (String name1) {
        name = name1;
    }public String getName () {
        return name;
    }
    void setKind (String kind1){
        kind = kind1;
    }public String getkind(){
        return kind;
    }
    void setAge (Double age1){
        age = age1;
    }public double getAge() {
        return age;
    }
    public void speak () {
        System.out.println("Рома дурак. Сам дурак. Кеша крутой");
    }
}
