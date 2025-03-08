package tema1introducereinprogramare;
import java.util.Scanner;
public class problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.print("Introduceți un număr: ");
	        int numar = scanner.nextInt();

	       
	        if (numar < 1 || numar > 10) {
	            System.out.println("INVALID");
	        } else if (numar > 5) {
	            System.out.println("ADMIS");
	        } else {
	            System.out.println("RESPINS");
	        }

	        scanner.close();
	    }
	}
		       