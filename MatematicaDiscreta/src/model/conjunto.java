/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class conjunto {

    ArrayList<List> conjunto = new ArrayList<>();

    public conjunto() {
    }

    public conjunto(ArrayList<List> conjunto) {
        this.conjunto = conjunto;
    }

    public ArrayList<List> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<List> conjunto) {
        this.conjunto = conjunto;
    }

}
