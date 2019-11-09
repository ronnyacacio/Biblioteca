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
    
    private static int serial = 0;
    
    private int id;
    private Aluno aluno;
    private Livro livro;
    private Date aluguel;
    private Date devolucao;
    
    public Emprestimo(){this.id = ++serial;}

    public Emprestimo(Aluno aluno, Livro livro, Date aluguel, Date devolucao) {
        this.id = ++serial;
        this.aluno = aluno;
        this.aluguel = aluguel;
        this.devolucao = devolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }   
    
}
