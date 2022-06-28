import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int number1 = number;
		int number2 = number;
		
		while(number > 0)
		{
			for(int i = 0; i < number; i++)
			{
				System.out.printf("*");
			}
			System.out.println();
			number--;
		}
		
		while(number2 > 0)
		{
			for(int j = number2 - 1; j < number1; j++)
			{
				System.out.printf("*");
			}
			System.out.println();
			number2--;
		}	
		
		scan.close();
	}
}
