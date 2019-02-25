import javax.swing.JOptionPane;
public class If{
	public static void main(String args[]){
		String resposta = JOptionPane.show.InputDialog("Forneça sua resposta: S (SIM) ou N (NÃO): ");
		String men = "Letra fornecida: " + resposta;
		if (!resposta.equals("S") && !resposta.equals("N")){
			men = men + "é inválida!"; // nesse caso men = men + é uma concatenação!!
		}
		JOptionPane.showMessageDialog(null, men);
		System.exit(0);

	}
}


/**
 *NULL é a indeterminação de um valor. No contexto da pergunta ele sempre é representado por um ponteiro valendo 0, 
 *ou seja, apontando para um endereço que foi convencionado inválido na memória. Assim o código sabe que não pode acessar nada.
 *Neste contexto o null tem um valor, como indicado acima. Mas ele não aponta para um objeto válido que deveria ter um valor 
 *significativo para o tipo que ele representa. Ele indica que não há um objeto correspondente para aquele valor.
 *Null não é um tipo nestas linguagens. E também não significa ausência de tipo. Ele pode ser um tipo em outras.
 */