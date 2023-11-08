package org.example;

// Створити застосунок для перегляду, додавання і видалення елементів списку студентів.
// Початкові записи в списку (5 елементів) створюються в програмному коді і є об'єктом класу ArrayList.
// Кожен елемент списку містить прізвище, ім'я та по батькові (ПІБ) студента (типу String), ім'я групи (типу String),
// дату народження (типу BirthDate) і середню оцінку за минулу сесію (типу float).
// Об'єкт класу BirthDate в свою чергу містить три елементи типу int (рік, номер місяця і день народження).

import java.util.ArrayList;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivanov", "Ivan", "Petrovych", "TI-21", new BirthDate(2000, 1, 1), 65.5f));
        students.add(new Student("Gaydash", "Oleg", "Valeriyovych", "TV-34", new BirthDate(2001, 2, 2), 78.6f));
        students.add(new Student("Boyko", "Mykhaylo", "Mykolayovych", "TR-12", new BirthDate(2002, 3, 3), 94.3f));
        students.add(new Student("Danilyuk", "Max", "Stepanovych", "RT-14", new BirthDate(2003, 4, 4), 86.2f));
        students.add(new Student("Sharmalyuk", "Serhiy", "Volodymyrovych", "MM-15", new BirthDate(2004, 5, 5), 72.1f));

        System.out.println("Students list:");
        printStudents(students);

        System.out.println();
        System.out.println("Adding a student:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter lastname:");
        String lastname = scanner.nextLine();
        System.out.println("Enter group:");
        String group = scanner.nextLine();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter avg drage:");
        float averageGrade = scanner.nextFloat();

        Student newStudent = addStudent(students, name, surname, lastname, group, year, month, day, averageGrade);

        System.out.println();
        System.out.println("Students list:");
        printStudents(students);


        System.out.println();
        System.out.println("Enter index of student to delete:");
        int index = scanner.nextInt();

        Student removedStudent = deleteStudent(students, index);

        System.out.println();
        System.out.println("Students list:");
        printStudents(students);
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static Student addStudent(ArrayList<Student> students, String name, String surname, String lastName, String group, int year, int month, int day, float averageGrade) {
        Student newStudent = new Student(surname, name, lastName, group, new BirthDate(year, month, day), averageGrade);
        students.add(newStudent);

        return newStudent;
    }

    public static Student deleteStudent(ArrayList<Student> students, int index) {
        Student student = students.get(index);
        students.remove(index);

        return student;
    }

}

class BirthDate {
    public int year;
    public int month;
    public int day;

    public BirthDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", year, month, day);
    }
}

class Student {

    public String surname;
    public String name;
    public String lastName;
    public String group;
    public BirthDate birthDate;
    public float averageGrade;

    public Student(String surname, String name, String lastName, String group, BirthDate birthDate, float averageGrade) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.birthDate = birthDate;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastName + " Group: " + group + " Date: " + birthDate + " Grade: " + averageGrade;
    }
}
