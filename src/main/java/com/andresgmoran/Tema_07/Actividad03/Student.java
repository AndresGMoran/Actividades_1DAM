package com.andresgmoran.Tema_07.Actividad03;

import net.datafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class Student {
    private int nia;
    private String name;
    private String surname;
    private String dateBirth;
    private int group;
    private int phoneNumber;

    public Student(int nia, String name, String surname, String dateBirth, int group, int phoneNumber) {
        this.nia = nia;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }
    public int getNia() {
        return nia;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGroup() {
        return group;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nia=" + nia +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", group=" + group +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
