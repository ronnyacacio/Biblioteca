/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.view;

import br.com.ufc.DAO.AlunoDAO;
import br.com.ufc.DAO.EmprestimoDAO;
import br.com.ufc.exception.ANEException;
import br.com.ufc.exception.ENEException;
import br.com.ufc.model.Aluno;
import br.com.ufc.model.Emprestimo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronny
 */
public class TelaVizualizarEmprestimo extends javax.swing.JInternalFrame {
    
    EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    AlunoDAO alunoDAO = new AlunoDAO();

    /**
     * Creates new form TelaListarEmprestimo
     */
    public TelaVizualizarEmprestimo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        todosEmprestimos = new javax.swing.JButton();
        buscarEmprestimoPorAluno = new javax.swing.JButton();
        campoMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Vizualizar Empréstimos");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Aluno", "Livro", "Data de aluguel", "Data de devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        todosEmprestimos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        todosEmprestimos.setText("Mostrar todos");
        todosEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosEmprestimosActionPerformed(evt);
            }
        });

        buscarEmprestimoPorAluno.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        buscarEmprestimoPorAluno.setText("Buscar por aluno");
        buscarEmprestimoPorAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmprestimoPorAlunoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Matrícula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarEmprestimoPorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(todosEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarEmprestimoPorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todosEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarEmprestimoPorAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmprestimoPorAlunoActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) Tabela.getModel();
        while(tabela.getRowCount() > 0)
            tabela.removeRow(0);
        if(campoMatricula.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        else {
            try {
                List<Emprestimo> emprestimos = emprestimoDAO.buscarEmprestimosPorAluno(Integer.parseInt(campoMatricula.getText()));
                for(Emprestimo emprestimo : emprestimos) {
                    int diaA = emprestimo.getAluguel().getDate();
                    int mesA = emprestimo.getAluguel().getMonth() + 1;
                    int anoA = emprestimo.getAluguel().getYear() + 1900;
                    
                    int diaD = emprestimo.getDevolucao().getDate();
                    int mesD = emprestimo.getDevolucao().getMonth() + 1;
                    int anoD = emprestimo.getDevolucao().getYear() + 1900;
                    tabela.addRow(new Object[] { emprestimo.getId(), emprestimo.getAluno().getMatricula(), emprestimo.getLivro().getIsbn(), diaA + "/" + mesA + "/" + anoA, diaD + "/" + mesD + "/" + anoD });
                }
            } catch (ENEException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } finally {
                campoMatricula.setText("");
            }
        }
    }//GEN-LAST:event_buscarEmprestimoPorAlunoActionPerformed

    private void todosEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosEmprestimosActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) Tabela.getModel();
        while(tabela.getRowCount() > 0)
            tabela.removeRow(0);
        try {
            List<Emprestimo> emprestimos = emprestimoDAO.buscarTodosOsEmprestimos();
            for(Emprestimo emprestimo : emprestimos) {
                int diaA = emprestimo.getAluguel().getDate();
                int mesA = emprestimo.getAluguel().getMonth() + 1;
                int anoA = emprestimo.getAluguel().getYear() + 1900;
                 
                int diaD = emprestimo.getDevolucao().getDate();
                int mesD = emprestimo.getDevolucao().getMonth() + 1;
                int anoD = emprestimo.getDevolucao().getYear() + 1900;
                tabela.addRow(new Object[] { emprestimo.getId(), emprestimo.getAluno().getMatricula(), emprestimo.getLivro().getIsbn(), diaA + "/" + mesA + "/" + anoA, diaD + "/" + mesD + "/" + anoD });
            }
        } catch (ENEException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_todosEmprestimosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton buscarEmprestimoPorAluno;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton todosEmprestimos;
    // End of variables declaration//GEN-END:variables
}
