/* Essa classe realiza a conexão entre o código java e o banco de dados sql*/
package Conexao;

/**
 *
 * @author anaca
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexao {
	
        // Declaração das variáveis necessárias
        private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String user = "root";
	private static final String password = "112417sma";

        //Nesse método é feita a conexão com o banco de dados, em caso de erro um erro é lançado
	public static Connection getConnection()
	{
		try
		{
                    Class.forName(DRIVER);
                    return DriverManager.getConnection(url, user,password);
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			throw new RuntimeException("Erro na conexão: ", ex);
		}
	}
	
        //Nesse método é feito o fechamento da conexão
	public static void closeConnection(Connection con)
	{
		try {
			if(con != null) {
				con.close();
			}
		}
		catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
		}
	}
	
        //Nesse método é feito o fechamento da conexão e da instrução que é passada pro banco de dados
	public static void closeConnection(Connection con, PreparedStatement stmt)
	{
		closeConnection(con);
		
		try {
			if(stmt != null) {
				stmt.close();
			}
		}
		catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
		}
	}
	
        //Nesse método é feito o fechamento da conexão, da instrução e dos resultados guardados no banco de dados
	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs)
	{
		closeConnection(con,stmt);
		
		try {
			if(rs != null) {
				rs.close();
			}
		}
		catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
		}
	}
}