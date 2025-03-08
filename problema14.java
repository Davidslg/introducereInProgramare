package tema1introducereinprogramare;
import java.util.Scanner;
public class problema14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
		
		 for (int nr1 = 0; nr1 < 1000; nr1++) {
			 for (int nr2 = 0; nr2 < 1000; nr2++) 
	          
	            if ((nr1 % 17 == 0 || nr1 % 13 == 0) && (nr2 % 19 == 0 || nr2 % 7 == 0)) {
	                System.out.println(nr1 + " si " + nr2);
	            }
	        }

	        scanner.close();
	}

}
