
import java.util.Scanner;

public class ContaBancaria {
  	public static void main (String [] args){
	double saldo = 0;
	double deposito,saque,novosaldo,saldofinal;
		try{
		Scanner sc = new Scanner(System.in);

		System.out.println("Seu saldo atual é de: R$"+saldo);
		System.out.print("Informe um valor para o deposito: ");
 		sc = new Scanner(System.in);
		deposito = sc.nextDouble();
		novosaldo = saldo + deposito;
		System.out.println("O novo saldo é de : R$"+novosaldo);
		System.out.print("Informe um valor para o saque: ");
 		sc = new Scanner(System.in);
		saque = sc.nextDouble();
		saldofinal = novosaldo - saque; 
		System.out.println("Seu saldo final é: R$"+saldofinal);
		}
		catch (NumberFormatException erro){
	System.out.println("Houve erro na conversão, digite apenas caracteres numericos"+erro.toString());
		}
	}
}