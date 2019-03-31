/**
 *1_Utilizando a classe JOptionPane para entrada de dados, crie uma classe que receba o
 *valor de um produto e um código de desconto. Obs.: O desconto deve ser calculado
 *conforme a tabela abaixo:
 */

import javax.swing.JOptionPane;
public class Senha {
public static void main (String [] args) 
{
int cont = 0;
while (cont < 3)
{
String senha = JOptionPane.showInputDialog("Insira a Senha");
if (senha.equals("Admin"))
{
"Senha valida"
}
else 
{
"Senha invalida"
}
if (++ cont == 3)
{
"cartao cancelado!"
}	
}
}
