package tema1introducereinprogramare;

public class problema15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int a = 0; a <= 9; a++) {
	            for (int b = 0; b <= 9; b++) {
	                
	                int sumaCifrelor = 3 + a + 2 + b;          
	                if (sumaCifrelor % 9 == 0) {
	                 
	                    int numar = 3000 + a * 100 + 20 + b;
	                    System.out.println(numar);
	                }
	     	       
	        	}

	        }
	}

}
