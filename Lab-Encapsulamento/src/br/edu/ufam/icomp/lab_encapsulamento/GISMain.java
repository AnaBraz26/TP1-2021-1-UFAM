package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		
		Localizavel[] ap = new Localizavel[6];
		
		Celular a = new Celular(55, 92, 930154926);
		Celular b = new Celular(20, 67, 236512845);
		Celular c = new Celular(5, 21, 763256425);
		CarroLuxuoso d = new CarroLuxuoso("ABC210");
		CarroLuxuoso e = new CarroLuxuoso("CFD562");
		CarroLuxuoso f = new CarroLuxuoso("LSO236");
		
		ap[0] = a;
		ap[1] = b;
		ap[2] = c;
		ap[3] = d;
		ap[4] = e;
		ap[5] = f;
		
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(ap[i].getPosicao());
		}
	}

}
