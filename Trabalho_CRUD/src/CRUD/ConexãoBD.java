package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexãoBD {

	public Connection connect_to_db(String dbname,String user,String password) {
		Connection conn = null;
		try {
			
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,password);
			if(conn!=null) {
				System.out.println("Conexão com sucesso");
			
			}else {
				System.out.println("Conexão falhou");
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	

	
}
