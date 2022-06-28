import java.util.Scanner;
public class ValorExpoente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double sum = 0;
		double soma = 0;
		int n = 1;
		int i = 0;
		
		while(i < n)
		{
			for(i = 0; i < n; i++)
			{
				 soma = Math.pow(2, n);
				 sum = sum + soma;
				
				if(sum > num)
				{
					System.out.printf("%d", n);
				}
				else
				{
					n++;
				}
			}			
		}
		
		scan.close();
	}
}
