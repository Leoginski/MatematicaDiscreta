/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Elemento {

    private String nome;
    private String valor;

    public Elemento() {

    }

    public Elemento(String elemento) {
        this.valor = elemento;
    }

    public Elemento(String nome, String elemento) {
        this.nome = nome;
        this.valor = elemento;
    }

    public void setElemento(String elemento) {
        this.valor = elemento;
    }

    public String getElemento() {
        return valor;
    }

    public String getNome() {
        return this.nome;
    }
}
