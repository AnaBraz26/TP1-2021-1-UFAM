import java.util.Scanner;

public class NumeroNarcisista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int aux = num;
		int i = 0;
		
		while(aux != 0)
		{
			i++;
			aux = aux / 10;			
		}
		
		int num2 = num;
		double soma = 0;
		
		while(num2 != 0)
		{
			int num1 = num2 % 10;
			soma = soma + Math.pow(num1, i);
			num2 = num2 / 10;
		}
		
		if(soma == num)
			System.out.println("SIM");
		else
			System.out.println("NAO");
			
		
		scan.close();
	
	}

}
