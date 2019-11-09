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
    
    public List<Livro> buscarLivroPorTitulo(String titulo) {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getTitulo().equals(titulo))
                livross.add(livro);
        }
        return livross;
     }
    
    public List<Livro> buscarLivroPorDescricao(String descricao) {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getDescricao().equals(descricao))
                livross.add(livro);
        }
        return livross;
    }
    
    public List<Livro> getLivro() {
        return livros;
    }
    
    public List<Livro> livrosEmprestados() {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getEmprestimo() != null)
                livross.add(livro);
        }
        return livross;
    }
    
    public List<Livro> livrosDisponiveis() {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getEmprestimo() == null)
                livross.add(livro);
        }
        return livross;
    }
    
}
