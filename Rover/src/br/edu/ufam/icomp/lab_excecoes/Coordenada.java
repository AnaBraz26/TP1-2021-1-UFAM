package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
		
	public Coordenada(int posX, int posY, int digito)  throws CoordenadaNegativaException,
	CoordenadaForaDosLimitesException, DigitoInvalidoException
	{		
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;	
	
		if(this.posX < 0 || this.posY < 0) throw new CoordenadaNegativaException();
		
		if(this.posX < 0 || this.posX> 30000) throw new CoordenadaForaDosLimitesException();
		
		if(this.posY < 0 || this.posY > 30000) throw new CoordenadaForaDosLimitesException();
		
		if( (((this.posX + this.posY ) % 10) != digito) && (digito >= 0 && digito <= 9)) throw new DigitoInvalidoException();
	}
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public double distancia(Coordenada coordenada)
	{	
		double distX =  Math.pow(getPosX() - coordenada.getPosX(), 2);
		double distY =  Math.pow(getPosY() - coordenada.getPosY(), 2) ;
		double dig = Math.pow(this.digito - coordenada.digito, 2);			
		double raiz = Math.sqrt(distX+distY+dig-1);
		return raiz;
	}
	
	@Override
	public String toString() {
		return getPosX()+", "+getPosY();
	}
}
