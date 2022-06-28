
public class IniciadoJedi {
	String nome, especie;
	int anoNascimento;
	
	public IniciadoJedi()
	{
		this("","",0);
	}
	
	public IniciadoJedi(String nome, String especie, int anoNascimento)
	{
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}

	String getAnoNascimento()
	{
		if(this.anoNascimento >= 0)
		{			
			return this.anoNascimento+" DBY";
		}
		else
		{
			int nascimento = 0 - this.anoNascimento ;
			return nascimento+" ABY";
		}
	}
	
	String getDescricao()
	{
		return this.nome+" (especie="+this.especie+", nascimento="+getAnoNascimento()+")";
	}	
	
}
