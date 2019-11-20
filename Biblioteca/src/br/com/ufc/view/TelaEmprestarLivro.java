/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.view;

import br.com.ufc.DAO.AlunoDAO;
import br.com.ufc.DAO.EmprestimoDAO;
import br.com.ufc.DAO.LivroDAO;
import br.com.ufc.exception.ANEException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.exception.LNEException;
import br.com.ufc.model.Aluno;
import br.com.ufc.model.Emprestimo;
import br.com.ufc.model.Livro;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;

/**
 *
 * @author ronny
 */
public class TelaEmprestarLivro extends javax.swing.JInternalFrame {
    
    EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    AlunoDAO alunoDAO = new AlunoDAO();
    LivroDAO livroDAO = new LivroDAO();

    /**
     * Creates new form TelaEmprestarLivro
     */
    public TelaEmprestarLivro() {
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
        campoMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoIsbn = new javax.swing.JTextField();
        emprestarLivro = new javax.swing.JButton();

        setClosable(true);
        setTitle("Emprestar Livro");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Matrícula do aluno:");

        campoMatricula.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Isbn do livro:");

        emprestarLivro.setText("Emprestar");
        emprestarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(campoIsbn))
                    .addComponent(emprestarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(emprestarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emprestarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestarLivroActionPerformed
        if(campoIsbn.getText().equals("") || campoMatricula.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Preecha todos os campos!");
        else {
            Emprestimo emprestimo = new Emprestimo();
            try {
                Aluno aluno = alunoDAO.buscarAlunoPorMatricula(Integer.parseInt(campoMatricula.getText()));
                Livro livro = livroDAO.buscarLivroPorIsbn(Long.parseLong(campoIsbn.getText()));
                emprestimo.setAluno(aluno);
                emprestimo.setLivro(livro);
                
                Date hoje = new Date();
                emprestimo.setAluguel(hoje);
                
                Date devolucao = new Date();
                devolucao.setDate(devolucao.getDate() + 15);
                emprestimo.setDevolucao(devolucao);
                
                emprestimoDAO.alugarLivro(emprestimo);
                JOptionPane.showMessageDialog(this, "Emprestimo realizado com sucesso! Seu id é: " + emprestimo.getId());
            } catch (ANEException | LNEException | LJEException | LLUException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Os campos só aceitam números!");
            }
        }
    }//GEN-LAST:event_emprestarLivroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoIsbn;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JButton emprestarLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}