package u4_w2_d1;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisca il numero di km percorsi ");
		int valoreKm = scanner.nextInt();
		System.out.println("inserisca il numero di litri consumati dalla sua auto ");
		int valoreLitri = scanner.nextInt();
		

		try {
		    System.out.println(valoreKm / valoreLitri);
		} catch (ArithmeticException e) {
		    System.out.println("Errore: divisione per zero");
		}
		finally {
		    scanner.close();
		}
	}
}
