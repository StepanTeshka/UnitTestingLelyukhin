package org.example;

import first.task.Student;
import second.task.SubjectGrades;
import third.task.AdressBook;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Dima", "S001");
//        Student student2 = new Student("Alina", "S002");
//
//        Student.addStudent(student1.getStudentId(), student1);
//        Student.addStudent(student2.getStudentId(), student2);
//
//
//        System.out.println(Student.getStudent("S002"));



        AdressBook addressBook = new AdressBook();

        addressBook.addContact("Тема", "123321");
        addressBook.addContact("Никита", "123321");
        addressBook.addContact("Андрей", "123321");

        System.out.println("Телефон Темы: " + addressBook.getPhone("Тема"));
        System.out.println("Телефон Никиты: " + addressBook.getPhone("Никита"));

        addressBook.displayContacts();

        AdressBook.removeContact("Никита");
        System.out.println("После убийства Никиты:");

        addressBook.displayContacts();

    }
}
