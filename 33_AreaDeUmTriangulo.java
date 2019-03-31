import java.io.*;
public class AreaDeUmTriangulo{
	public static void main (String args[]){
		String s = "";
		Float base, altura, area;
		BufferedReader dado;
		try {
			System.out.print("Digite o Valor da Base: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			base = Float.parseFloat(s);
			System.out.print("Digite o Valor da Altura: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			altura = Float.parseFloat(s);
			area = (base*altura)/2;
			System.out.println("A área do Triângulo é: "+ area);
		}
    			catch(IOException erro){
    			System.out.println("Houve erro na entrada de dados! Tente novamente."+ erro.toString());
        	}
    			catch(NumberFormatException erro){
    			System.out.println("Houve erro na conversão, digite apenas caracteres numéricos."+ erro.toString());
   			}
   	}   	
}