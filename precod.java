package vintequatro;
import java.util.Scanner;
public class precod {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		int num;
		
		System.out.println("fale um numero");
		num = ler.nextInt();
		
		while (num % 2 !=0) {
			System.out.println("o numero digitado não é par");
			System.out.println("fala oto");
			num = ler.nextInt();
		}
		System.out.println("o numero "+ num+ " é par");
		}
	}

