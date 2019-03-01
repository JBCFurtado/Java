import javax.swing.JOptionPane;
public class impares {
public static void main (String [] args) {
int soma = 0;
int n = 1;
try{
while(n <= 500){
n += 2;
n++;
soma += n;

}
JOptionPane.showMessageDialog(null,"a soma dos impares é: " +soma);
}
catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
}

}
}
