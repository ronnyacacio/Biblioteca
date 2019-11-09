/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.exception;

/**
 *
 * @author ronny
 */
public class ANEException extends Exception {
    public ANEException() {
        super("ERRO: aluno não encontrado!");
    }
}
