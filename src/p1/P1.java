/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.swing.JFrame;

/**
 *
 * @author hea113
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Check verifier = new Check();
        verifier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        verifier.setResizable(false); 
        verifier.setVisible(true); 
        verifier.setLocation(370, 40); 
        verifier.setTitle("Verifier"); 
    }   
}
