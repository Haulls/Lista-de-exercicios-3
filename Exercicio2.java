package Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número total de eleitores do municipio : ");
		Double eleitores=sc.nextDouble();
		
		System.out.println("Digite o número de votos em brancos : ");
		Double brancos=sc.nextDouble();
		
		System.out.println("Dígite o número de votos nulos : ");
		Double nulos=sc.nextDouble();
		
		Double Percentualvalidos = eleitores-(brancos+nulos);;
		Double PercentualBrancos = brancos*100/eleitores;
		Double PercentualNulos =  nulos*100/eleitores;
		
		System.out.println("O número de votos válidos é de : "+Percentualvalidos );
		System.out.println("O número de votos válidos é de : "+PercentualBrancos);
		System.out.println("O número de votos válidos é de : "+PercentualNulos);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
