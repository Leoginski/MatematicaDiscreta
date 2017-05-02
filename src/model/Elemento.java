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
    private int valor;

    public Elemento() {

    }

    public Elemento(int elemento) {
        this.valor = elemento;
    }

    public Elemento(String nome, int elemento) {
        this.nome = nome;
        this.valor = elemento;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return this.nome;
    }
}
