import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double number = 0;
		
		while(number != -1)
		{
			number = scan.nextDouble();
			
			if(number != -1)
			{
				if(number%2 == 0)
				{
					System.out.printf("PAR\n");
				}
				else
				{
					System.out.printf("IMPAR\n");
				}
			}				
		}
		
		scan.close();
	}
}
