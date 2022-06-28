import java.util.Scanner;
public class AproximacaoPi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double inicial = 3;
		double n = 2;
				
		for(int i = 1; i <= num; i++)
		{
			if(i == 1)
			{
				System.out.printf("%.6f\n", inicial);
			}
			else if(i == 2)
			{
				double soma = inicial + (4/((n)*(n+1)*(n+2)));
				
				System.out.printf("%.6f\n", soma);
			}
			else if(i == 3)
			{
				double soma = inicial + (4/((n)*(n+1)*(n+2))) - (4/((n+2)*(n+3)*(n+4)));				
				
				System.out.printf("%.6f\n", soma);
			}
			else
			{		
				double soma = inicial + (4/((n)*(n+1)*(n+2))) - (4/((n+2)*(n+3)*(n+4)));
				
				for(int j = i; j <= i+1; j++)
				{
					if(j % 2 == 0)
					{
						soma = soma + (4/((n+4)*(n+5)*(n+6)));
						
					}
					else 
					{
						soma = soma - (4/((n+5)*(n+6)*(n+7)));
					}
					
					n++;	
					
					if(j == i+1)
						System.out.printf("%.6f\n", soma);
					else
						System.out.printf("%.6f\n", soma);
						
				}
				
				
				
				
				i++;
			}
		}
		
		scan.close();		
	}

}
