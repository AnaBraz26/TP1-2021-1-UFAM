package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception {
	private static final long serialVersionUID = 1L;
	public RoverException()
	{
		this("Exce��o geral do rover");
	}
	public RoverException(String s)
	{
		super(s);
	}
}
