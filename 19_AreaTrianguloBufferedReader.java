/*
*1. Construa uma classe em java que calcule a área de um triângulo retângulo. 
*A classe deve pedir ao usuário que insira os valores de entrada (base e altura) 
*através da classe BufferedReader e mostre sua área. Não se esqueça de fazer o 
*tratamento de erros através do try catch.
*Obs.: A área de um triângulo retângulo é calculada através da formula Base * Altura / 2.
*/

import java.io.*;
public class AreaTrianguloBufferedReader{
	public static void main (String args[]){
		String s = "";
		Float base, altura, area;
		BufferedReader dado;
		try {
			System.out.println("Digite o Valor da Base: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			base = Float.parseFloat(s);
			System.out.println("Digite o Valor da Altura: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			altura = Float.parseFloat(s);
			area = (base*altura)/2;
			System.out.println("A área do Triângulo é: "+ area);
		}
    			catch(IOException erro){
    			System.out.println("Houve erro na entrada de dados! Tente novamente."+ erro.toString());
        	}
    			catch(NumberFormatException erro){
    			System.out.println("Houve erro na conversão, digite apenas caracteres numéricos."+ erro.toString());
   			}
   	}   	
}