/* Neste classe foram criados métodos para que haja intereção entre o banco de dados
e o código em java*/
package ClassesDAO;

import Conexao.Conexao;
import beans.Mesas;
import beans.Pedidos;
import beans.Garçom;
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

public class MesasDAO {
          
    /* Nesse método é cadastrada uma nova mesa, e junto com ela os id dos pedidos e o id dos garçons*/
    public void create(Mesas m) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("INSERT INTO mesas (numero, idPedidos, idGarçom) VALUES (?,?,?)");
                stmt.setInt(1,m.getNumero());
                stmt.setInt(2,m.getIdPedidos().getId()); //FK
                stmt.setInt(3,m.getIdGarçom().getId());  //FK            

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
    
    /*Neste método é listado a mesas para serem mostradas na interface gráfica*/
    public List<Mesas> read(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Mesas> mesas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("select m.idMesas as mid, numero as Mesa, m.idPedidos as Pedido, "
                    + "m.idGarçom as Garçom, p.idComidas as Comida from mesas m inner join pedidos p on "
                    + "p.idPedidos = m.idPedidos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Mesas m = new Mesas();
                
                m.setId(rs.getInt("mid")); 
                m.setNumero(rs.getInt("Mesa"));
                
                Pedidos pedidos = new Pedidos();
                pedidos.setId(rs.getInt("Pedido"));
                
                Garçom garçom = new Garçom();
                garçom.setId(rs.getInt("Garçom"));
                
                m.setIdPedidos(pedidos);
                m.setIdGarçom(garçom);
                
                mesas.add(m);                
            }                
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt, rs);
        }
         return mesas;        
    }
    
    /*Neste método acontece a alteração das informações da mesa, caso necessário no banco de dados*/
        public void update(Mesas m) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("UPDATE mesas SET numero = ?, idPedidos = ?, idGarçom = ? WHERE idMesas = ?");
                stmt.setInt(1,m.getNumero());
                stmt.setInt(2, m.getIdPedidos().getId());//FK
                stmt.setInt(3, m.getIdGarçom().getId()); //FK            
                stmt.setInt(4, m.getId());

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
      
   /*Neste método acontece a exclusão da mesa no banco de dados*/     
   public void delete(Mesas m) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("DELETE FROM mesas WHERE idMesas = ?");
                stmt.setInt(1, m.getId());

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
   
  /*
   Esta função deveria fechar o pedido do cliente, mostrando o valor total pelo JOptionPane
   public List<Mesas> fechar_pedido(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Mesas> mesa = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("select numero as Mesa, p.idPedidos as pid, p.idComidas as Comida, SUM(Valor) from pedidos p \n" +
                                            "inner join comidas c on c.idComidas = p.idComidas\n" +
                                            "inner join mesas m on p.idPedidos = m.idPedidos\n" +
                                            "group by numero");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Mesas m = new Mesas();
                               
                m.setNumero(rs.getInt("Mesa"));  
                
                mesa.add(m);                
            } 
            
            double valor = rs.getDouble("SUM(Valor)");
            
            JOptionPane.showMessageDialog(null, "A conta da mesa  "++"R$: "+);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao calcular: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return mesa;
        
    }
   
   Esse método deveria mostrar todas as mesas cadastradas no sistema pelo JOptionPane
     public void mostra_mesa() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("select numero from mesas");
                
                    
                JOptionPane.showMessageDialog(null, "Mesas: " );
        }
        catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível ver as mesas: " + ex);
        }
        finally {
                Conexao.closeConnection(con, stmt);
        }
   }*/
}
