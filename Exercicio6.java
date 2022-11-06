package Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Fahrenheit : ");
	Double Fahrenheit = sc.nextDouble();
	
	Double Celsius = (Fahrenheit-32)/1.8; 
	
	System.out.println("A temperatura em Celsius é : "+Celsius);
	
	sc.close();
}
}

