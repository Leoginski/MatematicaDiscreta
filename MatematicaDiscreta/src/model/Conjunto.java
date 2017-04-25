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

    ArrayList<Elemento> conjunto = new ArrayList<>();

    public Conjunto() {
    }

    public Conjunto(ArrayList<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

    public ArrayList<Elemento> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

}
