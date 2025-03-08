package tema1introducereinprogramare;
import java.util.Scanner;
public class problema8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Introduceți numărul n: ");
	        int n = scanner.nextInt();
	        long factorial = 1;
	        
	        if (n == 0) {
	            factorial = 1;
	        } else {
	            for (int i = 1; i <= n; i++) {
	                factorial *= i;  
	            }
	        }
	        System.out.println("Factorialul lui " + n + " este: " + factorial);

	        scanner.close();
	}

}
