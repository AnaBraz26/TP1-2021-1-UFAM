
public class TreinadorJedi {
	String titulacao, nome;
	
	public TreinadorJedi()
	{
		this("","");
	}
	
	public TreinadorJedi(String titulacao, String nome)
	{
		this.titulacao = titulacao;
		this.nome = nome;
	}
	
	String getDescricao()
	{
		return this.titulacao+" " +this.nome;
	}
}
