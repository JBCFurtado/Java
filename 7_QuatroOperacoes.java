/*
*4. Utilizando a classe JOptionPane para entrada de dados, crie uma classe que receba 2
*valores numéricos (v1 e v2) e apresente em tela o resultado das 4 operações
*matemáticas básicas entre eles. (soma, sub, mult e div).
*/

import javax.swing.JOptionPane; 
public class QuatroOperacoes {
	public static void main(String args[]){
	float soma, sub, div, mult, v1, v2;
	v1 = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor 1: "));
	v2 = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor 2: "));
	soma =  v1 + v2;
	sub =  v1 - v2;
	div = v1 / v2;
	mult = v1 * v2;
	System.out.println("\nVocê digitou no valor 1: "+v1);
	System.out.println("Você digitou no valor 2: "+v2);
	//v1 = Float.parseFloat (JOptionPane.showInputDialog(v1));
	//v2 = Float.parseFloat (JOptionPane.showInputDialog(v2));
	System.out.println("\nA soma: "+ soma);
	System.out.println("A subtracao:  "+ sub);
	System.out.println("A divisao: " + div);
	System.out.println("A multiplicacao: " + mult);
	}
}