/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.view;

import br.com.ufc.DAO.AlunoDAO;
import br.com.ufc.exception.ANEException;
import br.com.ufc.model.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronny
 */
public class TelaVizualizarAluno extends javax.swing.JInternalFrame {
    
    AlunoDAO alunoDAO = new AlunoDAO();

    /**
     * Creates new form TelaListarAluno
     */
    public TelaVizualizarAluno() {
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
        jLabel2 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mostrarAlunos = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Vizualizar Alunos");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Matrícula:");

        campoMatricula.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("CPF:");

        mostrarAlunos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        mostrarAlunos.setText("Mostrar");
        mostrarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlunosActionPerformed(evt);
            }
        });

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Matrícula", "Curso", "CPF", "Telefone", "Data de nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel4.setText("* Digite a matrícula ou o CPF do aluno para buscá-lo, caso não digite nada todos os alunos cadastrados serão listados.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(871, 871, 871))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mostrarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(463, 463, 463))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(mostrarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlunosActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) Tabela.getModel();
        while(tabela.getRowCount() > 0)
            tabela.removeRow(0);
        if(campoCpf.getText().equals("   .   .   -  ") || campoMatricula.getText().equals("")) {
            try {
                List<Aluno> alunos = alunoDAO.getAluno();
                for(Aluno aluno : alunos) {
                    int dia = aluno.getDataNascimento().getDate();
                    int mes = aluno.getDataNascimento().getMonth() + 1;
                    int ano = aluno.getDataNascimento().getYear() + 1900;
                    tabela.addRow(new Object[] {aluno.getNome(), aluno.getMatricula(), aluno.getCurso(), aluno.getCpf(), aluno.getTelefone(), dia + "/" + mes + "/" + ano});
                }
            } catch (ANEException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }    
        else if(campoCpf.getText().equals("   .   .   -  ")) {
            try {
                Aluno aluno = alunoDAO.buscarAlunoPorMatricula(Integer.parseInt(campoMatricula.getText()));
                int dia = aluno.getDataNascimento().getDate();
                int mes = aluno.getDataNascimento().getMonth() + 1;
                int ano = aluno.getDataNascimento().getYear() + 1900;
                tabela.addRow(new Object[] {aluno.getNome(), aluno.getMatricula(), aluno.getCurso(), aluno.getCpf(), aluno.getTelefone(), dia + "/" + mes + "/" + ano});
            } catch (ANEException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else if(campoMatricula.getText().equals("")) {
            try {
                Aluno aluno = alunoDAO.buscarAlunoPorCpf(campoCpf.getText());
                int dia = aluno.getDataNascimento().getDate();
                int mes = aluno.getDataNascimento().getMonth() + 1;
                int ano = aluno.getDataNascimento().getYear() + 1900;
                tabela.addRow(new Object[] {aluno.getNome(), aluno.getMatricula(), aluno.getCurso(), aluno.getCpf(), aluno.getTelefone(), dia + "/" + mes + "/" + ano});
            } catch (ANEException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            try {
                Aluno aluno = alunoDAO.buscarAlunoPorMatricula(Integer.parseInt(campoMatricula.getText()));
                int dia = aluno.getDataNascimento().getDate();
                int mes = aluno.getDataNascimento().getMonth() + 1;
                int ano = aluno.getDataNascimento().getYear() + 1900;
                tabela.addRow(new Object[] {aluno.getNome(), aluno.getMatricula(), aluno.getCurso(), aluno.getCpf(), aluno.getTelefone(), dia + "/" + mes + "/" + ano});
            } catch (ANEException ex) {
                try {
                    Aluno aluno = alunoDAO.buscarAlunoPorCpf(campoCpf.getText());
                    int dia = aluno.getDataNascimento().getDate();
                    int mes = aluno.getDataNascimento().getMonth() + 1;
                    int ano = aluno.getDataNascimento().getYear() + 1900;
                    tabela.addRow(new Object[] {aluno.getNome(), aluno.getMatricula(), aluno.getCurso(), aluno.getCpf(), aluno.getTelefone(), dia + "/" + mes + "/" + ano});
                } catch (ANEException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_mostrarAlunosActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarAlunos;
    // End of variables declaration//GEN-END:variables
}
