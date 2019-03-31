import javax.swing.JOptionPane; 
public class Nomes {
	public static void main(String args[]){
	String nome1, nome2, nome3;
	nome1 = (JOptionPane.showInputDialog("Digite primeiro nome: "));
	nome2 = (JOptionPane.showInputDialog("Digite segundo nome: "));
	nome3 = (JOptionPane.showInputDialog("Digite terceiro nome: "));
	System.out.println(nome1 + "  " + nome3);
	System.out.println(nome2);
	}
}