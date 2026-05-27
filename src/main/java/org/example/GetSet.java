package org.example;

public class GetSet {

    private String name;
    private int age;
    private String course;


//    Getters
    public String getName() {
        return name;
    }
    public int  getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }


//    Setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.age = age;
    }

    public void setCourse(String course) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Course cannot be null or empty");
        }
        this.course = course;
    }
}
