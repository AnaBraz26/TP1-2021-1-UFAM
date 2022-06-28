package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{

	public Quadrado(int posX, int posY, double lado)
	{
		super(posY, posY, lado, lado);
		this.posX = posX;
		this.posY = posY;
		this.altura = lado;
		this.largura = lado;
	}
	
	public String toString()
	{
		return "Quadrado na posi��o ("+this.posX+", "+this.posY+") com lado de "+this.altura+"cm (�rea="+getArea()+"cm2, per�metro="+getPerimetro()+"cm)";
	}
}
