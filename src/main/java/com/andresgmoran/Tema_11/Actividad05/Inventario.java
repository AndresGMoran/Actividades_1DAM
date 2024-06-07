package com.andresgmoran.Tema_11.Actividad05;

import com.andresgmoran.Tema_11.Actividad05.objetos.Huevo;
import com.andresgmoran.Tema_11.Actividad05.objetos.Objeto;
import com.andresgmoran.Tema_11.Actividad05.objetos.ObjetoApilable;
import com.andresgmoran.Tema_11.Actividad05.objetos.Perla;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Objeto> inventario;

    public Inventario() {
        inventario = new ArrayList<>();
    }

    /**
     * Añade un objeto al inventario. Si el objeto es apilable y ya existe en el inventario, se añade a la pila.
     * @param objeto Objeto a añadir al inventario
     * @return Objeto añadido al inventario o null si no se ha podido añadir
     */
    public Objeto nuevoObjeto(Objeto objeto) {
        if (inventario.isEmpty() || !inventario.contains(objeto)) {
            inventario.add(objeto);
            return objeto;
        }
        for (Objeto o : inventario) {
            if (objeto instanceof ObjetoApilable && o.equals(objeto)){
                boolean apilacion = anyadirAApilacion((ObjetoApilable) objeto);
                if (!apilacion) {
                    return objeto;
                }
            }
        }
        return null;
    }

    /**
     * Elimina un objeto del inventario. Si el objeto es apilable y tiene más de una unidad, se resta una unidad.
     * @param objeto Objeto a eliminar del inventario
     * @return Objeto eliminado del inventario o null si no se ha podido eliminar
     */
    public Objeto eliminarObjeto(Objeto objeto){
        if (inventario.isEmpty() || !inventario.contains(objeto)) {
            return null;
        }
        for (Objeto o : inventario) {
            if (o.equals(objeto)) {
                if (o instanceof ObjetoApilable) {
                    if (((ObjetoApilable) o).getCont() > 1) {
                        ((ObjetoApilable) o).restarACont();
                        return o;
                    }
                }
                inventario.remove(o);
                return o;
            }
        }
        return null;
    }

    /**
     * Condiciones para apilar segun tipo de objeto.
     * @param o Objeto a añadir a la pila
     * @return true si se puede añadir a la pila, false si no se puede
     */
    private boolean anyadirAApilacion(ObjetoApilable o){
        if (o instanceof Huevo || o instanceof Perla) {
            if (o.getCont() == ObjetoApilable.MAX_APILACION_OBJ) {
                return false;
            }
        } else {
            if (o.getCont() == ObjetoApilable.MAX_APILACION_MATERIALES) {
                return false;
            }
        }
        o.sumarACont();
        return true;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "inventario=" + inventario +
                '}';
    }
}
