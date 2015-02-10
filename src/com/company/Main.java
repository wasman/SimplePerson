package com.company;

public class Main {

    public static void main(String[] args) {
        Person originalPerson = new Person("Ivan");
        for (String name :args) {
            Person person = new Person(name);
            System.out.println(person);
            System.out.println(originalPerson.equals(person));
        }
    }


}
