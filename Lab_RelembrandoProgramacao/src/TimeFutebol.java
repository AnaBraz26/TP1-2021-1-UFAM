import java.util.Scanner;
public class TimeFutebol {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int gols_f[] = new int[100];
		int cont = 0;
		
		for(int i = 0; i >= 0; i++)
		{
			gols_f[i] = scan.nextInt();
			
			if(gols_f[i] != -1)
				cont++;
			else
				break;
		}
		
		int gols_c[] = new int[100];
		
		for(int i = 0; i >= 0; i++)
		{
			gols_c[i] = scan.nextInt();
			
			if(gols_c[i] == -1)
				break;
		}
		
		int vitoria = 0;
		int derrota = 0;
		int empate = 0;
		
		for(int i = 0; i < cont; i++)
		{
			if(gols_f[i] > gols_c[i])
			{
				vitoria++;
			}
			else if(gols_f[i] == gols_c[i])
			{
				empate++;
			}
			else
			{
				derrota++;
			}
		}
		
		System.out.printf("%d %d %d", vitoria, empate, derrota);
		scan.close();
	}
}
