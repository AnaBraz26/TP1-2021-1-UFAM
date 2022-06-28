import java.util.Scanner;

public class TanqueCombustivel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		double x = scan.nextDouble();
		int opcao = scan.nextInt();
		
		double pi = Math.PI; 
		
		if(opcao == 1)
		{			
			double volume_c = ((pi*x*x)*((3*raio)-x))/3;
			System.out.printf("%.4f", volume_c);
		}
		else
		{
			double volume_c = ((pi*x*x)*((3*raio)-x))/3;
			double volume_e = (4 * pi * raio * raio * raio)/3;
			double volume_f = volume_e - volume_c; 
			System.out.printf("%.4f", volume_f);
		}
		
		
		scan.close();

	}

}
