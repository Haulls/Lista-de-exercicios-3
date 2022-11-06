package Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Diasnoano =  365;
		int diasnomês = 30;
		
		
		System.out.println("Informe quantos anos você possui  : ");
		int anos = sc.nextInt();
		
		System.out.println("Meses : ");
		int meses = sc.nextInt();
		
		
		System.out.println("Dias");
		int dias = sc.nextInt();
		
		dias += (anos *Diasnoano) + (meses*diasnomês);

 		
		System.out.println("Sua idade em dias é : "+dias);
		
		
		
		sc.close();
	}

}
