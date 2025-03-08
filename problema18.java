package tema1introducereinprogramare;
import java.util.Scanner;
public class problema18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Introduceti un numar: ");
		        int numar = scanner.nextInt();

		        int cifraMinima = 9; 
		        while (numar > 0) {
		            cifraMinima = Math.min(cifraMinima, numar % 10); 
		            numar /= 10;
		        }

		        System.out.println("Cifra minima este: " + cifraMinima);
		        scanner.close();
	}

}
