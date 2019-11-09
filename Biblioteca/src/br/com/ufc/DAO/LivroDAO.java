/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

import br.com.ufc.interfece.LivroI;
import br.com.ufc.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronny
 */
public class LivroDAO implements LivroI {

    private static List<Livro> livros = new ArrayList<Livro>();
    
    @Override
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public void removerLivro(Long isbn) {
        livros.remove(buscarLivroPorIsbn(isbn));
    }

    @Override
    public Livro buscarLivroPorIsbn(Long isbn) {
        for(Livro livro : livros) {
            if(livro.getIsbn() == isbn)
                return livro;
        }
        return null;
    }
    
}
