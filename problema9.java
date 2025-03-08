package tema1introducereinprogramare;
import java.util.Scanner;
public class problema9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      
	        System.out.print("Introduceți numărul n: ");
	        int n = scanner.nextInt();

	        if (n < 2) {
	            System.out.println(n + " nu este un număr prim.");
	        }
	        scanner.close();
	}

}
