/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.exception.AJCException;
import br.com.ufc.exception.ANEException;
import br.com.ufc.model.Aluno;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface AlunoI {
    public void cadastrarAluno(Aluno aluno) throws AJCException;
    public void removerAluno(int matricula) throws ANEException;
    public Aluno buscarAlunoPorMatricula(int matricula) throws ANEException;
    public List<Aluno> alunosComEmprestimos() throws ANEException;
    public List<Aluno> getAluno() throws ANEException;
    public Aluno buscarAlunoPorCpf(String cpf) throws ANEException;
}
