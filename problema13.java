package tema1introducereinprogramare;
import java.util.Scanner;
public class problema13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
		for (int a = 17; a <= 1000; a += 17) {  
            int b = 1000 - a; 

            if (b % 19 == 0) { 
                System.out.println("Perechea: (" + a + ", " + b + ")");
            }
        }
	}

}
