/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Storage.StorageSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Conjunto;
import model.Elemento;

/**
 *
 * @author Aluno
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        jcbConjunto1.removeAllItems();
        jcbConjunto2.removeAllItems();
        jbPertence.setEnabled(false);
        jbNaoPertence.setEnabled(false);
        jbUniao.setEnabled(false);

        jcbConjunto1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (!(jcbConjunto1.getSelectedItem() == null) && !(jcbConjunto2.getSelectedItem() == null)) {
                    Pattern acharConjunto = Pattern.compile("[A-Z]");
                    String select1 = (String) jcbConjunto1.getSelectedItem();
                    String select2 = (String) jcbConjunto2.getSelectedItem();
                    Matcher acharConjuntoMatcher1 = acharConjunto.matcher(select1);
                    Matcher acharConjuntoMatcher2 = acharConjunto.matcher(select2);

                    if (acharConjuntoMatcher1.find() && acharConjuntoMatcher2.find()) {
                        jbPertence.setEnabled(false);
                        jbNaoPertence.setEnabled(false);
                        jbUniao.setEnabled(true);
                        jbIntersecao.setEnabled(true);
                        jbContidoOuIgual.setEnabled(true);
                        lbNaoContidoOuIgual.setEnabled(true);
                        lbContidoPropriamente.setEnabled(true);
                        lbNaoContidoPropriamente.setEnabled(true);
                        lbProdutoCartesiano.setEnabled(true);
                    } else {
                        jbPertence.setEnabled(false);
                        jbNaoPertence.setEnabled(false);
                        jbUniao.setEnabled(false);
                        jbIntersecao.setEnabled(false);
                        jbContidoOuIgual.setEnabled(false);
                        lbNaoContidoOuIgual.setEnabled(false);
                        lbContidoPropriamente.setEnabled(false);
                        lbNaoContidoPropriamente.setEnabled(false);
                        lbProdutoCartesiano.setEnabled(false);

                    }

                    if (!(acharConjuntoMatcher1.find()) && acharConjuntoMatcher2.find()) {
                        jbPertence.setEnabled(true);
                        jbNaoPertence.setEnabled(true);
                    }

                }

            }

        });
        jcbConjunto2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (!(jcbConjunto1.getSelectedItem() == null) && !(jcbConjunto2.getSelectedItem() == null)) {
                    Pattern acharConjunto = Pattern.compile("[A-Z]");
                    String select1 = (String) jcbConjunto1.getSelectedItem();
                    String select2 = (String) jcbConjunto2.getSelectedItem();
                    Matcher acharConjuntoMatcher1 = acharConjunto.matcher(select1);
                    Matcher acharConjuntoMatcher2 = acharConjunto.matcher(select2);

                    if (acharConjuntoMatcher1.find() && acharConjuntoMatcher2.find()) {
                        jbPertence.setEnabled(false);
                        jbNaoPertence.setEnabled(false);
                        jbUniao.setEnabled(true);
                        jbIntersecao.setEnabled(true);
                        jbContidoOuIgual.setEnabled(true);
                        lbNaoContidoOuIgual.setEnabled(true);
                        lbContidoPropriamente.setEnabled(true);
                        lbNaoContidoPropriamente.setEnabled(true);
                        lbProdutoCartesiano.setEnabled(true);
                    } else {
                        jbPertence.setEnabled(false);
                        jbNaoPertence.setEnabled(false);
                        jbUniao.setEnabled(false);
                        jbIntersecao.setEnabled(false);
                        jbContidoOuIgual.setEnabled(false);
                        lbNaoContidoOuIgual.setEnabled(false);
                        lbContidoPropriamente.setEnabled(false);
                        lbNaoContidoPropriamente.setEnabled(false);
                        lbProdutoCartesiano.setEnabled(false);
                    }

                    if (!(acharConjuntoMatcher1.find()) && acharConjuntoMatcher2.find()) {
                        jbPertence.setEnabled(true);
                        jbNaoPertence.setEnabled(true);
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jbArquivo = new javax.swing.JButton();
        jtfArquivo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbContidoOuIgual = new javax.swing.JButton();
        lbNaoContidoOuIgual = new javax.swing.JButton();
        lbContidoPropriamente = new javax.swing.JButton();
        lbNaoContidoPropriamente = new javax.swing.JButton();
        jbUniao = new javax.swing.JButton();
        jbIntersecao = new javax.swing.JButton();
        lbProdutoCartesiano = new javax.swing.JButton();
        lblOperacoes = new javax.swing.JLabel();
        jbPertence = new javax.swing.JButton();
        jbNaoPertence = new javax.swing.JButton();
        jcbConjunto1 = new javax.swing.JComboBox();
        jcbConjunto2 = new javax.swing.JComboBox();
        jlSeta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jbArquivo.setText("Pesquisar...");
        jbArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArquivoActionPerformed(evt);
            }
        });

        jtfArquivo.setEnabled(false);
        jtfArquivo.setName(""); // NOI18N
        jtfArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfArquivoActionPerformed(evt);
            }
        });

        jbContidoOuIgual.setText("⊆");
        jbContidoOuIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContidoOuIgualActionPerformed(evt);
            }
        });

        lbNaoContidoOuIgual.setText("!⊆");
        lbNaoContidoOuIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNaoContidoOuIgualActionPerformed(evt);
            }
        });

        lbContidoPropriamente.setText("⊂");
        lbContidoPropriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbContidoPropriamenteActionPerformed(evt);
            }
        });

        lbNaoContidoPropriamente.setText("!⊂");
        lbNaoContidoPropriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNaoContidoPropriamenteActionPerformed(evt);
            }
        });

        jbUniao.setText("∪");
        jbUniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUniaoActionPerformed(evt);
            }
        });

        jbIntersecao.setText("∩");
        jbIntersecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIntersecaoActionPerformed(evt);
            }
        });

        lbProdutoCartesiano.setText("×");
        lbProdutoCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbProdutoCartesianoActionPerformed(evt);
            }
        });

        lblOperacoes.setText("Operações:");

        jbPertence.setText("∈");
        jbPertence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPertenceActionPerformed(evt);
            }
        });

        jbNaoPertence.setText("!∈");
        jbNaoPertence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNaoPertenceActionPerformed(evt);
            }
        });

        jcbConjunto1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbConjunto1, org.jdesktop.beansbinding.ObjectProperty.create(), jcbConjunto1, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jcbConjunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConjunto1ActionPerformed(evt);
            }
        });

        jcbConjunto2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbConjunto2, org.jdesktop.beansbinding.ObjectProperty.create(), jcbConjunto2, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jcbConjunto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConjunto2ActionPerformed(evt);
            }
        });

        jlSeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlSeta.setText("->");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbConjunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jlSeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbConjunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbPertence)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbNaoPertence)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbUniao))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbContidoPropriamente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbNaoContidoPropriamente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbProdutoCartesiano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbContidoOuIgual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbNaoContidoOuIgual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbIntersecao)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblOperacoes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbConjunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSeta)
                    .addComponent(jcbConjunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOperacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPertence)
                    .addComponent(jbNaoPertence)
                    .addComponent(jbUniao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbContidoOuIgual)
                    .addComponent(lbNaoContidoOuIgual)
                    .addComponent(jbIntersecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContidoPropriamente)
                    .addComponent(lbNaoContidoPropriamente)
                    .addComponent(lbProdutoCartesiano)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbArquivo)
                    .addComponent(jtfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArquivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Filtro .txt", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.showOpenDialog(this);

        File txtFileLer = new File(fileChooser.getSelectedFile().getAbsolutePath());
        jtfArquivo.setText(txtFileLer.getName());

        // Leitura do arquivo
        try {
            FileReader arq = new FileReader(txtFileLer);
            BufferedReader lerArq = new BufferedReader(arq);
            // Pegando linhas do arquivo
            String linha = lerArq.readLine();

            //Expressoes regulares
            Pattern acharConjunto = Pattern.compile("[A-Z]");
            Pattern acharElemento = Pattern.compile("([a-z])");
            Pattern numero = Pattern.compile("\\d+");

            // Varrendo as linhas
            while (linha != null) {
                // Aplicando regex
                Matcher acharConjuntoMatcher = acharConjunto.matcher(linha);
                Matcher acharElementoMatcher = acharElemento.matcher(linha);
                Matcher numeroMatcher = numero.matcher(linha);

                System.out.print("\n");
                // Econtrando conjuntos
                if (acharConjuntoMatcher.find()) {
                    // Nome do conjunto
                    String nome = acharConjuntoMatcher.group();
                    // Instancia objeto e adiciona ao ArrayList
                    System.out.print("conjunto " + nome + " -> ");
                    Conjunto target = new Conjunto(nome);

                    while (numeroMatcher.find()) {
                        // Obtém valor
                        int value = Integer.parseInt(numeroMatcher.group());
                        Elemento elemento = new Elemento(value);
                        target.addElemento(elemento);
                        System.out.print(elemento.getValor() + " ");
                    }
                    // TESTE DE OBJETO
                    StorageSession.setConjuntos(target);
                    System.out.print("objeto: " + target.getNome());
                }
                // Encontrando elementos
                if (acharElementoMatcher.find()) {
                    // Nome do elemento
                    String nome = acharElementoMatcher.group();
                    System.out.print("elemento " + nome + " -> ");

                    int value = 0;
                    // O loop pegará o elemento com 1 ou mais digitos.
                    while (numeroMatcher.find()) {
                        value = Integer.parseInt(numeroMatcher.group());
                    }
                    Elemento shot = new Elemento(nome, value);
                    // Instancia e adiciona ao ArrayList
                    System.out.print(value + " ");
                    // TESTE DO OBJETO
                    StorageSession.setElementos(shot);
                    System.out.print("objeto: " + shot.getNome());
                }
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        // PREENCHER O COMBOBOX
        for (Conjunto obj : StorageSession.getConjuntos()) {
            jcbConjunto1.addItem(obj.getNome());
        }
        for (Elemento obj : StorageSession.getElementos()) {
            jcbConjunto1.addItem(obj.getNome());
        }
        for (Conjunto obj : StorageSession.getConjuntos()) {
            jcbConjunto2.addItem(obj.getNome());
        }
        for (Elemento obj : StorageSession.getElementos()) {
            jcbConjunto2.addItem(obj.getNome());
        }

        jcbConjunto1.setSelectedIndex(0);
        jcbConjunto2.setSelectedIndex(0);
        Pattern acharConjunto = Pattern.compile("[A-Z]");
        String select1 = (String) jcbConjunto1.getSelectedItem();
        Matcher acharConjuntoMatcher1 = acharConjunto.matcher(select1);
        String select2 = (String) jcbConjunto2.getSelectedItem();
        Matcher acharConjuntoMatcher2 = acharConjunto.matcher(select2);

        if (acharConjuntoMatcher1.find() && acharConjuntoMatcher2.find()) {
            jbPertence.setEnabled(false);
            jbNaoPertence.setEnabled(false);
            jbUniao.setEnabled(true);
            jbIntersecao.setEnabled(true);
            jbContidoOuIgual.setEnabled(true);
            lbNaoContidoOuIgual.setEnabled(true);
            lbContidoPropriamente.setEnabled(true);
            lbNaoContidoPropriamente.setEnabled(true);
            lbProdutoCartesiano.setEnabled(true);
        } else {
            jbPertence.setEnabled(false);
            jbNaoPertence.setEnabled(false);
            jbUniao.setEnabled(false);
            jbIntersecao.setEnabled(false);
            jbContidoOuIgual.setEnabled(false);
            lbNaoContidoOuIgual.setEnabled(false);
            lbContidoPropriamente.setEnabled(false);
            lbNaoContidoPropriamente.setEnabled(false);
            lbProdutoCartesiano.setEnabled(false);
        }

        if (!(acharConjuntoMatcher1.find()) && acharConjuntoMatcher2.find()) {
            jbPertence.setEnabled(true);
            jbNaoPertence.setEnabled(true);
            jbUniao.setEnabled(false);
            jbIntersecao.setEnabled(false);
            jbContidoOuIgual.setEnabled(false);
            lbNaoContidoOuIgual.setEnabled(false);
            lbContidoPropriamente.setEnabled(false);
            lbNaoContidoPropriamente.setEnabled(false);
            lbProdutoCartesiano.setEnabled(false);
        }
    }//GEN-LAST:event_jbArquivoActionPerformed

    private void jtfArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfArquivoActionPerformed

    private void jbUniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUniaoActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        JOptionPane.showMessageDialog(null, StorageSession.imprimeConjunto(StorageSession.unirConjuntos(obj1, obj2)));
    }//GEN-LAST:event_jbUniaoActionPerformed

    private void jcbConjunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConjunto1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcbConjunto1ActionPerformed

    private void jcbConjunto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConjunto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbConjunto2ActionPerformed

    private void jbPertenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPertenceActionPerformed
        // TODO add your handling code here:
        Elemento elemento = StorageSession.encontraElemento((String) jcbConjunto1.getSelectedItem());
        Conjunto conjunto = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (StorageSession.isPertence(elemento, conjunto)) {
            JOptionPane.showMessageDialog(null, "PERTENCE");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO PERTENCE");
        }
    }//GEN-LAST:event_jbPertenceActionPerformed

    private void jbNaoPertenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNaoPertenceActionPerformed
        Elemento elemento = StorageSession.encontraElemento((String) jcbConjunto1.getSelectedItem());
        Conjunto conjunto = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (!StorageSession.isPertence(elemento, conjunto)) {
            JOptionPane.showMessageDialog(null, "VERDADEIRO");
        } else {
            JOptionPane.showMessageDialog(null, "FALSO");
        }
    }//GEN-LAST:event_jbNaoPertenceActionPerformed

    private void jbIntersecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIntersecaoActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        JOptionPane.showMessageDialog(null, StorageSession.imprimeConjunto(StorageSession.intersecaoConjuntos(obj1, obj2)));

    }//GEN-LAST:event_jbIntersecaoActionPerformed

    private void jbContidoOuIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContidoOuIgualActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (StorageSession.isContido(obj1, obj2)) {
            JOptionPane.showMessageDialog(null, "ESTÁ CONTIDO");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO ESTÁ CONTIDO");
        }
    }//GEN-LAST:event_jbContidoOuIgualActionPerformed

    private void lbNaoContidoOuIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNaoContidoOuIgualActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (!StorageSession.isContido(obj1, obj2)) {
            JOptionPane.showMessageDialog(null, "VERDADEIRO");
        } else {
            JOptionPane.showMessageDialog(null, "FALSO");
        }
    }//GEN-LAST:event_lbNaoContidoOuIgualActionPerformed

    private void lbContidoPropriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbContidoPropriamenteActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (StorageSession.isContidoPropriamente(obj1, obj2)) {
            JOptionPane.showMessageDialog(null, "ESTÁ CONTIDO PROPRIAMENTE");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO ESTÁ CONTIDO PROPRIAMENTE");
        }
    }//GEN-LAST:event_lbContidoPropriamenteActionPerformed

    private void lbNaoContidoPropriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNaoContidoPropriamenteActionPerformed
        // TODO add your handling code here:
        Conjunto obj1 = StorageSession.encontraConjunto((String) jcbConjunto1.getSelectedItem());
        Conjunto obj2 = StorageSession.encontraConjunto((String) jcbConjunto2.getSelectedItem());
        if (!StorageSession.isContidoPropriamente(obj1, obj2)) {
            JOptionPane.showMessageDialog(null, "VERDADEIRO");
        } else {
            JOptionPane.showMessageDialog(null, "FALSO");
        }
    }//GEN-LAST:event_lbNaoContidoPropriamenteActionPerformed

    private void lbProdutoCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbProdutoCartesianoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbProdutoCartesianoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbArquivo;
    private javax.swing.JButton jbContidoOuIgual;
    private javax.swing.JButton jbIntersecao;
    private javax.swing.JButton jbNaoPertence;
    private javax.swing.JButton jbPertence;
    private javax.swing.JButton jbUniao;
    private javax.swing.JComboBox jcbConjunto1;
    private javax.swing.JComboBox jcbConjunto2;
    private javax.swing.JLabel jlSeta;
    private javax.swing.JTextField jtfArquivo;
    private javax.swing.JButton lbContidoPropriamente;
    private javax.swing.JButton lbNaoContidoOuIgual;
    private javax.swing.JButton lbNaoContidoPropriamente;
    private javax.swing.JButton lbProdutoCartesiano;
    private javax.swing.JLabel lblOperacoes;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
