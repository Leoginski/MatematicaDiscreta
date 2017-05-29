/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conjunto;
import model.Elemento;
import model.Relacao;

/**
 *
 * @author Lucas
 */
public class StorageSession {

    private static ArrayList<Elemento> elementos = new ArrayList<>();
    private static ArrayList<Conjunto> conjuntos = new ArrayList<>();
    private static ArrayList<String> comboItens = new ArrayList<>();
    private static ArrayList<Relacao> relacoes = new ArrayList<>();

    public static ArrayList<Relacao> getRelacoes() {
        return relacoes;
    }

    public static void setRelacoes(ArrayList<Relacao> relacoes) {
        StorageSession.relacoes = relacoes;
    }

    public static ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public static void setElementos(Elemento elemento) {
        comboItens.add(elemento.getNome());
        elementos.add(elemento);
    }

    public static ArrayList<Conjunto> getConjuntos() {
        return conjuntos;
    }

    public static void setConjuntos(Conjunto conjunto) {
        verificaEAdicionaConjunto(conjunto);
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
        if (!existeNomeIgualConjunto(Uniao.getNome())) {
            verificaEAdicionaConjunto(Uniao);
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
        if (!existeNomeIgualConjunto(Intersecao.getNome())) {
            verificaEAdicionaConjunto(Intersecao);
        }

        return Intersecao;
    }

    public static boolean isContido(Conjunto obj1, Conjunto obj2) {
        int count = 0;
        for (Elemento ele1 : obj1.getConjunto()) {
            if (isPertence(ele1, obj2)) {
                count++;
            }
        }
        if (count == obj1.getConjunto().size()) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> getComboItens() {
        return comboItens;
    }

    public static boolean isContidoPropriamente(Conjunto obj1, Conjunto obj2) {
        if (isContido(obj1, obj2) && (obj1.getConjunto().size() != obj2.getConjunto().size())) {
            return true;
        }
        return false;
    }

    public static String produtoCartesiano(Conjunto obj1, Conjunto obj2) {
        String produto = obj1.getNome() + "x" + obj2.getNome() + " = {";

        for (Elemento ele1 : obj1.getConjunto()) {
            for (Elemento ele2 : obj2.getConjunto()) {
                produto += "(" + ele1.getValor() + "," + ele2.getValor() + "),";
            }
        }

        produto = produto.substring(0, produto.length() - 1);
        produto += "}";

        return produto;
    }

    public static String maiorQue(Conjunto dominio, Conjunto imagem) {
        String nome = "> :" + dominio.getNome() + "→" + imagem.getNome();
        Relacao maiorQue = new Relacao(nome, dominio, imagem);

        for (Elemento obj1 : dominio.getConjunto()) {
            for (Elemento obj2 : imagem.getConjunto()) {
                if (obj1.getValor() > obj2.getValor()) {
                    maiorQue.addDupla(obj1, obj2);
                }
            }
        }
        maiorQue.criaNotacao();
        relacoes.add(maiorQue);
        return nome;
    }

    public static String menorQue(Conjunto dominio, Conjunto imagem) {
        String nome = "< :" + dominio.getNome() + "→" + imagem.getNome();
        Relacao menorQue = new Relacao(nome, dominio, imagem);

        for (Elemento obj1 : dominio.getConjunto()) {
            for (Elemento obj2 : imagem.getConjunto()) {
                if (obj1.getValor() < obj2.getValor()) {
                    menorQue.addDupla(obj1, obj2);
                }
            }
        }
        menorQue.criaNotacao();
        relacoes.add(menorQue);
        return nome;
    }

    public static String igualA(Conjunto dominio, Conjunto imagem) {
        String nome = "= :" + dominio.getNome() + "→" + imagem.getNome();
        Relacao igualA = new Relacao(nome, dominio, imagem);

        for (Elemento obj1 : dominio.getConjunto()) {
            for (Elemento obj2 : imagem.getConjunto()) {
                if (obj1.getValor() == obj2.getValor()) {
                    igualA.addDupla(obj1, obj2);
                }
            }
        }
        igualA.criaNotacao();
        relacoes.add(igualA);
        return nome;
    }

    public static String quadradoDe(Conjunto dominio, Conjunto imagem) {
        String nome = "x² :" + dominio.getNome() + "→" + imagem.getNome();
        Relacao quadradoDe = new Relacao(nome, dominio, imagem);

        for (Elemento obj1 : dominio.getConjunto()) {
            for (Elemento obj2 : imagem.getConjunto()) {
                if (obj1.getValor() == (obj2.getValor() * obj2.getValor())) {
                    quadradoDe.addDupla(obj1, obj2);
                }
            }
        }
        quadradoDe.criaNotacao();
        relacoes.add(quadradoDe);
        return nome;
    }

    public static String raizDe(Conjunto dominio, Conjunto imagem) {
        String nome = "√x :" + dominio.getNome() + "→" + imagem.getNome();
        Relacao raizDe = new Relacao(nome, dominio, imagem);

        for (Elemento obj1 : dominio.getConjunto()) {
            for (Elemento obj2 : imagem.getConjunto()) {
                if (obj1.getValor() == Math.sqrt(obj2.getValor())) {
                    raizDe.addDupla(obj1, obj2);
                }
            }
        }
        raizDe.criaNotacao();
        relacoes.add(raizDe);
        return nome;
    }

    public static ArrayList<String> getNomesConjuntos() {
        ArrayList<String> allNomes = new ArrayList<>();
        for (Conjunto obj : conjuntos) {
            allNomes.add(obj.getNome());
        }
        return allNomes;
    }

    public static ArrayList<String> getNomesElementos() {
        ArrayList<String> allNomes = new ArrayList<>();
        for (Elemento obj : elementos) {
            allNomes.add(obj.getNome());
        }
        return allNomes;
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

    public static boolean existeNomeIgualConjunto(String nome) {
        boolean cont = false;
        for (String obj : StorageSession.getNomesConjuntos()) {
            if (nome.equals(obj)) {
                cont = true;
            }
        }
        return cont;
    }

    public static boolean existeNomeIgualElemento(String nome) {
        boolean cont = false;
        for (String obj : StorageSession.getNomesElementos()) {
            if (nome.equals(obj)) {
                cont = true;
            }
        }
        return cont;
    }

    public static void verificaEAdicionaConjunto(Conjunto conjunto) {
        boolean cont = false;
        for (String obj : StorageSession.getNomesConjuntos()) {
            if (conjunto.getNome().equals(obj)) {
                cont = true;
            }
        }
        if (!cont) {
            comboItens.add(conjunto.getNome());
            conjuntos.add(conjunto);
        } else {
            JOptionPane.showMessageDialog(null, "Conjunto já existente!");
        }
    }

    public static boolean addItemComboBox(String nome, ArrayList<String> nomesCombo) {
        boolean cont = true;
        for (String obj : nomesCombo) {
            if (nome.equals(obj)) {
                cont = false;
            }
        }
        return cont;
    }

    public static Relacao getRelacaoPorNome(String nome) {
        for (Relacao obj : relacoes) {
            if (obj.getNome().equals(nome)) {
                return obj;
            }
        }
        return null;
    }

    public static void resetStorage() {
        elementos = new ArrayList<>();
        conjuntos = new ArrayList<>();
    }
}
