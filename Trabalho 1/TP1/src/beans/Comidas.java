/* Nesta classe os metodes get e set foram criados para serem utilizados no DAO*/
package beans;

/**
 *
 * @author anaca
 */
public class Comidas {
        private int id;
	private String ingredientes, nome;
	private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
  
        
	
}
