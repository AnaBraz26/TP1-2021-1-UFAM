import java.util.Scanner;
public class MediaColecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double cont = 0;
		double cont_m = 0;
		double soma = 0;
		
		while(cont != 2)
		{
			double num = scan.nextDouble();
			
			if(num != -1)
			{
				soma = soma + num;
				cont_m++;
				cont = 0;
			}
			else
			{				
				cont++;				
				if(cont != 2)
				{
					double media = soma/cont_m;
					System.out.printf("%.2f\n", media);
					soma = 0;
					cont_m = 0;
				}
			}			
		}		
		scan.close();
	}
}
