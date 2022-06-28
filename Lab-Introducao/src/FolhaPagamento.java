import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double valor_hora = leitura.nextDouble();
		int qtd_hora = leitura.nextInt();
		
		double bruto = valor_hora * qtd_hora;
		System.out.printf("Salario bruto: R$%.2f\n", bruto);
		
		double IR = bruto * 0.11;
		System.out.printf("IR: R$%.2f\n", IR);
		
		double INSS = bruto * 0.08;
		System.out.printf("INSS: R$%.2f\n",INSS);
		
		double descontos = IR + INSS;
		System.out.printf("Total de descontos: R$%.2f\n", descontos);
		
		double liquido = bruto - descontos;
		System.out.printf("Salario liquido: R$%.2f\n", liquido);
		
		leitura.close();
	}

}
