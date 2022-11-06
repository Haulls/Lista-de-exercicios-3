package Lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String [] args) {
		
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Digite o valor da váriavel A : ");
			 	int A=sc.nextInt();
			 System.out.println("Digite o valor da váriavel B : ");
			 	int B=sc.nextInt();
			 	int VariavelTemporaria;
				
				VariavelTemporaria = A;
				A = B;
				B = VariavelTemporaria;
				
				System.out.println("Os valores das váriaveis são "+A+","+B);
			
			
					sc.close();
	}
}
