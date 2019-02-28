/**
 *2_Faça uma classe que receba 4 idades diferentes e mostre a menor e a maior idades,
 *conforme indica a imagem:
 */

import javax.swing.*;
public class MaiorMenor {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Minino 5\nMaximo 10!\n");
		double Array[]= new double [11];
		double maior=0, menor=0, media=0, diferenca=0;
		int RESP =0,a=0,i;
		for(i=1;i<11;i++){
			Array[i]=Double.parseDouble(JOptionPane.showInputDialog("Entre com o: "+(i)+" Numero"));			
			a++;
			if((i>=5)&&(i<10)){
				RESP = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar digitando?\n\n1 - SIM\n2 - NAO"));
				if(RESP==2)
					break;
			}					
		}
		maior = Array[i];
		menor = Array[i];
		for(i = i; i<a; i++){
			if(Array[i]>maior)
				maior = Array[i];
			if(Array[i]<menor)
				menor = Array[i];
		}
		JOptionPane.showMessageDialog(null, "Maior e: " + maior);
		JOptionPane.showMessageDialog(null, "O menor e: " + menor);	
	}
}