package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TurmaBD {

	public void insert_values_turma(Connection conn,int quantidade_aluno , String codigo, int id_aluno) {
		Statement statement;
		try {
			String query = String.format("INSERT INTO turma(quantidade_aluno, codigo,id_aluno) VALUES('%d','%s',%s);",quantidade_aluno,codigo,id_aluno);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Insert aplicado!!");	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void update_turma_int(Connection conn,String atributo, int novo_valor, int id_referencia) {
		Statement statement;
		try {
			String query=String.format("UPDATE turma SET %s = %d WHERE id_turma ='%d'",atributo, novo_valor, id_referencia);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Dados atualizados");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void update_turma_string(Connection conn,String atributo, String novo_valor, int id_referencia) {
		Statement statement;
		try {
			String query=String.format("UPDATE turma SET %s = %s WHERE id_turma ='%d'",atributo, novo_valor, id_referencia);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Dados atualizados");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void delete_turma_id(Connection conn, int id_turma) {
		Statement statement;
		try {
			String query=String.format("DELETE FROM turma WHERE id_turma = %d",id_turma);
			statement=conn.createStatement(); 
			statement.executeUpdate(query);
			System.out.println("Dado deletado");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_from(Connection conn) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma");
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s%n","ID_TURMA","QUANTIDADE_ALUNO","CODIGO","ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s%n",
				        rs.getString("id_turma"),
				        rs.getString("quantidade_aluno"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_quantidade_aluno(Connection conn, int qtd_aluno) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma WHERE quantidade_aluno = %d", qtd_aluno);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s%n","ID_TURMA","QUANTIDADE_ALUNO","CODIGO","ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s%n",
				        rs.getString("id_turma"),
				        rs.getString("quantidade_aluno"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_codigo(Connection conn, String codigo) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma WHERE codigo = '%s'", codigo);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s%n","ID_TURMA","QUANTIDADE_ALUNO","CODIGO","ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s%n",
				        rs.getString("id_turma"),
				        rs.getString("quantidade_aluno"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_order_by(Connection conn, String tabela_escolha, String ordem) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma ORDER BY %s %s",tabela_escolha, ordem);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s%n","ID_TURMA","QUANTIDADE_ALUNO","CODIGO","ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s%n",
				        rs.getString("id_turma"),
				        rs.getString("quantidade_aluno"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_where_like(Connection conn, String coluna, String tipo_like, String comando_filtro) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma WHERE %s %s '%s' ",coluna,tipo_like,comando_filtro);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s%n","ID_TURMA","QUANTIDADE_ALUNO","CODIGO","ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s%n",
				        rs.getString("id_turma"),
				        rs.getString("quantidade_aluno"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_join_aluno(Connection conn, String tipo_join) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma %s JOIN aluno ON turma.id_aluno = aluno.id_aluno",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n","ID_TURMA", "QUANTIDADE_ALUNO", "CODIGO",
	                "ID_ALUNO", "ID_ALUNO", "NOME", "MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n",
	                    rs.getString("id_turma"),
	                    rs.getString("quantidade_aluno"),
	                    rs.getString("codigo"),
	                    rs.getString("id_aluno"),
	                    rs.getString("id_aluno"),
	                    rs.getString("nome"),
	                    rs.getString("matricula"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e); 
		}
	}
	
	public void select_join_curso(Connection conn, String tipo_join) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM turma %s JOIN curso ON turma.id_turma = curso.id_turma",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n","ID_TURMA", "QUANTIDADE_ALUNO", "CODIGO",
	                "ID_ALUNO", "ID_ALUNO", "NOME", "MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n",
	                    rs.getString("id_turma"),
	                    rs.getString("quantidade_aluno"),
	                    rs.getString("codigo"),
	                    rs.getString("id_aluno"),
	                    rs.getString("id_aluno"),
	                    rs.getString("nome"),
	                    rs.getString("matricula"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	
	
	
}
