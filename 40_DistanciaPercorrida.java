import javax.swing.JOptionPane;
public class DistanciaPercorrida {

    public static void main(String[] args) {

        double raio = 3.1416;
        double c = 0, distancia = 0;
        try {
            double voltas = Double.parseDouble
            (JOptionPane.showInputDialog("Informe a quantidade de voltas(Pneu): "));
            double d = Double.parseDouble
            (JOptionPane.showInputDialog("Informe o diâmetro da roda : "));

            c = raio * d / 2;
            distancia = voltas * c;
            JOptionPane.showMessageDialog(null, "\nO comprimento da roda é :" + 
                c + "\nA distância percorrida foi de :" + Math.ceil(distancia));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, 
                "Houve erro na conversão, digite apenas caracteres numericos" + 
                erro.toString());

        }
    }
}