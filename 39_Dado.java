package dado;

import java.util.Random;

public class Dado {

    public static void main(String[] args) {
    	for (int i = 0; i < 6; i++) {
    	int num = new Random().nextInt(5) + 1;
        System.out.println(num);
        }
    }   
}