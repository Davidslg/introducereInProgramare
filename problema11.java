package tema1introducereinprogramare;
import java.util.Scanner;
public class problema11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul n: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                System.out.print(i + " "); 
               
                System.out.print("Divizorii lui " + n + " sunt: ");
            }
        }

        scanner.close()
	}

}
