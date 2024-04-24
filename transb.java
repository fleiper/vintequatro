package vintequatro;
import java.util.Scanner;
public class transb {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i=1, soma=0, numb;
		

		while (i<=5) {
		i++;
		System.out.println("informe a nota: ");
		numb = ler.nextInt();
		
		System.out.println();
		
		soma = soma + numb;
		
		}	
		double media = soma/5;
		System.out.println("a media das notas é "+ media);

	}
}


