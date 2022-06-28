
public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	double valor;
	
	Conexao()
	{
		this("", 0, 0);
	}
	Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao)
	{
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	String getProtocoloString()
	{
		if(this.idProtocolo == 1)
			return "Rotoscope";
		else if(this.idProtocolo == 2)
			return "Acustico";
		else if(this.idProtocolo == 3)
			return "Radio";
		else
			return "Outros";
	}
	
	double getTaxaMBps()
	{
		return valor = (this.taxaTransmissao)/1024;
	}
	
	String getDescricao()
	{
		return "Conexao: tipoPorta="+this.tipoPorta+", protocolo="+getProtocoloString()+", taxaTransmissao="+getTaxaMBps()+"MBps.";
	}
}
