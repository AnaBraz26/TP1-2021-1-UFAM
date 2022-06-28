
public class SessaoJediMain {

	public static void main(String[] args) {
		IniciadoJedi i0 = new IniciadoJedi("Katooni", "Tholothian", -55);
		IniciadoJedi i1 = new IniciadoJedi("Ashla", "Togruta", -23);
		IniciadoJedi i2 = new IniciadoJedi("Byph", "Ithorian", -21);
		IniciadoJedi i3 = new IniciadoJedi("Gungi", "Wookiee", -22);
		TreinadorJedi treinador1 = new TreinadorJedi("Grão-Mestre","Fae Coven");
		
		SessaoJedi new_jedi = new SessaoJedi("Gungi", treinador1);
		new_jedi.addIniciado(i0);
		new_jedi.addIniciado(i1);
		new_jedi.addIniciado(i2);
		new_jedi.addIniciado(i3);
		System.out.println(new_jedi.getDescricao());
		
		//System.out.println(i1.getAnoNascimento());
		//System.out.println(i1.getDescricao());
		//System.out.println(i0.getDescricao());
		
	
	}

}



