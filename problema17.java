package tema1introducereinprogramare;
import java.util.Scanner;
public class problema17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduceti un numar: ");
	        int numar = scanner.nextInt();

	        int cifraMaxima = 0;

	        while (numar > 0) {
	            int cifra = numar % 10;
	            cifraMaxima = Math.max(cifraMaxima, cifra);
	            numar /= 10;
	        }

	        System.out.println("Cifra maxima este: " + cifraMaxima);
	        scanner.close();
	}

}
