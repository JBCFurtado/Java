/**
 *INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 *Campus Altamira
 *Tecnologia em Análise e Desenvolvimento de Sistemas
 *Programação Orientada a Objetos
 *Professor Paulo César
 */

package entradacomscanner;

/**
 * Entrada utilizando a classe Scanner.
 * @author Jobs
 */

import java.util.*;
public class EntradaComScanner {
	public static void main(String args[]){
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		try {
			System.out.println("Entre com a nota 1: ");
			Scanner sc = new Scanner(System.in);
			nota1 = sc.nextFloat();

			System.out.println("Entre com a nota 2: ");
			Scanner sc = new Scanner(System.in);
			nota2 = sc.nextFloat();

			System.out.println("Entre com a nota do trabalho: ");
			Scanner sc = new Scanner(System.in);
			trabalho = sc.nextFloat();

			media = (nota1 + nota2 + trabalho)/3;
			System.out.println("Média: " + media);
		}
		catch (NumberFormatException erro){
			System.out.println("Houve um erro na conversão, digite apenas caracteres numericos" + erro.toString());
		}		
	}
}