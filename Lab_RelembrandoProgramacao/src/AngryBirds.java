import java.util.Scanner;

public class AngryBirds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double v_inicial = scan.nextDouble();
		double angulo = scan.nextDouble();
		double dist_h = scan.nextDouble();
		
		double radians = Math.toRadians(angulo);
		double angulo_final = Math.sin(2 * radians);		
		double r = (v_inicial * v_inicial * angulo_final)/9.8;		

        if (Math.abs(r - dist_h) <= 0.1) 
            System.out.println("1");
        else 
            System.out.println("0");		
		
		scan.close();
	}
}