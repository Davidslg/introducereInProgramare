package tema1introducereinprogramare;
import java.util.Scanner;
public class problema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduceți numarul n: ");
		 int n = scanner.nextInt();

		 int sumaPare = 0;
		 for (int i = 0; i < n; i++) {
	            sumaPare += 2 * i; 
	        }

	      
	        System.out.println("Suma primelor " + n + " numere pare este: " + sumaPare);

	        scanner.close(); 
	    }
	}