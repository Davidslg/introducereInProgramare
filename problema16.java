package tema1introducereinprogramare;
import java.util.Scanner;

public class problema16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduceti un numar: ");
	        int numar = scanner.nextInt();

	        String numarStr = String.valueOf(numar);

	        for (int i = 0; i < numarStr.length(); i++) {
	            System.out.println(numarStr.charAt(i));
	        }

	        scanner.close();
	}

}
