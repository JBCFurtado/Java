import javax.swing.*;
public class IfComElseAninhado{
	public static void main(String args[]){
		String diaDaSemana = JOptionPane.showInputDialog("Forneça um valor inteiro 1 e 7");
		if (diaDaSemana != null){
			try{
				int dia = Integer.parseInt(diaDaSemana);
				if (dia == 1)
					diaDaSemana = "Domingo";
				else if (dia == 2)
					diaDaSemana = "Segunda";
				else if (dia == 3)
					diaDaSemana = "Terça";
				else if (dia == 4)
					diaDaSemana = "Quarta";
				else if (dia == 5)
					diaDaSemana = "Quinta";
				else if (dia == 6)
					diaDaSemana = "Sexta";
				else if (dia == 7)
					diaDaSemana = "Sabado";
				else
					diaDaSemana = "Dia da semanda desconhecido!";

				JOptionPane.showMessageDialog(null, diaDaSemana);
			}	catch (NumberFormatException erro){
				JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos - \n" + erro.toString());
			}
		}
		System.exit(0);
	}	
}