/*
 * Crie um programa que peça a idade de uma pessoa e depois mostre na tela o ano em que ela nasceu.
 * Use a classe Scanner e a classe Calendar e o método get(Calendar.YEAR) desta classe.
 */
package entrada;

import java.util.Scanner;
import java.util.Calendar;

public class Entrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int ano_atual;
        int ano_nascimento;
        
        // pergunta a idade e armazena
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        //Criando um objeto do tipo Calendar(calendario) que armazena ano atual.
        Calendar calendario = Calendar.getInstance();
        //Método get(Calendar.YEAR), que retorna um inteiro com o ano,
        //e armazeno esse inteiro na variável 'ano'.
        ano_atual = calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        System.out.printf("Você nasceu em " + ano_nascimento + "\n");
    }
}