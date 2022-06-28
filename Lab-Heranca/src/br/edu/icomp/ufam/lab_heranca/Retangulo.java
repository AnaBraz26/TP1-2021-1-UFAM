package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura, altura;
	
	public Retangulo(int posX, int posY, double largura, double altura)
	{
		super(posX, posY);
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea()
	{
		return this.altura * this.largura;
	}
	
	public double getPerimetro()
	{
		return 2*(this.largura + this.altura);
	}
	
	public String toString()
	{
		return "Retângulo na posição ("+this.posX+", "+this.posY+") com largura de "+this.largura+"cm e altura de "+this.altura+"cm (área="+getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
	}
}
