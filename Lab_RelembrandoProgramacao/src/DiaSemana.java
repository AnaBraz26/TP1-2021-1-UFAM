import java.util.Scanner;
public class DiaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mat[][] = new int[100][7];
		int cont_linha = 0;
		int i = 0;	 
		int j = 0;
		int maior = Integer.MIN_VALUE;		
		int soma[] = new int[100];
		
		for(i = 0; i >= 0; i++)
		{	
			cont_linha++;
			for(j = 0; j < 7; j++)
			{
				mat[i][j] = scan.nextInt();
				if(mat[i][j] == -1)
					break;
			}			
			if(mat[i][0] == -1)
				break;
		}
		
		for(j = 0; j < 7; j++)
		{
			for(i = 0; i < cont_linha; i++)
			{
				if(mat[i][j] != -1)
					soma[j] = soma[j] + mat[i][j];
			}
		}
		
		for(i = 0; i < 7;i++)
		{
			if(maior < soma[i])
				maior = soma[i];
		}
		
		for(i = 0; i < 7;i++)
		{
			if(maior == soma[i])
			{
				System.out.printf("%d\n",i+1);
			}
		}
		
		
		scan.close();
	}

}
