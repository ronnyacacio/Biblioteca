/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

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
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void removerAluno(int matricula) {
        alunos.remove(buscarAlunoPorMatricula(matricula));
    }

    @Override
    public Aluno buscarAlunoPorMatricula(int matricula) {
        for(Aluno aluno : alunos) {
            if(aluno.getMatricula() == matricula)
                return aluno;
        }
        return null;
    }
    
    public List<Aluno> alunosComEmprestimos() {
        List<Aluno> alunoss = new ArrayList<Aluno>();
        for(Aluno aluno : alunos) {
            if(aluno.getEmprestimos().size() > 0)
                alunoss.add(aluno);
        }
        return alunoss;
    }
    
    public List<Aluno> getAluno() {
        return alunos;
    }
    
}
