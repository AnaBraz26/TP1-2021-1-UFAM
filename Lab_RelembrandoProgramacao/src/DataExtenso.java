import java.util.Scanner;
public class DataExtenso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int data = scan.nextInt();
		
		int ano = data % 10000;
		int mes = (data % 1000000)/10000;
		int dia = (data % 100000000)/1000000;
		
		if(mes == 01)
		{
			System.out.printf("%d de janeiro de %d\n", dia, ano);
		}
		else if(mes == 02)
		{
			System.out.printf("%d de fevereiro de %d\n", dia, ano);
		}
		else if(mes == 03)
		{
			System.out.printf("%d de março de %d\n", dia, ano);
		}
		else if(mes == 04)
		{
			System.out.printf("%d de abril de %d\n", dia, ano);
		}
		else if(mes == 05)
		{
			System.out.printf("%d de maio de %d\n", dia, ano);
		}
		else if(mes == 06)
		{
			System.out.printf("%d de junho de %d\n", dia, ano);
		}
		else if(mes == 07)
		{
			System.out.printf("%d de julho de %d\n", dia, ano);
		}
		else if(mes == 8)
		{
			System.out.printf("%d de agosto de %d\n", dia, ano);
		}
		else if(mes == 9)
		{
			System.out.printf("%d de setembro de %d\n", dia, ano);
		}
		else if(mes == 10)
		{
			System.out.printf("%d de outubro de %d\n", dia, ano);
		}
		else if(mes == 11)
		{
			System.out.printf("%d de novembro de %d\n", dia, ano);
		}
		else
		{
			System.out.printf("%d de dezembro de %d\n", dia, ano);
		}
		
		scan.close();
		
	}

}
