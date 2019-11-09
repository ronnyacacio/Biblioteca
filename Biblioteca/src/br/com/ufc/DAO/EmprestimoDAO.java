/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

import br.com.ufc.interfece.EmprestimoI;
import br.com.ufc.model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronny
 */
public class EmprestimoDAO implements EmprestimoI {
    
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    @Override
    public void alugarLivro(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    @Override
    public List<Emprestimo> buscarEmprestimosPorAluno(int matricula) {
        List<Emprestimo> emprestimosAluno = new ArrayList<Emprestimo>();
        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getAluno().getMatricula() == matricula)
                emprestimosAluno.add(emprestimo);
        }
        return emprestimosAluno;
    }
    
    public Emprestimo buscarEmprestimoPorId(int id) {
        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getId() == id)
                return emprestimo;
        }
        return null;
    }

    @Override
    public void devolverLivro(int id) {
        emprestimos.remove(buscarEmprestimoPorId(id));
    }

    @Override
    public List<Emprestimo> buscarTodosOsEmprestimos() {
        return emprestimos;
    }
    
}