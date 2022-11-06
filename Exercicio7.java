package Lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura da lata de óleo : ");
		Float Altura=sc.nextFloat();
		
		System.out.println("Informe o raio da circunferência : ");
		Double raio = sc.nextDouble();
	
		Double volume=3.14*(raio*raio)*Altura;
		
		System.out.println(" O volume de uma lata de óleo  é : "+volume);
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
