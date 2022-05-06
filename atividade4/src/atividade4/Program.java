package atividade4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("com while: ");
		
		int n = 0;
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("do while:");
		
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		
		System.out.println("----------------------------");
		
		for(int c=1; c<=15; c++) {
			if (c % 2 != 0)
			System.out.println("["+c+"]");
		}
		
		
		int pares = 0;
		int impares = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int v=1; v<=10; v++) {
			System.out.println("digite um valor: ");
			double numero = sc.nextDouble();
			if(numero % 2 == 0) {
				pares = pares + 1;
			}else {
				impares = impares + 1;
			}
		}
		
		System.out.println("quantidade de números pares: "+pares);
		System.out.println("quantidade de números impares: "+impares);
		
		System.out.println("------------------------------------------");
		
		
		int num = 0;
		
		Scanner sc2 = new Scanner(System.in);
		
		do {
			System.out.println("digite um número: ");
			num = sc2.nextInt();
		}while(num != 0);
		
		sc2.close();
		
		

		
	}

}
