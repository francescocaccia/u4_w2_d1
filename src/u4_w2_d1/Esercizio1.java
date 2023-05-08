package u4_w2_d1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Esercizio1 {

	public static void main(String[] args) {

		int[] numeri = new int[5];
		Random rand = new Random();
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = rand.nextInt(10) + 1;
		}
		 System.out.println("Array di numeri casuali: " + Arrays.toString(numeri));
		 Scanner scanner = new Scanner(System.in);
	        int posizione, valore;

	        do {
	            System.out.print("Inserire una posizione (da 1 a 5) o 0 per uscire: ");
	            try {
	                posizione = scanner.nextInt();
	                if (posizione < 1 || posizione > 5) {
	                    System.out.println("Posizione non valida. Inserire un valore tra 1 e 5.");
	                    continue;
	                }
	            } catch (Exception e) {
	                System.out.println("Posizione non valida. Inserire un valore numerico intero.");
	                scanner.nextLine();
	                continue;
	            }

	            if (posizione == 0) {
	                break;
	            }

	            System.out.print("Inserire un valore: ");
	            try {
	                valore = scanner.nextInt();
	            } catch (Exception e) {
	                System.out.println("Valore non valido. Inserire un valore numerico intero.");
	                scanner.nextLine();
	                continue;
	            }

	            numeri[posizione - 1] = valore;
	            System.out.println("Nuovo stato dell'array: " + Arrays.toString(numeri));
	        } while (true);

	        System.out.println("Programma terminato.");
	        scanner.close();
	}}
