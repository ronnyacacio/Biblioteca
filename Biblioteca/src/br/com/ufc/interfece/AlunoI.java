/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.model.Aluno;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface AlunoI {
    public void cadastrarAluno(Aluno aluno);
    public void removerAluno(int matricula);
    public Aluno buscarAlunoPorMatricula(int matricula);
}
