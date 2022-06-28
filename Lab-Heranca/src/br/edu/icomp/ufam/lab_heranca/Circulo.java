package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
	public double raio;
	
	public Circulo(int posX, int posY, double raio)
	{
		super(posX, posY);
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	public double getArea()
	{
		double pi = Math.PI;
		double n_raio = Math.pow(this.raio, 2);
		return n_raio * pi;
	}
	
	public double getPerimetro()
	{
		double pi = Math.PI;
		return this.raio*pi*2;
	}
	
	public String toString()
	{
		return "C�rculo na posi��o ("+this.posX+", "+this.posY+") com raio de "+this.raio+"cm (�rea="+getArea()+"cm2, per�metro="+getPerimetro()+"cm)";
	}
}
