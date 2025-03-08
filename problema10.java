package tema1introducereinprogramare;

public class problema10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prim=true;
		 int i =1000;
		 while(i>=1000)
		 {
			 i++;
			 prim =true;
			 
			 if(i==0||i==1) prim=false;
			 else if(i%2==0 && i!=2) prim =false;
			 else for(int d=3;d*d<=i;d=d+2)
			 {
				 if(i%d ==0)
				 {
					 prim = false;
					 break;
				 }
			 }
			 
			 if (prim) {
	                System.out.println(i);
	                break;  
	            }
		  }