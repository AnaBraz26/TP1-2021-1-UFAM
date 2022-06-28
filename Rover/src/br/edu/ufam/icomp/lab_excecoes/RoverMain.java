package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	
	public static void main(String[] args)
	{
		try
		{
	    	Caminho d = new Caminho(6);
			System.out.println(d.toString());
			
			Caminho c = new Caminho(6);
			Coordenada r1 = new Coordenada(23, 55, 8);
			c.addCoordenada(r1);
					
			Coordenada r2 = new Coordenada(27, 65, 2);
			c.addCoordenada(r2);
			
			Coordenada r3 = new Coordenada(37, 70, 7);
			c.addCoordenada(r3);
		
			System.out.println(c.tamanho());
			System.out.println(c.toString());
			
			Coordenada r4 = new Coordenada(48, 74, 2);
			c.addCoordenada(r4);
			
			Coordenada r5 = new Coordenada(62, 74, 6);
			c.addCoordenada(r5);
			
			System.out.println(c.tamanho());
			System.out.println(c.toString());
			
			Coordenada re = new Coordenada(78, 74, 2);
			c.addCoordenada(re);
			
			System.out.println(c.tamanho());
			System.out.println(c.toString());
		}
		catch(Exception e)
		{
			
		}
		
	}

}
