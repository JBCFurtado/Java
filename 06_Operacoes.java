import javax.swing.JOptionPane; 
public class Operacoes {
	public static void main(String args[]){
	float adicao, subtracao, divisao, multiplicacao, x, y;
	x = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor de X: "));
	y = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor de Y: "));
	adicao =  x + y;
	subtracao =  x - y;
	divisao = x / y;
	multiplicacao = x * y;
	System.out.println("A soma: " + adicao);
	System.out.println("A subtracao:  "+ subtracao);
	System.out.println("A divisao: " + divisao);
	System.out.println("A multiplicacao: " + multiplicacao);
	}
}