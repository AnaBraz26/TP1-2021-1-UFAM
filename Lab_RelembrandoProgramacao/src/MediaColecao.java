import java.util.Scanner;
public class MediaColecao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		int cont = 0;
		int num = scan.nextInt();
	
		while(num != -1)
		{
			soma = soma + num;
			cont++;
			num = scan.nextInt();
		}	
		
		double media = soma/cont;
		System.out.printf("%.2f\n", media);
		scan.close();
	}

}
