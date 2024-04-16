package com.andresgmoran.Tema_09.Actividad08;

import com.andresgmoran.Tema_09.Actividad09.ArithmeticExceptionPersonal;
import com.andresgmoran.Tema_09.Actividad09.IndexOutOfBoundsPersonal;
import com.andresgmoran.Tema_09.Actividad09.NullPointerExceptionPersonal;

public class Actividad08 {
    public Actividad08(){
    }
    public void ArithmeticExceptionDivision(){
        try {
            int a = 5 / 0;
        } catch (ArithmeticException ae) {
            throw new ArithmeticExceptionPersonal(ae.getMessage());
        }
    }
    public void NullPointerExceptionCadena(){
        try {
            String cadena = null;
            cadena.charAt(0);
        } catch (NullPointerException e) {
            throw new NullPointerExceptionPersonal(e.getMessage());
        }
    }
    public void IndexOutOfBoundsArray(){
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (IndexOutOfBoundsException i) {
            throw new IndexOutOfBoundsPersonal(i.getMessage());
        }
    }
}
