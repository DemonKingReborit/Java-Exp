package com.example.hibernatecrud;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Alice", "Spring Boot");
        dao.saveStudent(s1);

        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getCourse());
        }

        Student s2 = dao.getStudent(1);
        if (s2 != null) {
            s2.setCourse("Hibernate ORM");
            dao.updateStudent(s2);
        }

        dao.deleteStudent(2);
    }
}
