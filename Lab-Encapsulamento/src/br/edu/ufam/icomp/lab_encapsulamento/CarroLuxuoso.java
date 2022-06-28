package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{
	
	public CarroLuxuoso(String placa) 
	{
		super(placa);
		this.placa = placa;
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
		double erro = 15.0;
		return erro;
	}	
}
