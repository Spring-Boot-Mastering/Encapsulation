package org.example;

public class Main {
    public static void main() {
        GetSet student =  new GetSet();

//        Setters
        student.setName("Bohdan");
        student.setAge(18);
        student.setCourse("Spring-Boot-Mastering");

//        Getters (output)
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
    }
}
