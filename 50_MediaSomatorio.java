import javax.swing.JOptionPane;
public class MediaSomatorio {
	public static void main (String [] args) {
	String recebe = "";
	double nota1,nota2,nota3,nota4,media,somatorio,resto1,resto2,resto3,resto4;
		try{
		recebe = JOptionPane.showInputDialog("Informe a nota 1 :");
		nota1 = Double.parseDouble(recebe);
		recebe = JOptionPane.showInputDialog("Informe a nota 2 :");
		nota2 = Double.parseDouble(recebe);
		recebe = JOptionPane.showInputDialog("Informe a nota 3 :");
		nota3 = Double.parseDouble(recebe);
		recebe = JOptionPane.showInputDialog("Informe a nota 4 :");
		nota4 = Double.parseDouble(recebe);
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		somatorio =  (nota1 + nota2 + nota3 + nota4);
		JOptionPane.showMessageDialog(null,"Média das notas é: "+
			media+"\nO somatório das notas é :" +somatorio);
		resto1 = (somatorio / nota1);
		JOptionPane.showMessageDialog(null,"O resto do somatório da nota 1 é: " +resto1);
		resto2 = (somatorio / nota2);
		JOptionPane.showMessageDialog(null,"O resto do somatório da nota 2 é: " +resto2);
		resto3 = (somatorio / nota3);
		JOptionPane.showMessageDialog(null,"O resto do somatório da nota 3 é: " +resto3);
		resto4 = (somatorio / nota4);
		JOptionPane.showMessageDialog(null,"O resto do somatório da nota 4 é: " +resto4);

		}
		catch (NumberFormatException erro) {
		JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numéricos"+
			erro.toString());
		}
	System.exit(0);
	}
}