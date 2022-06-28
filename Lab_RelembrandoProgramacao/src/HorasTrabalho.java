import java.util.Scanner;
public class HorasTrabalho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int[100][100];
		int soma = 0;
		
		for(int i = 0; i >= 0; i++)
		{
			for(int j = 0; j < 7; j++)
			{
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j] == -1)
					System.exit(0);
				
				soma = soma + matriz[i][j];
			}
			
			System.out.printf("%d\n", soma);
			soma = 0;
		}
		
		
		scan.close();
	}

}
