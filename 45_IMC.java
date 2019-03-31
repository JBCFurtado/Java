import javax.swing.JOptionPane;  
public class IMC {  
    public static void main(String[] args) {
    	float peso, altura, imc;
          peso = Float.parseFloat(JOptionPane.showInputDialog("DIGITE SEU PESO: "));
          altura = Float.parseFloat(JOptionPane.showInputDialog("DIGITE SUA ALTURA: "));
          imc = peso /(altura*altura);   
          JOptionPane.showMessageDialog(null,"Imc ="+imc);  
          if (imc <18.5){  
          JOptionPane.showMessageDialog(null,"ABAIXO DO NORMAL!");
          }
          else if (imc >=18.5&&imc<=24.4){   
          JOptionPane.showMessageDialog(null,"PESO IDEAL");
          }  
          else if (imc>=24.5&&imc<=29.9){          
          JOptionPane.showMessageDialog(null,"PRÉ-OBSIDADE!");
          }  
          else if (imc>=30&&imc<=34.9){  
          JOptionPane.showMessageDialog(null,"OBSIDADE I!");
          }  
          else if(imc>=35&&imc<=39.9){  
          JOptionPane.showMessageDialog(null,"OBESIDADE II!");
          }  
          else if(imc>39.9){  
          JOptionPane.showMessageDialog(null,"OBSIDADE III(MÓBIDA)!");
      
         }       
     }
}
