package com.andresgmoran.Tema_07.Actividad07;

public class Pacient {
    private final int sip;
    private final String name;
    public enum gender{
        MALE,FEMALE
    };
    private final int age;

    public Pacient(int sip, String name, int age) {
        this.sip = sip;
        this.name = name;
        this.age = age;
    }
    public int getSip() {
        return sip;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Pacient{" +
                "sip=" + sip +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
