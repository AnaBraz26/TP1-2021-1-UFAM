
public class Sensor {
	String cor; 
	double resolucao; 
	int framesPorSegundo;
	double valor;
	
	Sensor()
	{
		this("",0.0,0);
	}
	Sensor(String cor, double resolucao, int framesPorSegundo)
	{
		this.cor = cor;
		this.resolucao = resolucao;
		this.framesPorSegundo = framesPorSegundo;
	}
	
	double getMPixelsPorSegundo()
	{
		return valor = this.framesPorSegundo * this.resolucao;
	}
	String getDescricao()
	{		
		return "Sensor: cor="+this.cor+", resolucao="+this.resolucao+"Mp, framesPorSegundo="+this.framesPorSegundo+"fps, mPixelsPorSegundo="+getMPixelsPorSegundo()+"Mpps.";
	}
}
