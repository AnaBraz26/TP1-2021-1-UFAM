
public class AstromechMain {

	public static void main(String[] args) {
			
		Mestre mestre = new Mestre("Darth Vader",42, "General do Grande Exército da Republica ", "Sith");
		Sensor sensor = new Sensor("Preto", 643.0, 81);
		Conexao conexao = new Conexao("SCOMP Link", 4, 650);
		Astromech astromech = new Astromech("R2-D2", mestre, sensor, conexao);
		System.out.println(astromech.getDescricao());
	}

}
