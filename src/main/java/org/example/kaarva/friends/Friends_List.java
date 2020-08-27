package org.example.kaarva.friends;

public class Friends_List {
    private String Name;
    private int Age;

    public Friends_List(){

    }

    public Friends_List(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }



    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
