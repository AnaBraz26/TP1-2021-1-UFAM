import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double val_hour = scan.nextDouble();
		int qtd_hour = scan.nextInt();
		
		double salario = val_hour * qtd_hour;
		System.out.printf("Salario bruto: R$%.2f\n", salario);
		
		double IR = salario * 0.11;
		System.out.printf("IR: R$%.2f\n", IR);
		
		double INSS = salario * 0.08;
		System.out.printf("INSS: R$%.2f\n", INSS);
		
		double desconto = IR + INSS;
		System.out.printf("Total de descontos: R$%.2f\n", desconto);
		
		double salario_final = salario - desconto;
		System.out.printf("Salario liquido: R$%.2f\n", salario_final);
		
		scan.close();
		
	}

}
