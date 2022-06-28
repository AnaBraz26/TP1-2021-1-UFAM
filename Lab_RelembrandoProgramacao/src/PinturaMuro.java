import java.util.Scanner;

public class PinturaMuro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();
		
		double total = (36*valor) + 100;
		
		System.out.printf("%.1f\n", total);
		
		scan.close();
	}

}
