import java.util.ArrayList;

public class SessaoJedi {
	
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>() ;
		
	public SessaoJedi(String nome, TreinadorJedi treinador)
	{
		this.nome = nome;
		this.treinador = treinador;
	}
	
	void addIniciado(IniciadoJedi iniciado)
	{	
		int cont = 0;
		
		for(int i = 0; i < iniciados.size(); i++)
		{
			if(iniciados.get(i).nome == iniciado.nome)
			{
				cont++;
			}
		}
		if(cont == 0)
		{
			iniciados.add(iniciado);
		}
	}
	
	IniciadoJedi getIniciado(String nome)
	{
		for(int i = 0; i < iniciados.size(); i++)
		{
			if(nome == iniciados.get(i).nome)
			{
				return iniciados.get(i);
			}
		}
		return null;
	}
	
	double getMediaAnoNascimento()
	{
		int cont = 0;
		int soma = 0;
		
		for(int i = 0; i < iniciados.size(); i++)
		{			
			soma = soma + iniciados.get(i).anoNascimento;
			cont++;
		}
		
		double media = soma/ cont; 
		return media;
	}
	
	String getDescricao()
	{
		String info = "\n";
		for(int i = 0; i < iniciados.size(); i++)
		{
			info = info + "- Iniciado "+(i+1)+": "+iniciados.get(i).getDescricao()+"\n";
		}
		return "--> SESSÃO "+this.nome+" (Treinador: "+treinador.getDescricao()+")" + info;
	}
}
