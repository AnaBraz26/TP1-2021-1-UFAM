import java.util.Scanner;
public class Palindromos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		String name = "";
		
		nome = nome.toUpperCase();
		nome = nome.replace(" ", "");
		int tam =  nome.length();
		
		
		for(int i = tam - 1; i >= 0; i--)
		{
			name = name + nome.charAt(i);
		}
		
		if(name.equals(nome))
		{
			System.out.printf("%s 1", nome);
		}
		else
		{
			System.out.printf("%s 0", nome);
		}
		scan.close();
	}

}
