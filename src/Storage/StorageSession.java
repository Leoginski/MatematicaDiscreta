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

    public static Conjunto encontraConjunto(String nome) {
        for (Conjunto obj : conjuntos) {
            if (obj.getNome().equals(nome)) {
                return obj;
            }
        }
        return null;
    }

    public static Elemento encontraElemento(String nome) {
        for (Elemento obj : elementos) {
            if (obj.getNome().equals(nome)) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList<String> retornaNomesConjuntos(ArrayList<Conjunto> lista) {
        ArrayList<String> nomes = new ArrayList();
        for (Conjunto obj : lista) {
            nomes.add(obj.getNome());
        }
        return nomes;
    }

    public static ArrayList<String> retornaNomesElementos(ArrayList<Elemento> lista) {
        ArrayList<String> nomes = new ArrayList();
        for (Elemento obj : lista) {
            nomes.add(obj.getNome());
        }
        return nomes;
    }

    public static boolean isPertence(Elemento elemento, Conjunto conjunto) {
        for (Elemento obj : conjunto.getConjunto()) {
            if (obj.getValor() == elemento.getValor()) {
                return true;
            }
        }
        return false;
    }
}
