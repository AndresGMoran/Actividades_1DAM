package com.andresgmoran;

import com.andresgmoran.Tema_09.Actividad01.Actividad01;
import com.andresgmoran.Tema_09.Actividad02.Actividad02;
import com.andresgmoran.Tema_09.Actividad03.Actividad03;
import com.andresgmoran.Tema_09.Actividad05.Actividad05;
import com.andresgmoran.Tema_09.Actividad06.Actividad06;
import com.andresgmoran.Tema_09.Actividad07.Actividad07;
import com.andresgmoran.Tema_09.Actividad08.Actividad08;
import com.andresgmoran.Tema_09.Actividad09.ArithmeticExceptionPersonal;
import com.andresgmoran.Tema_09.Actividad09.IndexOutOfBoundsPersonal;
import com.andresgmoran.Tema_09.Actividad09.NullPointerExceptionPersonal;

public class Main {
    public static void main(String[] args) {
        Actividad08 actividad08 = new Actividad08();
        try {
            actividad08.ArithmeticExceptionDivision();
        }catch (ArithmeticExceptionPersonal aep){
            System.out.println(aep.getMessage());
        }

        try {
            actividad08.NullPointerExceptionCadena();
        }catch (NullPointerExceptionPersonal npp){
            System.out.println(npp.getMessage());
        }

        try{
            actividad08.IndexOutOfBoundsArray();
        }catch (IndexOutOfBoundsPersonal ip){
            System.out.println(ip.getMessage());
        }
    }
}