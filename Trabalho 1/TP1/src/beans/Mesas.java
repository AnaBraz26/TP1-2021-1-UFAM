/* Nesta classe os metodes get e set foram criados para serem utilizados no DAO*/
package beans;

/**
 *
 * @author anaca
 */
public class Mesas {
    private int id;
    private int numero;
    private Pedidos idPedidos;
    private Garçom idGarçom;
 
 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedidos getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(Pedidos idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Garçom getIdGarçom() {
        return idGarçom;
    }

    public void setIdGarçom(Garçom idGarçom) {
        this.idGarçom = idGarçom;
    }

   
}
