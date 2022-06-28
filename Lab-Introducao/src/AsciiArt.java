import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int number1 = number;
		int number2 = number;
		
		for(int i = 0; i < number; i++)
		{
			for(int j = 0; j < number1; j++)
			{
				System.out.print("*");	
			}
			for(int h = 0; h < i; h++)
			{
				System.out.printf("  ");	
			}
			for(int h = i; h < number2; h++)
			{
				System.out.printf("*");	
			}
			System.out.println();  
			number1--;
			
		}		
		scan.close();
	}
}
