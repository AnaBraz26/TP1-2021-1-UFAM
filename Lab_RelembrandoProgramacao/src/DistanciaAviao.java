import java.util.Scanner;
public class DistanciaAviao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int x = 0;
		int cont = 0;
		int soma = 0;
		int vetor[] = new int[100];
		int mat[][] = {{0, 111,222,333,444,555,666,777},
					   {111 ,0, 2, 11, 6, 15, 11,    1},
					   {222 ,2, 0, 7, 12, 4, 2,     15},
					   {333 ,11,7, 0, 11, 8, 3,     13},
					   {444 ,6, 12, 11, 0, 10, 2,    1},
					   {555 ,15, 4, 8, 10, 0, 5,    13},
					   {666 ,11, 2, 3, 2, 5, 0,     14},
					   {777 ,1, 15, 13, 1, 13, 14,  0}};
		
		for(i = 0; i >= 0; i++)
		{
			vetor[i] = scan.nextInt();
			cont++;
			if(vetor[i] == -1)
				break;
		}
		
		for(x = 0; x < cont; x++)
		{
			for(i = 0; i < 8; i++)
			{
				if(vetor[x] == mat[i][0])
				{
					for(j = 0; j < 8; j++)
					{
						if(vetor[x+1] == mat[0][j])
						{
							soma = soma + mat[i][j];
							
						}					
					}					
				}					
			}
		}
		System.out.printf("%d\n", soma);
		scan.close();
	}

}
