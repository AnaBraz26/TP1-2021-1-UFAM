
public class Mestre {
	String nome, afiliacao, posto;
	int anoNascimento;
	int idade;
	
	public Mestre()
	{
		this("", 0,"","");
	}

	public Mestre(String nome, int anoNascimento, String afiliacao, String posto)
	{
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	int getIdade(int anoReferencia)
	{		
		if(this.anoNascimento >= 0)
			idade = anoReferencia - this.anoNascimento;
		else
			idade = 0 - this.anoNascimento + anoReferencia;
		
		return idade;
	}
	
	boolean possuiForca()
	{
		if(this.posto == "Jedi" || this.posto == "Sith" )
			return true;
		else
			return false;
	}
	
	String getAnoNascimentoString()
	{		
		if(this.anoNascimento >= 0)
			return this.anoNascimento+"DBY";
		else
		{
			int ano_novo = 0 - this.anoNascimento;
			return ano_novo+"ABY";
		}
			
	}
	
	String getDescricao()
	{
		
		return "Mestre: nome="+this.nome+", anoNascimento="+getAnoNascimentoString()+", afiliacao="+this.afiliacao+", posto="+this.posto+", possuiForca="+possuiForca()+".";
	}
}
