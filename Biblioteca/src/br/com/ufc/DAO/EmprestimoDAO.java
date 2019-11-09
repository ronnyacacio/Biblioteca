/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

import br.com.ufc.exception.EJRException;
import br.com.ufc.exception.ENEException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.interfece.EmprestimoI;
import br.com.ufc.model.Emprestimo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ronny
 */
public class EmprestimoDAO implements EmprestimoI {
    
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    @Override
    public void alugarLivro(Emprestimo emprestimo) throws LJEException, LLUException {
        if(emprestimo.getAluno().getEmprestimos().size() <= 4)
            if(emprestimo.getLivro().getEmprestimo() != null) {
                emprestimos.add(emprestimo);
            }    
        throw new LLUException();
    }

    @Override
    public List<Emprestimo> buscarEmprestimosPorAluno(int matricula) throws ENEException{
        List<Emprestimo> emprestimosAluno = new ArrayList<Emprestimo>();
        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getAluno().getMatricula() == matricula)
                emprestimosAluno.add(emprestimo);
        }
        if(emprestimosAluno.size() > 0)
            return emprestimosAluno;
        throw new ENEException();
    }
    
    public Emprestimo buscarEmprestimoPorId(int id) throws ENEException {
        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getId() == id)
                return emprestimo;
        }
        throw new ENEException();
    }

    @Override
    public void devolverLivro(int id) throws ENEException{
        List<Emprestimo> empretimosAluno = buscarEmprestimoPorId(id).getAluno().getEmprestimos();
        empretimosAluno.remove(buscarEmprestimoPorId(id));
        buscarEmprestimoPorId(id).getLivro().setEmprestimo(null);
        
        emprestimos.remove(buscarEmprestimoPorId(id));
    }

    @Override
    public List<Emprestimo> buscarTodosOsEmprestimos() throws ENEException {
        if(emprestimos.size() > 0)
            return emprestimos;
        throw new ENEException();
    }
    
    public void renovarEmprestimo(int id) throws EJRException, ENEException {
        Emprestimo emprestimo = buscarEmprestimoPorId(id);
        if(!emprestimo.isRenovacao()) {
            emprestimo.setRenovacao(true);
            Date date = emprestimo.getDevolucao();
            date.setDate(date.getDate() + 7);
            emprestimo.setDevolucao(date);
        }
        throw new EJRException();
    }
    
}
