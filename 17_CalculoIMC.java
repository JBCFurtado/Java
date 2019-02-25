/*3.Utilizando a classe JOptionPane para entrada de dados, crie uma classe que realize o calculo do 
*peso ideal IMC. 
*Para o calculo utilize a fórmula IMC = peso / altura2. A classe deve solicitar o peso e altura do
*usuário, fazer o cálculo e apresentar a mensagem correspondente ao resultado. 
*Considere a seguinte tabela para implementação:
****Menor que 18,5 = Abaixo do normal
****Entre 18,5 e 24,4 = Peso Ideal
****Entre 24,5 e 29,9 Pré-obsidade
****Entre 30 e 34,9 = Obsidade classe I
****Entre 35 e 39,9 = Obsidade classe II
****Maior que 39,9 = Obsidade clase II (Móbida)
*/
import javax.swing.JOptionPane;  
public class CalculoIMC {  
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