package Lista3;

import java.util.Scanner;

public class Exercicio3Verdadeiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual : ");
		Float salario=sc.nextFloat();
		
		System.out.println("Informe o percentual de Reajuste : ");
		Float reajuste = sc.nextFloat();
		
		
		Float novoSalario = salario + (salario * (reajuste / 100));
		System.out.println(" O novo salário é : "+novoSalario);
		
	sc.close();

	}

}




