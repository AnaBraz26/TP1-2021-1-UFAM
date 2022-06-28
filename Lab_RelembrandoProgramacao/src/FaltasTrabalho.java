import java.util.Scanner;
public class FaltasTrabalho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int faltas[] = new int[100];
		double cont = 0;
		double segunda = 0;
		double terca = 0;
		double quarta = 0;
		double quinta = 0;
		double sexta = 0;
		double sabado = 0;
				
		for(int i = 0; i >= 0; i++)
		{
			faltas[i] = scan.nextInt();
			
			if(faltas[i] == -1)
				break;
			else
				cont++;
		}
		
		for(int i = 0; i < cont; i++)
		{
			if(faltas[i] == 2)
			{
				segunda++;
			}
			else if(faltas[i] == 3)
			{
				terca++;
			}
			else if(faltas[i] == 4)
			{
				quarta++;
			}
			else if(faltas[i] == 5)
			{
				quinta++;
			}
			else if(faltas[i] == 6)
			{
				sexta++;
			}
			else
			{
				sabado++;
			}
		}
		
		double seg = (segunda*100)/cont;
		double ter = (terca*100)/cont;
		double qua = (quarta*100)/cont;
		double qui = (quinta*100)/cont;
		double sex = (sexta*100)/cont;
		double sab = (sabado*100)/cont;
		
		System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f\n", seg, ter, qua, qui, sex,sab);
		
		
		scan.close();				
	}

}
