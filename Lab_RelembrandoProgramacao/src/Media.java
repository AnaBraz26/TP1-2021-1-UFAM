import java.util.Scanner;

public class Media {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();
		
		double media = (number1 + number2 + number3)/3;
		
		System.out.printf("%.2f\n", media);
		
		scan.close();
	}
}
