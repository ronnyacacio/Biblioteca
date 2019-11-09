/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.model.Emprestimo;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface EmprestimoI {
    public void alugarLivro(Emprestimo emprestimo);
    public List<Emprestimo> buscarEmprestimosPorAluno(int matricula);
    public void devolverLivro(int idEmprestimo);
    public Emprestimo buscarEmprestimoPorId(int id);
    public List<Emprestimo> buscarTodosOsEmprestimos();
    public void renovarEmprestimo(int id);
}
