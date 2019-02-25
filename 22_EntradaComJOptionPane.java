/**
 *INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 *Campus Altamira
 *Tecnologia em Análise e Desenvolvimento de Sistemas
 *Programação Orientada a Objetos
 *Professor Paulo César
 */

package entradacomjoptionpane;

/**
 * Entrada utilizando a classe JOption Pane.
 * @author Jobs
 */

import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
	public static void main(String args[]){
		String aux =;
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		try{
			aux = JOptionPane.showInputDialog("Entre com a primeira nota 1");
			nota1 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Entre com a primeira nota 2");
			nota2 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Entre com a primeira nota do trabalho");
			trabalho = Float.parseFloat(aux);

			media = (nota1 + nota2 + trabalho)/3;
			JOptionPane.showMessageDialog(null, "Média: " + media);
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos" + erro.toString());
		}
		System.exit(0);
	}
}