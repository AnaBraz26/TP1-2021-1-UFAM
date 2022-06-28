package br.edu.icomp.ufam.lab_heranca;
public class FormasMain {

	public static void main(String[] args) {
		
		FormaGeometrica[] forma = new FormaGeometrica[6];
		
		Circulo circulo1 = new Circulo(5,9,10);
		Circulo circulo2 = new Circulo(2,3,4);
		
		Retangulo retangulo1 = new Retangulo(15, 20, 5, 10); 
		Retangulo retangulo2 = new Retangulo(2, 9, 14, 10); 
		
		Quadrado quadrado1 = new Quadrado(7, 5, 10); 
		Quadrado quadrado2 = new Quadrado(9, 15, 20); 
		
		forma[0] = circulo1;
		forma[1] = circulo2;
		forma[2] = retangulo1;
		forma[3] = retangulo2;
		forma[4] = quadrado1;
		forma[5] = quadrado2;
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(forma[i].toString());
		}
	}
}

