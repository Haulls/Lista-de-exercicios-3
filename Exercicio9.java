package Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da Prestação : ");
		Double valor=sc.nextDouble();
		
		System.out.println("Digite o valor da taxa : ");
		Double taxa=sc.nextDouble();
		
		
		System.out.println("Informe os dias de atraso :");
		Double tempo=sc.nextDouble();
		
		Double prestaçao = valor+(valor*taxa/100)*tempo;
		
		System.out.println("O valor da prestação em atraso será de : "+prestaçao);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
