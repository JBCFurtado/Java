/**
 *1_Utilizando a classe JOptionPane para entrada de dados, crie uma classe que receba o
 *valor de um produto e um código de desconto. Obs.: O desconto deve ser calculado
 *onforme a tabela abaixo:
 *Utilizando a estrutura switch-case, apresente em tela o novo valor do produto depois de
 *ser realizado o desconto. Caso o código do desconto fornecido não exista, deve ser
 *emitida uma mensagem de aviso.
 */

import javax.swing.JOptionPane;
public class Desconto
{
	public static void main(String [] args)
	{

		try
		{
			float valProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
			int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));

			String mensagem ="";

			switch (codProduto)
			{
				case 1: mensagem += valProduto - (valProduto*0.05); 
				break;

				case 2: mensagem += valProduto - (valProduto*0.10); 
				break;

				case 3: mensagem += valProduto - (valProduto*0.20); 
				break;

				case 4: mensagem += valProduto - (valProduto*0.50); 
				break;

				default: mensagem = "Codigo invalido!";
			}

			JOptionPane.showMessageDialog(null, "O Valor do Produto foi: " +valProduto+ "\nO codigo escolhido foi: " +codProduto+ "\nO valor com Desconto e: " + mensagem);
		}
		
		catch (NumberFormatException erro)
				{
					JOptionPane.showMessageDialog(null, "Codigo invalido" + erro.toString());
				}	
	}
}