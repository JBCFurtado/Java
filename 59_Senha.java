import javax.swing.JOptionPane;
public class Senha {
public static void main (String [] args) {
String senha, admin;
int s = 1;
try{

JOptionPane.showMessageDialog(null," Digite a sua senha !");
senha = Float.parseFloat(JOptionPane.showInputDialog("digite sua senha : "));
if( senha == admin){
JOptionPane.showMessageDialog(null," Senha valida !");
}else{
JOptionPane.showMessageDialog(null," Senha invalida !");
}
while(s <= 3){
senha = Float.parseFloat(JOptionPane.showInputDialog("digite sua senha : "));
s++;
}
JOptionPane.showMessageDialog(null," Senha Bloqueada !");
}catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
}

}
}