package com.andresmorantema_07.Actividad03;
import java.util.Scanner;

public class Main {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        EducationCenter center = new EducationCenter("Ies la Mar");

        System.out.println("""
                *******************
                **GESTION ALUMNOS**
                *******************
                1. Nuevo alumno
                2. Baja de alumno
                3 Consultas
                --------------------
                0. Salir""");
        int opcion = lector.nextInt();

        switch (opcion){
            case 1:
                System.out.println("nia");
                int nia = lector.nextInt();
                System.out.println("name ");
                String name = lector.next();
                System.out.println("surname");
                String surname = lector.next();
                System.out.println("dateBirth");
                String dateBirth = lector.next();
                System.out.println("group");
                int group = lector.nextInt();
                System.out.println("number");
                int phoneNumber = lector.nextInt();

                center.newStudent(nia,name,surname,dateBirth,group,phoneNumber);
                break;
            case 2:
                System.out.println("pepe");
            case 0:
                System.exit(0);
        }
    }
}
