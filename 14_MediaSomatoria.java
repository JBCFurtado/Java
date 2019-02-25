/**
 * Média mais somatória de quatro numeros
 */
package quatronumeros;
import javax.swing.JOptionPane;
/**
 *
 * @author JOBS
 */
public class MediaSomatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   float num1,num2,num3,num4,somatorio = 0;
   String s;
   
        s = JOptionPane.showInputDialog("Digite o numero 1:");
        num1 = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Digite o numero 2:");
        num2 = Float.parseFloat(s);
        
         s = JOptionPane.showInputDialog("Digite o numero 3:");
        num3 = Float.parseFloat(s);
        
         s = JOptionPane.showInputDialog("Digite o numero 4:");
        num4 = Float.parseFloat(s);
        
        somatorio += num1 + num2 + num3 + num4; 
   
   JOptionPane.showMessageDialog(null,
          "Media = " + somatorio/4 + "." 
    + "\nSomatorio = " + somatorio + "." 
    + "\nModulo 1 = " + somatorio % num1 + "." 
    + "\nModulo 2 = " + somatorio % num2 + "." 
    + "\nModulo 3 = " + somatorio % num3 + "." 
    + "\nModulo 4 = " + somatorio % num4 + "." );
    }
}
