import java.util.Scanner;
public class ContaEnergia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double consumo = scan.nextDouble();
		char inst = scan.next().charAt(0);
		
		if(consumo >= 0 && (inst == 'C' || inst == 'R' || inst == 'I'))	
		{
			if(inst == 'R')
			{
				if(consumo < 500)
				{
					double valor = consumo * 0.40;
					System.out.printf("%.2f\n", valor);
				}
				else
				{
					double valor = consumo * 0.65;
					System.out.printf("%.2f\n", valor);
				}
			}
			else if(inst == 'C')
			{
				if(consumo < 1000)
				{
					double valor = consumo * 0.55;
					System.out.printf("%.2f\n", valor);
				}
				else
				{
					double valor = consumo * 0.60;
					System.out.printf("%.2f\n", valor);
				}
			}
			else
			{
				if(consumo < 5000)
				{
					double valor = consumo * 0.55;
					System.out.printf("%.2f\n", valor);
				}
				else
				{
					double valor = consumo * 0.60;
					System.out.printf("%.2f\n", valor);
				}
			}
		}
		else
		{
			System.out.printf("-1.00");
		}
		scan.close();

	}

}
