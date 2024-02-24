package com.andresgmoran.Tema_07.AnexoPila.Actividad05;

import com.andresgmoran.Tema_07.AnexoPila.PilaDouble;

public class NotacionPolacaInversa {
    private String data;
    private final PilaDouble pila;

    public NotacionPolacaInversa(String expression) {
        this.data = expression;
        this.pila = new PilaDouble(10);
    }
    private boolean isNumber(String text){
        if (text == null || text.isEmpty())
            return false;
        int numDots = 0;
        for (int i = 0; i < text.length();i++){
            char c = text.charAt(i);
            if (!Character.isDigit(c)){
                if (c == '.') {
                   numDots++;
                   if (numDots > 1)
                       return false;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isOperator(String text){
        switch (text){
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
        }
        return false;
    }
    public double parse(){
        data = data.trim();
        double res = Double.POSITIVE_INFINITY;
        String[] values = data.split("\\s+");
        for (String value : values){
            if (isNumber(value)){
                pila.push(Double.parseDouble(value));
            }else if (isOperator(value)){

                double op2 = pila.pop();
                double op1 = pila.pop();
                res = operation(value,op1,op2);
                System.out.println(res);
                pila.push(res);
            }
        }
        res = pila.pop();

    if (pila.isEmpty()){
            return res;
        }else {
            return 0;
        }
    }
    private double operation(String operator, double op1, double op2){
        switch (operator){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
        }
        return Double.POSITIVE_INFINITY;
    }
}
