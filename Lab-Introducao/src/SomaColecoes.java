import java.util.Scanner;

public class SomaColecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int soma = 0;
		int cont = 0;
		
		while(cont != 2)
		{
			int valor = scan.nextInt();			
			
			if(valor != -1)
			{				
				soma = soma + valor;
				cont = 0;
			}
			else
			{
				cont++;
				if(cont != 2)
				{
					System.out.printf("%d\n", soma);
					soma = 0;
				}
			}
		}
		
		scan.close();
	}
}
