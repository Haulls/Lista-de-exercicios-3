package Lista3;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do veículo : ");
		Float custodefabrica=sc.nextFloat();
		
	
		Double	percentual = custodefabrica*0.28;
		
		Double imposto = custodefabrica*0.45;
		
		Double CustoConsumidor = percentual+imposto+custodefabrica;
		System.out.println(" O Custo final do consumidor será de : "+CustoConsumidor);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
