/* Nesta classe os metodes get e set foram criados para serem utilizados no DAO*/
package beans;

/**
 *
 * @author anaca
 */
public class Pedidos {
    	private int id;
	private String observação,status;
	private Comidas idComidas;
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Comidas getIdComidas() {
        return idComidas;
    }

    public void setIdComidas(Comidas idComidas) {
        this.idComidas = idComidas;
    }

}
