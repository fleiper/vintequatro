package vintequatro;

import java.util.Scanner;

public class transc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1,numb, par=0,impar=0;
		
		while (i<=10) {
			i++;
			System.out.println("informe um numero: ");
			numb = ler.nextInt();
			
			if (numb % 2 ==0) 
				par = par +1;

			else 
				impar = impar +1;
		}
		System.out.println("existe " + par +" numero pares");
		System.out.println("existe " + impar +" numero impares ");
			
			
			
			
	}
	}

