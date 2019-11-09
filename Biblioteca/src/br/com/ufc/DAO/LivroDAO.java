/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.DAO;

import br.com.ufc.exception.LJCException;
import br.com.ufc.exception.LNEException;
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
    public void cadastrarLivro(Livro livro) throws LJCException {
        try {
            buscarLivroPorIsbn(livro.getIsbn());
            throw new LJCException();
        } catch(LNEException e) {
            livros.add(livro);
        }
    }

    @Override
    public void removerLivro(Long isbn) throws LNEException {
        livros.remove(buscarLivroPorIsbn(isbn));
    }

    @Override
    public Livro buscarLivroPorIsbn(Long isbn) throws LNEException {
        for(Livro livro : livros) {
            if(livro.getIsbn() == isbn)
                return livro;
        }
        throw new LNEException();
    }
    
    public List<Livro> buscarLivroPorTitulo(String titulo) throws LNEException {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getTitulo().equals(titulo))
                livross.add(livro);
        }
        if(livross.size() > 0)
            return livross;
        throw new LNEException();
     }
    
    public List<Livro> buscarLivroPorDescricao(String descricao) throws LNEException {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getDescricao().equals(descricao))
                livross.add(livro);
        }
        if(livross.size() > 0)
            return livross;
        throw new LNEException();
    }
    
    public List<Livro> getLivro() throws LNEException {
        if(livros.size() > 0)
            return livros;
        throw new LNEException();
    }
    
    public List<Livro> livrosEmprestados() throws LNEException {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getEmprestimo() != null)
                livross.add(livro);
        }
        if(livross.size() > 0)
            return livross;
        throw new LNEException();
    }
    
    public List<Livro> livrosDisponiveis() throws LNEException {
        List<Livro> livross = new ArrayList<Livro>();
        for(Livro livro : livros) {
            if(livro.getEmprestimo() == null)
                livross.add(livro);
        }
        if(livross.size() > 0)
            return livross;
        throw new LNEException();
    }
    
}
