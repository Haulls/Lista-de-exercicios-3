package Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius : ");
		Double Celsius = sc.nextDouble();
		
		Double fahrenheit = (9*Celsius + 160)/5; 
		
		System.out.println("A temperatura em Fahrenheit é : "+fahrenheit);
		
		sc.close();
	}
}
