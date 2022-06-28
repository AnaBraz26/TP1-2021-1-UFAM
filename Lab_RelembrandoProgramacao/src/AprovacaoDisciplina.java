import java.util.Scanner;
public class AprovacaoDisciplina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double notas[] = new double[100];
		int presenca[] = new int[100];
		int carga;
		int cont = 0;
		
		for(int i = 0; i >= 0; i++)
		{
			notas[i] = scan.nextDouble();
			
			if(notas[i] == -1)
				break;
			else
				cont++;
		}
		
		for(int i = 0; i >= 0; i++)
		{
			presenca[i] = scan.nextInt();
			
			if(presenca[i] == -1)
				break;
		}
		
		carga = scan.nextInt();
		
		double freq_min = (double) carga * 0.75;
		
		int aprovado = 0;
		int rep_nota = 0;
		int rep_freq = 0;
		
		for(int i = 0; i < cont ; i++)
		{
			if(presenca[i] >= freq_min)
			{
				if(notas[i] >= 5)
				{
					aprovado++;
				}
				else
				{
					rep_nota++;
				}
			}
			else
			{
				rep_freq++;
			}
		}
		
		System.out.printf("%d %d %d",aprovado,rep_nota,rep_freq);
		
		scan.close();
	}

}
