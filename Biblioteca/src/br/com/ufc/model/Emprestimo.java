/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ronny
 */
public class Emprestimo {
    
    private Aluno aluno;
    private Date aluguel;
    private Date devolucao;
    private List<Livro> livros = new ArrayList<Livro>();
    
    public Emprestimo(){}

    public Emprestimo(Aluno aluno, Date aluguel, Date devolucao) {
        this.aluno = aluno;
        this.aluguel = aluguel;
        this.devolucao = devolucao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getAluguel() {
        return aluguel;
    }

    public void setAluguel(Date aluguel) {
        this.aluguel = aluguel;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    
}
