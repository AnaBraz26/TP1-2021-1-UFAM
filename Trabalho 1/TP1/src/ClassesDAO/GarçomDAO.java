/* Neste classe foram criados métodos para que haja intereção entre o banco de dados
e o código em java*/

package ClassesDAO;

/**
 *
 * @author anaca
 */
import beans.Garçom;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GarçomDAO{
	
    /*Neste método é feito o cadastro do garçom. Informações, como Nome e Salário, fazem parte desse método */
    public void create(Garçom g) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("INSERT INTO garçom (Nome,Salário) VALUES (?,?)");
                stmt.setString(1, g.getNome());
                stmt.setDouble(2, g.getSalario());

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
    
    /*Neste método é listado todos os garçons para aparecerem na interface gráfica*/
    public List<Garçom> read(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Garçom> garçons = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM garçom");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Garçom g = new Garçom();
                
                g.setId(rs.getInt("idGarçom"));
                g.setNome(rs.getString("Nome"));
                g.setSalario(rs.getDouble("Salário"));
                garçons.add(g);                
            }        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return garçons;
        
    }
    
   /*Neste método acontece a alteração das informações do garçom, caso necessário no banco de dados*/
        public void update(Garçom g) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("UPDATE garçom SET Nome = ?, Salário = ? WHERE idGarçom = ?");
                stmt.setString(1, g.getNome());
                stmt.setDouble(2, g.getSalario());
                stmt.setInt(3, g.getId());

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
      
   /*Neste método acontece a exclusão do garçom no banco de dados*/     
   public void delete(Garçom g) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("DELETE FROM garçom WHERE idGarçom = ?");
                stmt.setInt(1, g.getId());

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
