/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.view;

import br.com.ufc.DAO.LivroDAO;
import br.com.ufc.exception.LJCException;
import br.com.ufc.model.Livro;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ronny
 */
public class TelaCadastroLivro extends javax.swing.JInternalFrame {
    
    LivroDAO livroDAO = new LivroDAO();
    File file = null;

    /**
     * Creates new form TelaCadastroLivro
     */
    public TelaCadastroLivro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoIsbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        capa = new javax.swing.JLabel();
        adicionarCapa = new javax.swing.JButton();
        cadastrarLivro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Cadastrar Livro");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Título:");

        campoTitulo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Isbn:");

        campoIsbn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        campoIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIsbnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Descrição:");

        campoAutor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Autor:");

        adicionarCapa.setText("Adicionar capa");
        adicionarCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCapaActionPerformed(evt);
            }
        });

        cadastrarLivro.setText("Cadastrar");
        cadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivroActionPerformed(evt);
            }
        });

        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        campoDescricao.setRows(5);
        jScrollPane1.setViewportView(campoDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adicionarCapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(adicionarCapa)
                        .addGap(63, 63, 63)
                        .addComponent(cadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 147, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivroActionPerformed
        if(campoTitulo.getText().equals("")
            || campoIsbn.getText().equals("")
            || campoDescricao.getText().equals("")
            || campoAutor.getText().equals(""))
                JOptionPane.showMessageDialog(this, "ERRO: preencha todos os campos!");
        else {
            Livro livro = new Livro();
            livro.setTitulo(campoTitulo.getText());
            livro.setAutor(campoAutor.getText());
            livro.setDescricao(campoDescricao.getText());
            try {
                livro.setIsbn(Long.parseLong(campoIsbn.getText()));
                livro.setCapa(file);
                livroDAO.cadastrarLivro(livro);
                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ERRO: o campo Isbn aceita somente números!");
            } catch (LJCException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } finally {
                campoAutor.setText("");
                campoDescricao.setText("");
                campoTitulo.setText("");
                campoIsbn.setText("");
                capa.setIcon(null);
            }
        }
    }//GEN-LAST:event_cadastrarLivroActionPerformed

    private void adicionarCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCapaActionPerformed
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma capa");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opc = arquivo.showOpenDialog(this);
        
        if(opc == JFileChooser.APPROVE_OPTION){
            file = arquivo.getSelectedFile();
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            capa.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(capa.getWidth(), capa.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_adicionarCapaActionPerformed

    private void campoIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIsbnActionPerformed
        
    }//GEN-LAST:event_campoIsbnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarCapa;
    private javax.swing.JButton cadastrarLivro;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoIsbn;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel capa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
