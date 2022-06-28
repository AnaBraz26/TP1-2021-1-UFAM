
public class EnsalamentoMain {

	public static void main(String[] args) {

		Sala um = new Sala();
		um.bloco=6;
		um.sala=101;
		um.capacidade=70;
		um.acessivel=false;
		
		Sala dois = new Sala();
		dois.bloco=6;
		dois.sala=102;
		dois.capacidade=60;
		dois.acessivel=false;
		
		Sala tres = new Sala();
		tres.bloco=6;
		tres.sala=201;
		tres.capacidade=70;
		tres.acessivel=true;
			
		Turma ingles = new Turma();
		ingles.nome = "Ingles";
		ingles.professor = "Carla";
		ingles.numAlunos = 60;
		ingles.acessivel=false;
		ingles.addHorario(2);
		ingles.addHorario(16);
		ingles.addHorario(30);
		
		Turma chines = new Turma();
		chines.nome = "Chines";
		chines.professor = "Wei";
		chines.numAlunos = 50;
		chines.acessivel=true;
		chines.addHorario(11);
		chines.addHorario(25);
		chines.addHorario(32);
		
		Turma japones = new Turma();
		japones.nome = "Japones";
		japones.professor = "Lie";
		japones.numAlunos = 10;
		japones.acessivel=true;
		japones.addHorario(1);
		japones.addHorario(15);
		japones.addHorario(29);
			
		Turma russo = new Turma();
		russo.nome = "Russo";
		russo.professor = "Victor";
		russo.numAlunos = 70;
		russo.acessivel=true;
		russo.addHorario(2);
		russo.addHorario(16);
		
		Ensalamento e1 = new Ensalamento();
		e1.addSala(um);
		e1.addTurma(japones);
		e1.addSala(dois);
		e1.addTurma(chines);
		e1.addSala(tres);
		e1.addTurma(ingles);
		e1.alocar(japones, tres);
		e1.alocar(ingles, um);
		e1.alocar(japones, tres);
		e1.alocar(japones, tres);
		e1.alocar(ingles, um);
		
		
		System.out.println (e1.getTotalTurmasAlocadas());


	}

}
