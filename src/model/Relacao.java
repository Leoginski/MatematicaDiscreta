/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Relacao {

    String nome;
    Conjunto dominio = new Conjunto();
    Conjunto imagem = new Conjunto();
    ArrayList<Conjunto> produto = new ArrayList<>();
    String notacao;

    public Relacao() {
    }

    public Relacao(String nome, Conjunto dominio, Conjunto imagem) {
        this.dominio = dominio;
        this.imagem = imagem;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNotacao() {
        return notacao;
    }

    public Conjunto getDominio() {
        return dominio;
    }

    public void setDominio(Conjunto dominio) {
        this.dominio = dominio;
    }

    public Conjunto getImagem() {
        return imagem;
    }

    public void setImagem(Conjunto imagem) {
        this.imagem = imagem;
    }

    public void addDupla(Elemento ele1, Elemento ele2) {
        Conjunto dupla = new Conjunto(ele1, ele2);
        this.produto.add(dupla);
    }

    public void criaNotacao() {
        String notacao = this.nome + " = {";
        for (Conjunto obj : this.produto) {
            ArrayList<Elemento> elementos = obj.getConjunto();
            notacao += " <" + elementos.get(0).getValor() + "," + elementos.get(1).getValor() + ">,";
        }
        notacao = notacao.substring(0, notacao.length() - 1);
        notacao += " }";
        this.notacao = notacao;
    }
}
