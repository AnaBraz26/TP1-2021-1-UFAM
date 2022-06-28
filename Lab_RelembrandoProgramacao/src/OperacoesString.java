import java.util.Scanner;
public class OperacoesString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		int cont = 0;
		int tamNome = nome.length();
		System.out.printf("%d\n", tamNome);
		System.out.printf("%c\n", nome.charAt(0)); 
		System.out.printf("%c\n", nome.charAt(tamNome - 1));		
		System.out.printf("%s\n", nome.toUpperCase());
		System.out.printf("%s\n", nome.toLowerCase());
		System.out.printf("%s\n", nome.replace('a','e'));
		
		for(int i = 0; i < nome.length(); i++)
		{
			if(i % 2 == 0)
			{
				System.out.printf("%c", nome.charAt(i));
			}
		}
		System.out.println();
		
		for(int i = 0; i < nome.length(); i++)
		{
			if(nome.charAt(i) == 'A' || nome.charAt(i) == 'a'||
			   nome.charAt(i) == 'E' || nome.charAt(i) == 'e'||
			   nome.charAt(i) == 'I' || nome.charAt(i) == 'i'||
			   nome.charAt(i) == 'O' || nome.charAt(i) == 'o'||
			   nome.charAt(i) == 'U' || nome.charAt(i) == 'u')
			{
				cont++;
			}
		}
		System.out.printf("%d\n", cont++);
		
		scan.close();
	}

}
