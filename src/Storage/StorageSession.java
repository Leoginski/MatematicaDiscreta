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

    public static Conjunto unirConjuntos(Conjunto obj1, Conjunto obj2) {
        Conjunto Uniao = new Conjunto(obj1.getNome() + "∪" + obj2.getNome());
        for (Elemento ele1 : obj1.getConjunto()) {
            Uniao.addElemento(ele1);
        }
        for (Elemento ele2 : obj2.getConjunto()) {
            Uniao.addElemento(ele2);
        }
        return Uniao;
    }

    public static Conjunto intersecaoConjuntos(Conjunto obj1, Conjunto obj2) {
        Conjunto Intersecao = new Conjunto(obj1.getNome() + "∩" + obj2.getNome());
        for (Elemento ele1 : obj1.getConjunto()) {
            for (Elemento ele2 : obj2.getConjunto()) {
                if (ele1.getValor() == ele2.getValor()) {
                    Intersecao.addElemento(ele2);
                }

            }
        }
        return Intersecao;
    }

    public static boolean isContido(Conjunto obj1, Conjunto obj2) {
        int rangeConjunto1 = obj1.getConjunto().size();
        int count = 0;
        for (Elemento ele1 : obj1.getConjunto()) {
            for (Elemento ele2 : obj2.getConjunto()) {
                if (ele1.getValor() == ele2.getValor()) {
                    count++;
                }
            }
        }
        if (count == rangeConjunto1) {
            return true;
        }
        return false;
    }

    public static boolean isContidoPropriamente(Conjunto obj1, Conjunto obj2) {
        int rangeConjunto1 = obj1.getConjunto().size();
        int rangeConjunto2 = obj2.getConjunto().size();

        if (isContido(obj1, obj2) && rangeConjunto1 != rangeConjunto2) {
            return true;
        }
        return false;
    }

    public static String imprimeConjunto(Conjunto obj) {
        if (obj.getConjunto().isEmpty()) {
            return obj.getNome() + " = {ø}";
        }

        String conjunto = obj.getNome() + " = {";
        for (Elemento ele : obj.getConjunto()) {
            conjunto += ele.getValor() + ",";
        }
        conjunto = conjunto.substring(0, conjunto.length() - 1);
        conjunto += "}";
        return conjunto;
    }
}
