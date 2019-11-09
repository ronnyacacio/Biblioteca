/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.model.Livro;
import java.util.List;

/**
 *
 * @author ronny
 */
public interface LivroI {
    public void cadastrarLivro(Livro livro);
    public void removerLivro(Long isbn);
    public Livro buscarLivroPorIsbn(Long isbn);
    public List<Livro> buscarLivroPorTitulo(String titulo);
    public List<Livro> buscarLivroPorDescricao(String descricao);
    public List<Livro> getLivro();
    public List<Livro> livrosEmprestados();
    public List<Livro> livrosDisponiveis();
}
