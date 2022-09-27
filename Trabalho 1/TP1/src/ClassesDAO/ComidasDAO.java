/* Neste classe foram criados métodos para que haja intereção entre o banco de dados
e o código em java*/

package ClassesDAO;

import Conexao.Conexao;
import beans.Comidas;
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
public class ComidasDAO {
    
    /* Neste método é cadastrado uma nova comida no cardápio
    É feita a conexão com o banco de dados e nela é inserida as novas comidas ou bebidas, os ingredientes e o valor.
    Caso tudo de certo, um painel será mostrado "Salvo com sucesso", caso contrário é mostrado o erro*/
    public void create(Comidas c) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("INSERT INTO comidas (Nome, Ingredientes, Valor) VALUES (?,?,?)");
                stmt.setString(1, c.getNome());
                stmt.setString(2, c.getIngredientes());
                stmt.setDouble(3, c.getValor());

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
    
    /*Neste método é listado todas as comidas e bebidas para aparecerem na interface gráfica*/
    public List<Comidas> read(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Comidas> comida = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM comidas");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Comidas c = new Comidas();
                
                c.setId(rs.getInt("idComidas"));
                c.setNome(rs.getString("Nome"));
                c.setIngredientes(rs.getString("Ingredientes"));
                c.setValor(rs.getDouble("Valor"));
                comida.add(c);                
            }        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return comida;
        
    }
    
        /*Neste método acontece a alteração das informações de certa comida ou bebida, caso necessário no banco de dados*/
        public void update(Comidas c) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("UPDATE comidas SET Nome = ?, Ingredientes = ?, Valor = ? WHERE idComidas = ?");
                stmt.setString(1, c.getNome());
                stmt.setString(2, c.getIngredientes());
                stmt.setDouble(3, c.getValor());
                stmt.setInt(4, c.getId());

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
      
   /*Neste método acontece a exclusão de certa comida ou bebida no banco de dados*/     
   public void delete(Comidas c) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("DELETE FROM comidas WHERE idCOmidas = ?");
                stmt.setInt(1, c.getId());

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
