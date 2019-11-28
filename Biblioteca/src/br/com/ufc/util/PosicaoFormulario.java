/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.util;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ronny
 */
public class PosicaoFormulario {
    
    public void abrirFormulario(JInternalFrame janela, JLabel desktop) {
        int wDesk = desktop.getWidth();
        int hDesk = desktop.getHeight();
        janela.setSize((int) (wDesk*0.8), (int) (hDesk*0.7));
        int wJane = janela.getWidth();
        int hJane = janela.getHeight();
        janela.setLocation(wDesk / 2 - wJane / 2, hDesk / 2 - hJane /2);
        desktop.add(janela);
        janela.setVisible(true);
    }
}
