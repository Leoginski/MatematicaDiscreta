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
    String classificacao = "";

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

    public boolean isFuncional() {
        for (Conjunto obj1 : this.produto) {
            int cont = 0;
            ArrayList<Elemento> elementos1 = obj1.getConjunto();
            int elemento1 = elementos1.get(0).getValor();
            for (Conjunto obj2 : this.produto) {
                ArrayList<Elemento> elementos2 = obj2.getConjunto();
                int elemento2 = elementos2.get(0).getValor();
                if (elemento1 == elemento2) {
                    cont++;
                }
            }
            if (cont > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isInjetora() {
        for (Conjunto obj1 : this.produto) {
            int cont = 0;
            ArrayList<Elemento> elementos1 = obj1.getConjunto();
            int elemento1 = elementos1.get(1).getValor();
            for (Conjunto obj2 : this.produto) {
                ArrayList<Elemento> elementos2 = obj2.getConjunto();
                int elemento2 = elementos2.get(1).getValor();
                if (elemento1 == elemento2) {
                    cont++;
                }
            }
            if (cont > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isTotal() {
        int cont = 0;
        for (Elemento obj1 : this.dominio.getConjunto()) {
            int elemento1 = obj1.getValor();
            for (Conjunto obj2 : this.produto) {
                ArrayList<Elemento> elementos2 = obj2.getConjunto();
                int elemento2 = elementos2.get(0).getValor();
                if (elemento1 == elemento2) {
                    cont++;
                    break;
                }
            }
        }
        if (cont == this.dominio.getConjunto().size()) {
            return true;
        }
        return false;
    }

    public boolean isSobrejetora() {
        int cont = 0;
        for (Elemento obj1 : this.imagem.getConjunto()) {
            int elemento1 = obj1.getValor();
            for (Conjunto obj2 : this.produto) {
                ArrayList<Elemento> elementos2 = obj2.getConjunto();
                int elemento2 = elementos2.get(1).getValor();
                if (elemento1 == elemento2) {
                    cont++;
                    break;
                }
            }
        }
        if (cont == this.imagem.getConjunto().size()) {
            return true;
        }
        return false;
    }

    public String getClassificacoes() {
        this.classificacao = "";
        if (this.isFuncional()) {
            this.classificacao += "[Funcional]";
        }
        if (this.isInjetora()) {
            this.classificacao += "[Injetora]";
        }
        if (this.isTotal()) {
            this.classificacao += "[Total]";
        }
        if (this.isSobrejetora()) {
            this.classificacao += "[Sobrejetora]";
        }
        return this.classificacao;
    }
}