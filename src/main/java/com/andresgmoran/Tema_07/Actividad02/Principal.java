package com.andresmorantema_07.Actividad02;

public class Principal {
    public static void main(String[] args) {
        Asignaturas curso = new Asignaturas("Programming", 2651, 1);

        System.out.println("Name: " + curso.getName());
        System.out.println("Code: " + curso.getCode());
        System.out.println("Year of course: " + curso.getCourse());
    }
}
