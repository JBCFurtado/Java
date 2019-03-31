
import javax.swing.JOptionPane;

public class MaiorDeTres {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int maior;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite primeiro numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite terceiro numero: "));
        if (n1 > n2 && n1 > n3){
            maior = n1;
        } 
        
        else if (n2 > n1 && n2 > n3){
            maior = n2;
        } 
        
        else{
            maior = n3;
        }
        
        JOptionPane.showMessageDialog(null,"\nO maior valor e: "+ maior);

    }
}