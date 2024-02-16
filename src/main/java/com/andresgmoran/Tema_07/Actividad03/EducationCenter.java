package com.andresmorantema_07.Actividad03;

import java.util.Arrays;

public class EducationCenter {
private final int LIMIT = 500;
private Student[] students;
private final String name;
private int cont = 0;

    public EducationCenter( String name) {
        this.name = name;
    }
    public void newStudent(int nia, String name, String surname, String dateBirth,int group,int phoneNumber){
        students[cont] = new Student(nia, name, surname, dateBirth, group, phoneNumber);

        cont++;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "students=" + Arrays.toString(students) +
                ", name='" + name + '\'' +
                '}';
    }
}

