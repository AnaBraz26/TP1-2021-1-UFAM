import java.util.ArrayList;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	public Ensalamento() {};
	
	void addSala(Sala sala)
	{
		salas.add(sala);
	}
	
	void addTurma(Turma turma)
	{
		turmas.add(turma);
	}
	
	Sala getSala(Turma turma)
	{
		for(int i = 0; i < ensalamento.size(); i++)
		{
			if(ensalamento.get(i).turma == turma)
			{
				return ensalamento.get(i).sala;		
			}			
		}
		return null;
	}
	
	boolean salaDisponivel(Sala sala, int horario)
	{
		for(int i = 0; i < ensalamento.size(); i++)
		{
			if(ensalamento.get(i).sala == sala)
			{				
				for(int j = 0; j < ensalamento.get(i).turma.horarios.size()-1; j++)
				{
					if(ensalamento.get(i).turma.horarios.get(j) == horario)
						return false;								
				}
			}
		}
		
		return true;
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios)
	{	
		for(int i = 0; i < horarios.size(); i++)
		{
			if(salaDisponivel(sala, horarios.get(i)) == false) 
			{
				return false;
			}				
		}		
		return true;
	}
	
	boolean alocar(Turma turma, Sala sala)
	{
		if(turma.acessivel == sala.acessivel)
		{
			if(turma.numAlunos <= sala.capacidade)
			{
				if(salaDisponivel(sala, turma.horarios))
				{
					TurmaEmSala new_turma = new TurmaEmSala(turma,sala);
									
					ensalamento.add(new_turma);
					
					return true;
				}
			}
		}
		return false;
	}
	
	
	void alocarTodas()
	{		
		for(int i = turmas.size()-1; i >= 0 ; i--)
		{
			for(int j = 0; j < salas.size(); j++)
			{
				if(alocar(turmas.get(i), salas.get(j)))
					break;
			}
		}
	}
	
	int getTotalTurmasAlocadas()
	{
		int cont = 0;
		for(int i = 0; i < ensalamento.size(); i++)
		{
			if(ensalamento.get(i).sala != null)
			{
				cont++;
			}
		}
		
		return cont;
	}
	
	int getTotalEspacoLivre()
	{
		int total = 0;
		
		for(int i = 0; i < ensalamento.size(); i++)
		{
			total = total + ensalamento.get(i).sala.capacidade - ensalamento.get(i).turma.numAlunos;
		}
		
		return total;
	}
	
	String relatorioResumoEnsalamento()
	{
		return "Total de Salas: "+salas.size()+"\nTotal de Turmas: "+turmas.size()+"\nTurmas Alocadas: "
				+getTotalTurmasAlocadas()+"\nEspaços Livres: "+getTotalEspacoLivre()+"\n\n";
	}
	
	String relatorioTurmasPorSala()
	{
		String info1 = relatorioResumoEnsalamento();
		
		String info2 = "";
		for(int i = 0; i < salas.size(); i++)
		{
			info2 = info2 + "--- " + salas.get(i).getDescricao() + " ---\n";
			
			for(int j = 0; j < ensalamento.size(); j++)
			{
				if(salas.get(i) == ensalamento.get(j).sala)
					info2 = info2 + ensalamento.get(j).turma.getDescricao();
		    }
		}
		return info1 + info2;
	}
	
	String relatorioSalasPorTurma() 
	{
		
		String info1 = relatorioResumoEnsalamento();
		String info2 = "";
		String info4 = "SEM SALA";
		
		for (int i = 0; i < ensalamento.size(); i++)
		{
			for(int j = 0; j < turmas.size(); j++)
			{
				if (turmas.get(j).nome == ensalamento.get(i).turma.nome) 
					info4 =  ensalamento.get(i).sala.getDescricao();
			}
		}
		
		for(int j = 0; j < turmas.size(); j++)
		{
			if(turmas.get(j).acessivel)				
				info2 = info2 + "Turma: " + turmas.get(j).nome + "\nProfessor: " + turmas.get(j).professor +
						"\nNúmero de alunos: "+ turmas.get(j).numAlunos + "\nHorário: " + 
						turmas.get(j).getHorariosString() + "\nAcessível: sim \nSala: " + info4 + "\n";		
			else
				info2 = info2 + "Turma: " + turmas.get(j).nome + "\nProfessor: " + turmas.get(j).professor + 
				"\nNúmero de alunos: "+ turmas.get(j).numAlunos + "\nHorário: " + turmas.get(j).getHorariosString() +
				"\nAcessível: não \nSala: " + info4 + "\n";
		}		
		return info1 + info2;
	}
	
	
}



