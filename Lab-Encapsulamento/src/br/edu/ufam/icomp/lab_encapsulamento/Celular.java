package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel {
	private int codPais;
	private int codArea;
	private int numero;
	
	public Celular(int codPais, int codArea, int numero)
	{
		this.codPais = codPais;
		this.codArea = codArea;
		this.numero = numero;
	}

	public int getCodPais() {
		if(this.codPais >= 1 && this.codPais <= 1999)
			return codPais;
		else
			return -1;		
	}

	public final void setCodPais(int codPais) {
		this.codPais = codPais;
	}

	public int getCodArea() {
		if(this.codArea >= 10 && this.codArea <= 99)
			return codArea;
		else
			return -1;
	}

	public final void setCodArea(int codArea) {
		this.codArea = codArea;		
	}

	public int getNumero() {

		if(numero >=  10000000 && numero <= 999999999)
			return numero;
		else
			return -1;
	}

	public final void setNumero(int numero) {
		this.numero = numero;
	}

	public Posicao getPosicao()
	{
		Random r = new Random();
		double latitude = -2.960000 + (-0.2) * r.nextDouble();
		double longitude =  -59.820000 + (-0.3) * r.nextDouble();
		double altitude = 100 + (-85) * r.nextDouble();
		
		Posicao pos = new Posicao(latitude, longitude, altitude);
		
		return pos;
	}
	
	public double getErroLocalizacao()
	{
		double erro = 50.0;
		return erro;
	}	
	
}
