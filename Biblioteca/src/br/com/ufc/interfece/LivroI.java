/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.exception.LJCException;
import br.com.ufc.exception.LNEException;
import br.com.ufc.model.Livro;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface LivroI {
    public void cadastrarLivro(Livro livro) throws LJCException;
    public void removerLivro(Long isbn) throws LNEException;
    public Livro buscarLivroPorIsbn(Long isbn) throws LNEException;
    public List<Livro> buscarLivroPorTitulo(String titulo) throws LNEException;
    public List<Livro> buscarLivroPorDescricao(String descricao) throws LNEException;
    public List<Livro> getLivro()throws LNEException;
    public List<Livro> livrosEmprestados()throws LNEException;
    public List<Livro> livrosDisponiveis()throws LNEException;
}
