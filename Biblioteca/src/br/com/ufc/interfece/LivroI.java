/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfece;

import br.com.ufc.model.Livro;

/**
 *
 * @author ronny
 */
public interface LivroI {
    public void cadastrarLivro(Livro livro);
    public void removerLivro(Long isbn);
    public Livro buscarLivroPorIsbn(Long isbn);
}
