import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int m;
		
		if(b > c)
		{
			m = b - c;
		}
		else 
		{
			m = c - b;
		}
		
		
		if(b+c > a && m < a  && a > 0 && b > 0 && c > 0)
		{
			if(a == b && a == c && b == c)
			{
				System.out.printf("equilatero");
			}
			else if(a != b && a != c && b != c)
			{
				System.out.printf("escaleno");
			}
			else 
			{
				System.out.printf("isosceles");
			}
		}
		else
		{
			System.out.printf("invalido");
		}
		
		scan.close();
	}	
}
