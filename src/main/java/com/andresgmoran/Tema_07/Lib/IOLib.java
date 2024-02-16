package com.andresgmoran.Tema_07.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class IOLib {
    public static Scanner scanner = new Scanner(System.in);
    public static String solicitarString(String mensaje, int min, int max){
        String result;
        boolean valido;
        do {
            System.out.println(mensaje);
            result = scanner.nextLine();
            valido = result.length() >= min && result.length() <= max;

            if (!valido)
                System.err.printf("La longitud debe estar entre %d y %d", min,max);
        }while (!valido);
        return result;
    }

    public static Date solicitarFechaDate(String mensaje, SimpleDateFormat formato){
        Date fecha = null;
        boolean valido;
        do {
            System.out.println(mensaje);
            String fecharStr = scanner.nextLine();

            try {
                fecha = formato.parse(fecharStr);
            } catch (ParseException e) {}
            valido = fecha != null;
            if (!valido)
                System.out.println("El formato de la fecha no es valido");
        } while (!valido);
        return fecha;
    }
    public static double solicitarDouble(String mensjae, double min, double max){
        double result;
        boolean valido;

        do {
            System.out.println(mensjae);
            result = Double.parseDouble(scanner.nextLine());
            valido = result >= min && result <= max;
            if (!valido)
                System.err.printf("La longitud tiene que ser entre %s y %s", min,max);
        }while (!valido);
        return result;
    }
}
