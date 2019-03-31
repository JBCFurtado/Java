import javax.swing.JOptionPane;
public class Produtos {
	public static void main (String [] args) {
	String recebe = "";
	double quantidade1,valor1,quantidade2,valor2,quantidade3,valor3,total;
		try{
		recebe = JOptionPane.showInputDialog("Digite a quantidade 1 :");
		quantidade1 = Double.parseDouble(recebe);

		recebe = JOptionPane.showInputDialog("Digite o valor 1 :");
		valor1 = Double.parseDouble(recebe);

		recebe = JOptionPane.showInputDialog("Digite a quantidade 2 :");
		quantidade2 = Double.parseDouble(recebe);

		recebe = JOptionPane.showInputDialog("Digite o valor 2 :");
		valor2 = Double.parseDouble(recebe);

		recebe = JOptionPane.showInputDialog("Digite a quantidade 3 :");
		quantidade3 = Double.parseDouble(recebe);

		recebe = JOptionPane.showInputDialog("Digite o valor 3 :");
		valor3 = Double.parseDouble(recebe);

		total = ((quantidade1 * valor1) + (quantidade2 * valor2) + (quantidade3 * valor3));

		JOptionPane.showMessageDialog(null,"O valor total é: "+total);

		}
		catch (NumberFormatException erro) {
		JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
		}
		System.exit(0);
	}
}