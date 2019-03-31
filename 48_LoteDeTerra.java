import javax.swing.JOptionPane;
public class LoteDeTerra {
	public static void main (String [] args) {
	String recebe = "";
	float largura,comprimento,area;
		try{
			recebe = JOptionPane.showInputDialog("Informe o valor da largura :");
			largura = Float.parseFloat(recebe);
			recebe = JOptionPane.showInputDialog("Informe o valor do comprimento :");
			comprimento = Float.parseFloat(recebe);

			area = largura * comprimento;

			JOptionPane.showMessageDialog(null,"A área total do do lote é de: "+area);

			}
			catch (NumberFormatException erro) {
		JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
		}
	System.exit(0);
	}
}