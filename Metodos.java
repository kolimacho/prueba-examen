package Content;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int contarLetra() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("INTRODUCE UNA FRASE: ");
		String frase = sc.nextLine().toLowerCase();
		
		System.out.print("INTRODUCE UNA letra: ");
		char letra = sc.nextLine().toLowerCase().charAt(0);
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				contador ++;
			}
		}
		return contador;
	}
}
