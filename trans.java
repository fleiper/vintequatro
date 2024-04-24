package vintequatro;
import java.util.Scanner;
public class trans {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numb,i=1;

		System.out.println("informe um valor: ");
		numb = ler.nextInt();

		while (i<numb) {

			if (i%2 !=0) {
				System.out.println("o numero declarado : " +i);
			}
			else {
				System.out.println("ESSE VALOR É IMPAR");
			}
			
			i++;
		}
	}
}

