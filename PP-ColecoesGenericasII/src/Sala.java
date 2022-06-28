
public class Sala {
	int bloco,sala,capacidade;
	boolean acessivel;
	
	public Sala()
	{
		this(0,0,0,true);
	}
	
	public Sala(int bloco, int sala, int capacidade, boolean acessivel)
	{
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getDescricao()
	{
		if(this.acessivel == false)
			return "Bloco "+this.bloco+", Sala "+this.sala+ " (" +this.capacidade+" lugares, não acessível)\n";
		else
			return "Bloco "+this.bloco+", Sala "+this.sala+ " (" +this.capacidade+" lugares, acessível)\n";
	}
	
}
