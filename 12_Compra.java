/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import javax.swing.JOptionPane;

/**
 *
 * @author JOBS
 */
public class PrimeiroPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float quantidade = 0,valor = 0, total= 0;
    String a;
    
    for(int i = 0; i <= 2; i++){
        a = JOptionPane.showInputDialog("Digite a quantidade:");
        quantidade = Float.parseFloat(a);
       
        a = JOptionPane.showInputDialog("Digite o valor:");
        valor = Float.parseFloat(a);
        total += quantidade * valor;
    }
    JOptionPane.showMessageDialog(null,"Total da compra = R$ " + total + ".");
    }
    
}