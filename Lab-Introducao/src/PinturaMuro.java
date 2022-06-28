import java.util.Scanner;

public class PinturaMuro {

	public static void main(String[] args) {
		int l = 12;
		int h = 3;
		int m_quadrado = l * h;
		
		Scanner leitura = new Scanner(System.in);
		
		float valor = leitura.nextFloat();
		
		float total = (valor * m_quadrado) + 100;
		
		System.out.printf("%.1f\n", total);
		
		leitura.close();
	}

}
