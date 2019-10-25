package com.company;

import com.company.Dao.GroupDao;
import com.company.Dao.StudentDao;
import com.company.model.Group;
import com.company.model.Student;

public class Main {

    //Отношение 1:M
    //Создать несколько групп
    //Добавить несколько студентов в каждую группу
    //Список студентов по названию группы (в любом регистре)

    public static void main(String[] args) {

        GroupDao groupDao = new GroupDao();
        StudentDao studentDao = new StudentDao();

        Group group1 = new Group("Java");
        Group group2 = new Group("JS");
        Group group3 = new Group("PHP");
        Group group4 = new Group("C#");
        Group group5 = new Group("C++");

        groupDao.addGroup(group1);
        groupDao.addGroup(group2);
        groupDao.addGroup(group3);
        groupDao.addGroup(group4);
        groupDao.addGroup(group5);

        Student student1 = new Student("Alex", 21);
        Student student2 = new Student("Ben", 22);
        Student student3 = new Student("Carl", 23);
        Student student4 = new Student("Dave", 24);
        Student student5 = new Student("Emily", 25;
        Student student6 = new Student("Felix", 26);
        Student student7 = new Student("Greg", 27);
        Student student8 = new Student("Helen", 28);
        Student student9 = new Student("Isabella", 29);
        Student student10 = new Student("Joe", 30);

        studentDao.addStudent(student1);
        studentDao.addStudent(student2);
        studentDao.addStudent(student3);
        studentDao.addStudent(student4);
        studentDao.addStudent(student5);
        studentDao.addStudent(student6);
        studentDao.addStudent(student7);
        studentDao.addStudent(student8);
        studentDao.addStudent(student9);
        studentDao.addStudent(student10);

        groupDao.addStudentToGroup(student1, group1);
        groupDao.addStudentToGroup(student2, group1);
        groupDao.addStudentToGroup(student3, group1);

        groupDao.addStudentToGroup(student4, group2);
        groupDao.addStudentToGroup(student5, group2);

        groupDao.addStudentToGroup(student6, group3);
        groupDao.addStudentToGroup(student7, group3);

        groupDao.addStudentToGroup(student8, group4);

        groupDao.addStudentToGroup(student9, group5);
        groupDao.addStudentToGroup(student10, group5);

        System.out.println("Students in this group: " + groupDao.getStudentsInGroup("Java"));
        System.out.println("Students in this group: " + groupDao.getStudentsInGroup("JS"));
        System.out.println("Students in this group: " + groupDao.getStudentsInGroup("PHP"));
        System.out.println("Students in this group: " + groupDao.getStudentsInGroup("C#"));
        System.out.println("Students in this group: " + groupDao.getStudentsInGroup("C++"));
    }
}
