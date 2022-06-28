import java.util.ArrayList;

public class Turma {
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	public Turma()
	{
		this("","",0,true);
	}
	
	public Turma(String nome, String professor, int numAlunos, boolean acessivel)
	{
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	void addHorario(int horario)
	{
		horarios.add(horario);
	}
	
	String getHorariosString()
	{
		String dia = "";
		for(int i = 0; i < horarios.size(); i++)
		{
			if(i == horarios.size() - 1)
			{
				switch(horarios.get(i))
				{
					case 1:
						dia = dia + "segunda 8hs";
						break;
					case 2:
						dia = dia + "segunda 10hs";
						break;
					case 3:
						dia = dia + "segunda 12hs";
						break;
					case 4:
						dia = dia + "segunda 14hs";
						break;
					case 5:
						dia = dia + "segunda 16hs";
						break;
					case 6:
						dia = dia + "segunda 18hs";
						break;
					case 7:
						dia = dia + "segunda 20hs";
						break;
					case 8:
						dia = dia + "terça 8hs";
						break;
					case 9:
						dia = dia + "terça 10hs";
						break;
					case 10:
						dia = dia + "terça 12hs";
						break;
					case 11:
						dia = dia + "terça 14hs";
						break;
					case 12:
						dia = dia + "terça 16hs";
						break;
					case 13:
						dia = dia + "terça 18hs";
						break;
					case 14:
						dia = dia + "terça 20hs";
						break;
					case 15:
						dia = dia + "quarta 8hs";
						break;
					case 16:
						dia = dia + "quarta 10hs";
						break;
					case 17:
						dia = dia + "quarta 12hs";
						break;
					case 18:
						dia = dia + "quarta 14hs";
						break;
					case 19:
						dia = dia + "quarta 16hs";
						break;
					case 20:
						dia = dia + "quarta 18hs";
						break;
					case 21:
						dia = dia + "quarta 20hs";
						break;
					case 22:
						dia = dia + "quinta 8hs";
						break;
					case 23:
						dia = dia + "quinta 10hs";
						break;
					case 24:
						dia = dia + "quinta 12hs";
						break;
					case 25:
						dia = dia + "quinta 14hs";
						break;
					case 26:
						dia = dia + "quinta 16hs";
						break;
					case 27:
						dia = dia + "quinta 18hs";
						break;
					case 28:
						dia = dia + "quinta 20hs";
						break;
					case 29:
						dia = dia + "sexta 8hs";
						break;
					case 30:
						dia = dia + "sexta 10hs";
						break;
					case 31:
						dia = dia + "sexta 12hs";
						break;
					case 32:
						dia = dia + "sexta 14hs";
						break;
					case 33:
						dia = dia + "sexta 16hs";
						break;
					case 34:
						dia = dia + "sexta 18hs";
						break;
					case 35:
						dia = dia + "sexta 20hs";
						break;
				}
			}
				else
				{
					switch(horarios.get(i))
					{
						case 1:
							dia = dia + "segunda 8hs, ";
							break;
						case 2:
							dia = dia + "segunda 10hs, ";
							break;
						case 3:
							dia = dia + "segunda 12hs, ";
							break;
						case 4:
							dia = dia + "segunda 14hs, ";
							break;
						case 5:
							dia = dia + "segunda 16hs, ";
							break;
						case 6:
							dia = dia + "segunda 18hs, ";
							break;
						case 7:
							dia = dia + "segunda 20hs, ";
							break;
						case 8:
							dia = dia + "terça 8hs, ";
							break;
						case 9:
							dia = dia + "terça 10hs, ";
							break;
						case 10:
							dia = dia + "terça 12hs, ";
							break;
						case 11:
							dia = dia + "terça 14hs, ";
							break;
						case 12:
							dia = dia + "terça 16hs, ";
							break;
						case 13:
							dia = dia + "terça 18hs, ";
							break;
						case 14:
							dia = dia + "terça 20hs, ";
							break;
						case 15:
							dia = dia + "quarta 8hs, ";
							break;
						case 16:
							dia = dia + "quarta 10hs, ";
							break;
						case 17:
							dia = dia + "quarta 12hs, ";
							break;
						case 18:
							dia = dia + "quarta 14hs, ";
							break;
						case 19:
							dia = dia + "quarta 16hs, ";
							break;
						case 20:
							dia = dia + "quarta 18hs, ";
							break;
						case 21:
							dia = dia + "quarta 20hs, ";
							break;
						case 22:
							dia = dia + "quinta 8hs, ";
							break;
						case 23:
							dia = dia + "quinta 10hs, ";
							break;
						case 24:
							dia = dia + "quinta 12hs, ";
							break;
						case 25:
							dia = dia + "quinta 14hs, ";
							break;
						case 26:
							dia = dia + "quinta 16hs, ";
							break;
						case 27:
							dia = dia + "quinta 18hs, ";
							break;
						case 28:
							dia = dia + "quinta 20hs, ";
							break;
						case 29:
							dia = dia + "sexta 8hs, ";
							break;
						case 30:
							dia = dia + "sexta 10hs, ";
							break;
						case 31:
							dia = dia + "sexta 12hs, ";
							break;
						case 32:
							dia = dia + "sexta 14hs, ";
							break;
						case 33:
							dia = dia + "sexta 16hs, ";
							break;
						case 34:
							dia = dia + "sexta 18hs, ";
							break;
						case 35:
							dia = dia + "sexta 20hs, ";
							break;
					
				}
			}
		}
		
		return dia;
	}
	
	String getDescricao()
	{
		if(this.acessivel)
			return "Turma: "+this.nome+"\nProfessor: "+this.professor+"\nNúmero de Alunos: "+this.numAlunos+"\nHorário: "+getHorariosString()+"\nAcessível: sim\n\n";
		else
			return "Turma: "+this.nome+"\nProfessor: "+this.professor+"\nNúmero de ALunos: "+this.numAlunos+"\nHorário: "+getHorariosString()+"\nAcessível: não\n\n";
	}
}


