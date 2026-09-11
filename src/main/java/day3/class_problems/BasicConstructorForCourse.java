package main.java.day3.class_problems;

class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

public class BasicConstructorForCourse {
    public static void main(String[] args) {
        Course course = new Course("21CSC201J", "Data Structures");

        System.out.println(course.code + " - " + course.title);
    }
}