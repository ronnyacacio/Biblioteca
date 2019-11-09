/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.exception.EJRException;
import br.com.ufc.exception.ENEException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.model.Emprestimo;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface EmprestimoI {
    public void alugarLivro(Emprestimo emprestimo) throws LJEException, LLUException;
    public List<Emprestimo> buscarEmprestimosPorAluno(int matricula) throws ENEException;
    public void devolverLivro(int idEmprestimo) throws ENEException;
    public Emprestimo buscarEmprestimoPorId(int id) throws ENEException;
    public List<Emprestimo> buscarTodosOsEmprestimos() throws ENEException;
    public void renovarEmprestimo(int id) throws EJRException, ENEException;
}
