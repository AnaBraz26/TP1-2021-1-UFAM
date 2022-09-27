/* Neste classe foram criados métodos para que haja intereção entre o banco de dados
e o código em java*/
package ClassesDAO;

import Conexao.Conexao;
import beans.Comidas;
import beans.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author anaca
 */
public class PedidosDAO {
     /* Nesse método é cadastrado um novo pedido, o seu status e observações caso o cliente tenha alguma*/
    public void create(Pedidos p) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("INSERT INTO pedidos (idComidas, Status, Observações) VALUES (?,?,?)");
                stmt.setInt(1, p.getIdComidas().getId()); //FK
                stmt.setString(2, p.getStatus());
                stmt.setString(3, p.getObservação());                

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
        catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally {
                Conexao.closeConnection(con, stmt);
        }
   }
    
    /*Neste método é listado os pedidos para serem mostradas na interface gráfica*/
    public List<Pedidos> read(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pedidos> pedidos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("select p.idPedidos as pid, Observações, Status, p.idComidas as Comida, c.idComidas as cid, nome, Ingredientes, Valor from pedidos p inner join comidas c on c.idComidas = p.idComidas");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Pedidos p = new Pedidos();
                
                p.setId(rs.getInt("pid")); 
                p.setStatus(rs.getString("Status"));
                p.setObservação(rs.getString("Observações"));
                       
                Comidas comidas = new Comidas();
                comidas.setId(rs.getInt("Comida"));
                
                p.setIdComidas(comidas);
                
                pedidos.add(p);                
            }        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return pedidos;
        
    }
    
    /*Neste método acontece a alteração das informações do pedido, sendo muito necessário já que o status do 
    pedido deve ser alterado manualmente*/
        public void update(Pedidos p) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("UPDATE pedidos SET idComidas = ?, Status = ?, Observações = ? WHERE idPedidos = ?");
                stmt.setInt(1, p.getIdComidas().getId()); //FK
                stmt.setString(2, p.getStatus());
                stmt.setString(3, p.getObservação());    
                stmt.setInt(4, p.getId());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        }
        catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
        finally {
                Conexao.closeConnection(con, stmt);
        }
   }
      
   /*Neste método acontece a exclusão do pedido no banco de dados*/         
   public void delete(Pedidos p) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("DELETE FROM pedidos WHERE idPedidos = ?");
                stmt.setInt(1, p.getId());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }
        catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluido: " + ex);
        }
        finally {
                Conexao.closeConnection(con, stmt);
        }
   }

}
