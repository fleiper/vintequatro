package vintequatro;
import java.util.Scanner;
public class d {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int a,par = 0,impar = 0;

		for (int i=1; i <= 10 ; i++) {
			System.out.println("==============================");
			System.out.println("me diga um valor");
			a = ler.nextInt();

			if (a % 2 ==0) 
				par = par +1;

			else 
				impar = impar +1;
		}
		System.out.println("existe " + par +" numero pares");
		System.out.println("existe " + impar +" numero impares ");
	}
}

