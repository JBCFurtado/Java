import javax.swing.JOptionPane;
public class opmatematicas {
public static void main (String [] args) {


try{

float n1 = Float.parseFloat(JOptionPane.showInputDialog("digite um número :"));
float n2 = Float.parseFloat(JOptionPane.showInputDialog("digite um número :"));

JOptionPane.showMessageDialog(null,"Caro ususario a escolha da operação matemática deve ser feita com letra maiscúla.");
char operacao = Integer.parseInt(JOptionPane.showInputDialog("selecione uma das opções: A-Somar, B-Subtrair, C-Multiplicar, D-Dividir : " ));
double total = 0;
switch (operacao){

case A:
total = (n1 + n2);
JOptionPane.showMessageDialog(null,"Resultado: " +total);
break;

case B:
total = (n1 - n2);
JOptionPane.showMessageDialog(null,"Resultado: " +total);
break;

case C:
total = (n1 * n2);
JOptionPane.showMessageDialog(null,"Resultado: " +total);
break;

case D:
total = (n1 / n2);
JOptionPane.showMessageDialog(null,"Resultado: " +total);
break;

case E:
default:
JOptionPane.showMessageDialog(null,"digite uma codigo valido");
break;
}
}
catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
}

}
}
