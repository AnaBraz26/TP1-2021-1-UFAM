import java.util.Scanner;
public class SomaColecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int cont = 0;
		
		while(cont != 2)
		{
			int num = scan.nextInt();
			
			if(num != -1)
			{
				soma = soma + num;
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
