import javax.swing.JOptionPane;
public class opmatematicas {
public static void main (String [] args) {


try{

float n1 = Float.parseFloat(JOptionPane.showInputDialog("digite um n�mero :"));
float n2 = Float.parseFloat(JOptionPane.showInputDialog("digite um n�mero :"));

JOptionPane.showMessageDialog(null,"Caro ususario a escolha da opera��o matem�tica deve ser feita com letra maisc�la.");
char operacao = Integer.parseInt(JOptionPane.showInputDialog("selecione uma das op��es: A-Somar, B-Subtrair, C-Multiplicar, D-Dividir : " ));
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
