package com.andresgmoran.Tema_11.Actividad05.objetos;

public class ObjetoApilable extends Objeto{
    public static final int MAX_APILACION_MATERIALES = 64;
    public static final int MAX_APILACION_OBJ = 16;
    private int cont;

    public ObjetoApilable(String name) {
        super(name);
        this.cont = 1;
    }

    /**
     * Suma 1 al contador de objetos apilados
     */
    public void sumarACont() {
        this.cont += 1;
    }

    /**
     * Resta 1 al contador de objetos apilados
     */
    public void restarACont() {
        this.cont -= 1;
    }

    public int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        return super.toString() + "ObjetoApilable{" +
                "cont=" + cont +
                '}';
    }
}
