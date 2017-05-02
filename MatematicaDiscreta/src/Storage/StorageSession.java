/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import java.util.ArrayList;
import model.Conjunto;
import model.Elemento;

/**
 *
 * @author Lucas
 */
public class StorageSession {

    private static ArrayList<Elemento> elementos = new ArrayList<>();
    private static ArrayList<Conjunto> conjuntos = new ArrayList<>();

    public static ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public static void setElementos(Elemento elemento) {
        elementos.add(elemento);
    }

    public static ArrayList<Conjunto> getConjuntos() {
        return conjuntos;
    }

    public static void setConjuntos(Conjunto conjunto) {
        conjuntos.add(conjunto);
    }

}
