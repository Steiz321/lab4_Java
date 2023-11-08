package org.example;

import org.junit.jupiter.api.Test;
import org.example.Task28;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void addStudent() {
        ArrayList<Student> students = new ArrayList<>();

        String surname = "Fundament";
        String name = "Daniil";
        String lastname = "Dmitrovych";
        String group = "TR-15";
        int year = 2004;
        int month = 4;
        int day = 7;
        float grade = 100;

        Student newStudent = Task28.addStudent(students, name, surname, lastname, group,year, month, day, grade);
        Student correct = students.get(0);

        assertEquals(correct, newStudent);
    }

    @Test
    void deleteStudent() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivanov", "Ivan", "Petrovych", "TI-21", new BirthDate(2000, 1, 1), 65.5f));
        students.add(new Student("Gaydash", "Oleg", "Valeriyovych", "TV-34", new BirthDate(2001, 2, 2), 78.6f));
        students.add(new Student("Boyko", "Mykhaylo", "Mykolayovych", "TR-12", new BirthDate(2002, 3, 3), 94.3f));
        students.add(new Student("Danilyuk", "Max", "Stepanovych", "RT-14", new BirthDate(2003, 4, 4), 86.2f));
        students.add(new Student("Sharmalyuk", "Serhiy", "Volodymyrovych", "MM-15", new BirthDate(2004, 5, 5), 72.1f));

        int index = 2;
        Student correct = students.get(2);

        Student result = Task28.deleteStudent(students, index);

        assertEquals(correct, result);
    }
}