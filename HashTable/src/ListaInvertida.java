import java.util.LinkedList;
import java.util.Hashtable;

public class ListaInvertida {
	
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida() 
	{
		 Hashtable<String, LinkedList<String>> new_tabela = new Hashtable<String, LinkedList<String>>();
		this.tabela = new_tabela;
	}
	
	public boolean insere(String palavra, String documento)
	{
		if(tabela.get(palavra) != null)
		{
			if(tabela.get(palavra).contains(documento) == false)
			{
				tabela.get(palavra).add(documento);
				return true;
			}
			else			
				return false;
		}
		else
		{
			LinkedList<String> words = new LinkedList<String>();
			words.add(documento);
			tabela.put(palavra, words);
			return true;
		}
	}
	
	public LinkedList<String> busca(String palavra)
	{
		return tabela.get(palavra);
	}
	
	
	@Override
	public String toString() {
		
		return tabela.toString();
	}

}
