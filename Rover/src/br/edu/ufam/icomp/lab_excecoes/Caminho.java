package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;
	
	public Caminho(int maxTam) 
	{
		caminho = new Coordenada[maxTam];
	}
	
	public int tamanho()
	{
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException,
	DistanciaEntrePontosExcedidaException
	{				
		if(tamanho >= caminho.length) throw new TamanhoMaximoExcedidoException();
		
		caminho[tamanho] = coordenada;
		
		if(tamanho != 0)
			if(caminho[tamanho - 1].distancia(coordenada) > 15) throw new DistanciaEntrePontosExcedidaException();
		
		
		tamanho++;
		
	}
	
	public void reset()
	{
		caminho = null;
		tamanho = 0;
	}

	@Override
	public String toString() {
		
		String info1 = "Dados do caminho:\n";
		
		String info2 = "  - Quantidade de pontos: " + tamanho() +"\n";
		
		String info3 = "  - Pontos:\n";
				
		String info4 = "";
		
		if(tamanho() == 0)
		{
			return info1 + info2 + info3;
		}
		else {
			for(int i = 0; i < tamanho() ; i++)
			{
				info4 = info4 + "    -> "+caminho[i].toString()+"\n";
			}
		}	
		return info1 + info2 + info3 + info4;
		
	}
	
}
