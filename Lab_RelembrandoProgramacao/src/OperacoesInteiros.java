import java.util.Scanner;
public class OperacoesInteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[100];
		int cont = 0;
		int cont_i = 0;
		int cont_elementos = 0;
		int tamVetor = 0;
		int cont_par = 0;
		int cont_impar = 0;
		int soma = 0;
		double media = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;		

		
		for(int i = 0; cont != 2; i++)
		{
			vetor[i] = scan.nextInt();
			
			if(vetor[i] == -1)
				cont++;			
			else
				cont = 0;
			
			tamVetor++;
		}
		
		for(int i = 0; i < tamVetor; i++)
		{
			if(vetor[i] != -1)
			{	
				cont_elementos++;
				
				if(vetor[i] % 2 == 0)
					cont_par++;
				else
					cont_impar++;
				
				soma = soma + vetor[i];
				
				media = (double) soma/cont_elementos;
								
				if(vetor[i] >= maior)
					maior = vetor[i];					
						
				if(vetor[i] <= menor)
					menor = vetor[i];								
			}
			else
			{
				cont_i++;
				
				if(cont_i != 2)
				{
					System.out.printf("%d\n", cont_elementos);
					System.out.printf("%d\n", cont_par);
					System.out.printf("%d\n", cont_impar);
					System.out.printf("%d\n", soma);
					System.out.printf("%.2f\n", media);
					System.out.printf("%d\n", maior);					System.out.printf("%d\n", menor);
						
					cont_elementos = 0;
					cont_par = 0;
					cont_impar = 0;					
					soma = 0;
					media = 0;
					maior = Integer.MIN_VALUE;
					menor = Integer.MAX_VALUE;	
				}
			}
		}		
		scan.close();
	}	
}			

		
		
	


