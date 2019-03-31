import javax.swing.JOptionPane; 
public class Operacoes {
	public static void main(String args[]){
	float adicao, subtracao, divisao, multiplicacao, v1, v2;
	v1 = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor de v1: "));
	v2 = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor de v2: "));
	adicao =  v1 + v2;
	subtracao =  v1 - v2;
	divisao = v1 / v2;
	multiplicacao = v1 * v2;
	System.out.println("A soma: " + adicao);
	System.out.println("A subtracao:  "+ subtracao);
	System.out.println("A divisao: " + divisao);
	System.out.println("A multiplicacao: " + multiplicacao);
	}
}