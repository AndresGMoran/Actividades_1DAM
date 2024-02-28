package com.andresgmoran.Tema_07.Actividad06;
import java.util.Scanner;
public class Main {
    public static BikeShop shop = new BikeShop("XabiaBikes", 500);
    public static Scanner scanner;
    public static void main(String[] args) {
        int option;
        do {
            scanner = new Scanner(System.in);
            System.out.println("""
                    *********************
                    **TIENDA BICISCLETA**
                    *********************
                    1. Añadir bicicleta
                    2. Vender bicicicleta
                    3. Consultar bicicleta
                    4. Mostrar stock
                    -----------------------
                    0. Salir""");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    newBike();
                    break;
                case 2:
                    sellBike();
                    break;
                case 3:
                    createMenu();
                    break;
                case 4:
                    showStock();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
            }
        }while(option != 0);
        System.out.println(shop);
    }
    public static void newBike(){
        scanner = new Scanner(System.in);

        String make;
        String model;
        double weight;
        double inchWheels;
        int engine;
        String dateFabrication;
        double price;
        int stock;

        System.out.println("Dime la marca: ");
        make = scanner.nextLine();

        System.out.println("Dime el modelo");
        model = scanner.nextLine();

        System.out.println("Dime el peso: ");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Dime el tamaño de las ruedas [En pulgadas]: ");
        inchWheels = Double.parseDouble(scanner.nextLine());

        System.out.println("Dime si la bicicleta lleva motor [Si es que si (1), si es que no (0):] ");
        engine = Integer.parseInt(scanner.nextLine());

        System.out.println("Dime la fecha de fabricacion: ");
        dateFabrication = scanner.nextLine();

        System.out.println("Dime el precio: ");
        price = Double.parseDouble(scanner.nextLine());

        System.out.println("Dime el stock que hay: ");
        stock = Integer.parseInt(scanner.nextLine());

        System.out.println(shop.createBike(make,model,weight,inchWheels,engine,dateFabrication,price,stock));


    }
    public static void sellBike(){
        scanner = new Scanner(System.in);
        System.out.println("Dime el numero de referencia de la bicicleta que quieres vender: ");
        int referenceNumber = Integer.parseInt(scanner.nextLine());
        if(shop.eraseBike(referenceNumber))
            System.out.println("Bicicleta se vendio y se elimino correctamente");
        else
            System.out.println("ERROR");

    }
    public static void showStock(){

    }
    public static void createMenu(){

    }
}
