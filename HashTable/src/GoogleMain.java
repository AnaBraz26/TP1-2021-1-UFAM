
public class GoogleMain {

	public static void main(String[] args) {
		ListaInvertida l = new ListaInvertida();
		l.insere("Ola", "document1.txt");
		System.out.println(l.toString());
		
		ListaInvertida ps = new ListaInvertida();
		ps.insere("Brasil", "document1.txt");
		System.out.println(ps.toString());
		
		ListaInvertida ps2 = new ListaInvertida();
		ps.insere("China", "document1.txt");
		System.out.println(ps2.toString());
		
		ListaInvertida ps3 = new ListaInvertida();
		ps.insere("Japão", "document1.txt");
		System.out.println(ps3.toString());
		
		ListaInvertida ps4 = new ListaInvertida();
		ps.insere("Chile", "document1.txt");
		ps.insere("Peru", "document1.txt");
		ps.insere("Argentina", "document2.txt");
		ps.insere("Uruguai", "document2.txt");
		System.out.println(ps4.toString());
		
		
		System.out.println(ps4.busca("Argentina"));
		
		System.out.println(ps4.busca("Brasil"));

	}

}
