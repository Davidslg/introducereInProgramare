package tema1introducereinprogramare;
import java.util.Scanner;
public class problema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduceți numărul de elemente n: ");
        int n = scanner.nextInt();
       
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduceți numărul " + (i + 1) + ": ");
            suma += scanner.nextDouble();
        }
        if (n <= 0) {
            System.out.println("Numărul de elemente trebuie să fie pozitiv.");
        }
        double media = suma / n;
        System.out.println("Media aritmetică este: " + media);

        scanner.close(); 
	}

}
