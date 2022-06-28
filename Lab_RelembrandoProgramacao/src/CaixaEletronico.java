import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		if(valor % 2 == 0 && valor > 0)
		{
			int cinq = valor/50;
			int dez = (valor%50)/ 10;
			int dois = ((valor%50)%10)/2;
			
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", cinq, dez, dois);
		}
		else
		{
			System.out.printf("Valor Invalido");
		}
		
		scan.close();
	}

}
