/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

import br.com.ufc.exception.AJCException;
import br.com.ufc.exception.ANEException;
import br.com.ufc.interfece.AlunoI;
import br.com.ufc.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronny
 */
public class AlunoDAO implements AlunoI{
    
    private static List<Aluno> alunos = new ArrayList<Aluno>();

    @Override
    public void cadastrarAluno(Aluno aluno) throws AJCException{
        try {
            buscarAlunoPorMatricula(aluno.getMatricula());
            throw new AJCException();
        } catch(ANEException e) {
            alunos.add(aluno);
        }
    }

    @Override
    public void removerAluno(int matricula) throws ANEException {
        alunos.remove(buscarAlunoPorMatricula(matricula));
    }

    @Override
    public Aluno buscarAlunoPorMatricula(int matricula) throws ANEException {
        for(Aluno aluno : alunos) {
            if(aluno.getMatricula() == matricula)
                return aluno;
        }
        throw new ANEException();
    }
    
    public List<Aluno> alunosComEmprestimos() throws ANEException {
        List<Aluno> alunoss = new ArrayList<Aluno>();
        for(Aluno aluno : alunos) {
            if(aluno.getEmprestimos().size() > 0)
                alunoss.add(aluno);
        }
        if(alunoss.size() > 0)
            return alunoss;
        throw new ANEException();
    }
    
    public List<Aluno> getAluno() throws ANEException {
        if(alunos.size() > 0)
            return alunos;
        throw new ANEException();
    }
    
}
