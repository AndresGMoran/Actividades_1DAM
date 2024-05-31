package com.andresgmoran.Tema_07.Actividad03Clase;
import java.util.Scanner;

public class Main {
    private static  EducationCenter educationCenter;
    private static Scanner scanner;

    public static void main(String[] args) {
        educationCenter = new EducationCenter("IES La Mar",500);
        scanner = new Scanner(System.in);
        int option;
        do{
            option = mainMenu();
            switch (option){
                case 1:
                    createStudent();
                    break;
                case 2:
                    eraseStudent();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("AU");
                    break;
            }
        }while (option !=0);
    }
    public static void eraseStudent(){
        System.out.println("Nia: ");
        String nia = scanner.nextLine();
        if(educationCenter.eraseStudent(nia)){
            System.out.println("Se elimino el alumno");
        }else{
            System.out.println("No se elimino el alumno");
        }
    }
    public static void createStudent(){
        String name;
        String surname;
        String dateBirth;
        String group;
        String phoneNumber;
        boolean valid;
        do{
            System.out.println("Nombre: ");
            name = scanner.nextLine();

            valid = (name.length() >= 2);
            if(!valid){
                System.out.println("El nombre debe de tener al menos 2 caracteres");
            }
        }while(!valid);

        do{
            System.out.println("Apellidos: ");
            surname = scanner.nextLine();

            valid = (surname.length() >= 2);
            if(!valid){
                System.out.println("El apellido debe de tener al menos 2 caracteres");
            }
        }while(!valid);

        do{
            System.out.println("Fecha de nacimiento: ");
            dateBirth = scanner.nextLine();

            valid = dateBirth.length() == 10 && dateBirth.charAt(2) == '-' && dateBirth.charAt(5) == '-';
            if(!valid){
                System.out.println("Fecha incorrecta, el formato debe ser [dd-mm-yyyy]");
            }
        }while(!valid);
        do{
            System.out.println("Grupo: ");
            group = scanner.nextLine();

            valid = (group.length() >= 3);
            if(!valid){
                System.out.println("El grupo debe de tener al menos 3 caracteres");
            }
        }while(!valid);

        do{
            System.out.println("Telefono: ");
            phoneNumber = scanner.nextLine();

            valid = (phoneNumber.length() >= 9);
            if(!valid){
                System.out.println("El apellido debe de tener al menos 9 numeros");
            }
        }while(!valid);

        Student student = educationCenter.newStudent(name,surname,dateBirth,group,phoneNumber);
        if(educationCenter.newStudent(name,surname,dateBirth,group,phoneNumber) != null) {
            System.out.println("Alumno creado correctamente");
            System.out.println(student);
        }else{
            System.out.println("Error al crear el alumno");

        }
    }


    public static int mainMenu(){
        int option = -1;
        boolean valid;
        do{
            System.out.println("*******************");
            System.out.println("**GESTION ALUMNOS**");
            System.out.println("*******************");
            System.out.println("1. Nuevo alumno");
            System.out.println("2. Baja de alumno");
            System.out.println("3. Consultas");
            System.out.println("---------------------");
            System.out.println("0. Salir");
            option = scanner.nextInt();
            valid = option >= 0 && option < 4;
            if(!valid)
                System.out.println("Opcion no valida");
        }while (!valid);
        return option;
    }
}
