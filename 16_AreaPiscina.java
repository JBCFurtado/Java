/*
 * Calcula o Pre�o e a �rea de uma piscina.
 */
package areadapiscina;
import javax.swing.JOptionPane;
/**
 *
 * @author JOBS
 */
public class AreaDaPiscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float largura,comprimento, profundidade,ValorTotal = 0, pre�o = 45;
    String s;
    
    s = JOptionPane.showInputDialog("Digite o valor da largura: ");
    largura = Float.parseFloat(s);
    
    s = JOptionPane.showInputDialog("Digite o valor do comprimento: ");
    comprimento = Float.parseFloat(s);
    
    s = JOptionPane.showInputDialog("Digite o valor da profundidade: ");
    profundidade = Float.parseFloat(s);
    
    ValorTotal = (largura * comprimento * profundidade) * 45;
    
    JOptionPane.showMessageDialog(null,"Pre�o total = " + ValorTotal + "R$.");
    }
    
}
