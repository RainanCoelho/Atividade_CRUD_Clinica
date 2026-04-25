package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlunoBD {

	
	public void insert_values_aluno(Connection conn, String nome, String matricula) {
		Statement statement;
		try {
			String query = String.format("INSERT INTO aluno(nome, matricula) VALUES('%s','%s');",nome,matricula);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Insert aplicado!!");	
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void update_aluno(Connection conn,String atributo, String novo_valor, int id_referencia) {
		Statement statement;
		try {
			String query=String.format("UPDATE aluno SET %s = '%s' WHERE id_aluno ='%d'",atributo, novo_valor, id_referencia);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Dados atualizados");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	 
	public void delete_aluno_id(Connection conn, int id_aluno) {
		Statement statement;
		try {
			String query=String.format("DELETE FROM aluno WHERE id_aluno = %d",id_aluno);
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
			String query=String.format("SELECT * FROM aluno");
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s%n","ID_ALUNO","NOME","MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s%n",
				        rs.getString("id_aluno"),
				        rs.getString("nome"),
				        rs.getString("matricula"));
			
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	

	
	public void select_nome(Connection conn, String nome) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM aluno WHERE nome = '%s'", nome);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s%n","ID_ALUNO","NOME","MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s%n",
				        rs.getString("id_aluno"),
				        rs.getString("nome"),
				        rs.getString("matricula"));
			
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_matricula(Connection conn, String matricula) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM aluno WHERE matricula = '%s'", matricula);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s%n","ID_ALUNO","NOME","MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s%n",
				        rs.getString("id_aluno"),
				        rs.getString("nome"),
				        rs.getString("matricula"));
			
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_order_by(Connection conn,String tabela_escolha, String ordem) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM aluno ORDER BY %s %s",tabela_escolha,ordem);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s%n","ID_ALUNO","NOME","MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s%n",
				        rs.getString("id_aluno"),
				        rs.getString("nome"),
				        rs.getString("matricula"));
			
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void select_where_like(Connection conn, String coluna, String tipo_like, String comando_filtro) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM aluno WHERE %s %s '%s' ",coluna,tipo_like,comando_filtro);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s%n","ID_ALUNO","NOME","MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s%n",
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
			String query=String.format("SELECT * FROM aluno %s JOIN curso ON aluno.id_aluno = curso.id_aluno",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n","ID_ALUNO", "NOME_ALUNO", "MATRICULA",
	                "ID_CURSO", "NOME_CURSO", "CODIGO", "ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n",
	                    rs.getString("id_aluno"),
	                    rs.getString("nome"),
	                    rs.getString("matricula"),
	                    rs.getString("id_curso"),
	                    rs.getString("nome_curso"),
	                    rs.getString("codigo"),
	                    rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_join_turma(Connection conn, String tipo_join) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM aluno %s JOIN turma ON aluno.id_aluno = turma.id_aluno",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n","ID_ALUNO", "NOME_ALUNO", "MATRICULA",
	                "ID_TURMA", "QUANTIDADE_ALUNO", "CODIGO", "ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s%n",
	                    rs.getString("id_aluno"),
	                    rs.getString("nome"),
	                    rs.getString("matricula"),
	                    rs.getString("id_turma"),
	                    rs.getString("quantidade_aluno"),
	                    rs.getString("codigo"),
	                    rs.getString("id_aluno"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
}
