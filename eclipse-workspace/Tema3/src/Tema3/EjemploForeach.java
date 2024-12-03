package Tema3;

public class EjemploForeach {
	
	public static void main(String[] args) {
		   int naturales[] = new int[5];
		   for (int i : naturales) {
		    naturales[i] = 1;
		    System.out.println(naturales[i]);
		    
		   }
		   
		   for (int i : naturales) {
			   System.out.println(i);
		   }
	}
}
