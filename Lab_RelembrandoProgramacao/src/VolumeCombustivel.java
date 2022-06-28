import java.util.Scanner;
public class VolumeCombustivel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double H = scan.nextDouble();
		double h = scan.nextDouble();
		double r = scan.nextDouble();

		double pi = Math.PI;
		
		if(H < 0 || h < 0 || r < 0)
		{
			System.out.printf("-1.000\n");
		}
		else if(h < r && h < H)
		{
			double x = Math.pow(h, 2);
			double volume = ((pi * x)/ 3) * (3*r - h);
			System.out.printf("%.3f\n", volume);
		}
		else if(h > r && h < H)
		{
			double r1 = Math.pow(r, 3);
			double volume_esf = ((4*pi*r1)/3)/2;
			double r2 = Math.pow(r, 2);
			double volume_cil = (pi * r2 * (h-r));
			double vol_final = volume_esf + volume_cil;
			System.out.printf("%.3f\n", vol_final);
		}
		else 
		{
			double r2 = Math.pow(r, 2);
			double volume_cil = (pi * r2 * (h-r));
			double r1 = Math.pow(r, 3);
			double volume_esf = ((4*pi*r1)/3);
			double x = Math.pow(h, 2);
			double volume_cal = ((pi * x)/ 3) * (3*r - h);
			double vol_esf = volume_esf - volume_cal;
			double vol_final = volume_cil + vol_esf;
			System.out.printf("%.3f\n", vol_final);
			
		}
		scan.close();
	}

}
