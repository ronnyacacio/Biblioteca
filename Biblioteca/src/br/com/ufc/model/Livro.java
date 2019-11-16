/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.model;

import java.io.File;

/**
 *
 * @author ronny
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private Long isbn;
    private String descricao;
    private Emprestimo emprestimo;
    private File capa;

    public Livro(){}
    
    public Livro(String titulo, String autor, Long isbn, String descricao, File capa) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricao = descricao;
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public File getCapa() {
        return capa;
    }

    public void setCapa(File capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", descricao=" + descricao + ", emprestimo=" + emprestimo + ", capa=" + capa + '}';
    }
       
}
