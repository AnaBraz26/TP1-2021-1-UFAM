import java.util.Scanner;
public class AnimaisCedulas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cedula = scan.nextInt();
		
		if(cedula == 2)
		{
			System.out.printf("Tartaruga\n");
		}
		else if(cedula == 5)
		{
			System.out.printf("Garça\n");
		}
		else if(cedula == 10)
		{
			System.out.printf("Arara\n");
		}
		else if(cedula == 20)
		{
			System.out.printf("Mico-leão-dourado\n");
		}
		else if(cedula == 50)
		{
			System.out.printf("Onça-pintada\n");
		}
		else if(cedula == 100)
		{
			System.out.printf("Garoupa\n");
		}
		else
		{
			System.out.printf("erro\n");
		}
		
		scan.close();

	}

}
