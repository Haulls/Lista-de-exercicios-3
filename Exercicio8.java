package Lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		
		System.out.print("Por favor, digite o tempo que você gastou em sua viagem (horas): ");
	Double	TempoGasto = sc.nextDouble();
		
		System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
		Double VelocidadeMedia = sc.nextDouble();

		
	Double	Distancia = VelocidadeMedia * TempoGasto;
	Double Autonomia= (double) 12;
	Double	LitrosUsados = Distancia / Autonomia;


		System.out.print("Resultados: ");
		System.out.println("A Velocidade média será de : " + VelocidadeMedia + " Km/h");
		System.out.println("O Tempo gasto é de  " + TempoGasto + " horas");
		System.out.println("A Distancia Percorrida é : " + Distancia + " Km\n");
		System.out.println("A Quantidade de Combustível que será utilizado : " + LitrosUsados + " litros");
	
	
	
	
	
	
	sc.close();
	}
	

}
