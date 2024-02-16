package com.andresmorantema_07.Actividad02;

public class Asignaturas {
    private String name;
    private int code;
    private int course;

    public Asignaturas(String name, int code, int course) {
        this.name = name;
        this.code = code;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getCourse() {
        return course;
    }
}
