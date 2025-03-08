package tema1introducereinprogramare;
import java.util.Scanner;
public class problema12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul n: ");
        int n = scanner.nextInt();

        System.out.print("Divizorii primi ai lui " + n + " sunt: ");

        for (int i = 2; i <= n; i++) { 
            if (n % i == 0) { 
                
                boolean prim = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        prim = false;
                        break;
                    }
                }
                if (prim) {
                    System.out.print(i + " ");  
                }
            }
        }

        scanner.close();
	}

}
