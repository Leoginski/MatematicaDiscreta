/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Conjunto {

    String nome;
    ArrayList<Elemento> conjunto = new ArrayList<>();

    public Conjunto() {
    }

    public Conjunto(String nome) {
        this.nome = nome;
    }

    public Conjunto(ArrayList<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Elemento> getConjunto() {
        return this.conjunto;
    }

    public void setConjunto(ArrayList<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

    public void addElemento(Elemento E) {
        int check = 0;
        for (Elemento ele : this.conjunto) {
            if (ele.getValor() == E.getValor()) {
                check++;
            } else {
            }
        }
        if (check == 0) {
            this.conjunto.add(E);
        }
    }

}
