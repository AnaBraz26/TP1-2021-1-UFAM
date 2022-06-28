import java.util.Scanner;
import java.lang.Math;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double m,s;
		
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
			s = (a+b+c)/ 2;
			
			double area = s * (s-a) * (s-b) * (s -c);
			
			double area_final = Math.sqrt(area);
			
			System.out.printf("%.2f\n", area_final);
		}
		else
		{
			System.out.printf("Triangulo invalido");
		}
		
		scan.close();
	}

}
