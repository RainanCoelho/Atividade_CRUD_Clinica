package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CursoBD {

	public void insert_values_curso(Connection conn,String nome_curso , String codigo, int id_aluno, int id_turma) {
		Statement statement;
		try {
			String query = String.format("INSERT INTO curso(nome_curso, codigo,id_aluno,id_turma) VALUES('%s','%s','%d','%d');",nome_curso, codigo,id_aluno, id_turma);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Insert aplicado!!");	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void update_curso(Connection conn,String atributo, String novo_valor, int id_referencia) {
		Statement statement;
		try {
			String query=String.format("UPDATE curso SET %s = '%s' WHERE id_curso ='%d'",atributo, novo_valor, id_referencia);
			statement=conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Dados atualizados");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	
	public void delete_curso_id(Connection conn, int id_curso) {
		Statement statement;
		try {
			String query=String.format("DELETE FROM curso WHERE id_curso = %d",id_curso);
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
			String query=String.format("SELECT * FROM curso");
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s %-10s%n","ID_CURSO","NOME_CURSO","CODIGO","ID_ALUNO","ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
				        rs.getString("id_curso"),
				        rs.getString("nome_curso"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"),
				        rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_nome_curso(Connection conn, String nome_curso) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso WHERE nome_curso = '%s'", nome_curso);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s %-10s%n","ID_CURSO","NOME_CURSO","CODIGO","ID_ALUNO","ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
				        rs.getString("id_curso"),
				        rs.getString("nome_curso"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"),
				        rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_codigo(Connection conn, String codigo) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso WHERE codigo = '%s'", codigo);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s %-10s%n","ID_CURSO","NOME_CURSO","CODIGO","ID_ALUNO","ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
				        rs.getString("id_curso"),
				        rs.getString("nome_curso"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"),
				        rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_order_by(Connection conn, String tabela_escolha, String ordem) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso ORDER BY %s %s",tabela_escolha, ordem);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s %-10s%n","ID_CURSO","NOME_CURSO","CODIGO","ID_ALUNO","ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
				        rs.getString("id_curso"),
				        rs.getString("nome_curso"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"),
				        rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_where_like(Connection conn, String coluna, String tipo_like, String comando_filtro) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso WHERE %s %s '%s' ",coluna,tipo_like,comando_filtro);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-20s %-10s %-10s %-10s%n","ID_CURSO","NOME_CURSO","CODIGO","ID_ALUNO","ID_TURMA");
			while (rs.next()) {
				System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
				        rs.getString("id_curso"),
				        rs.getString("nome_curso"),
				        rs.getString("codigo"),
				        rs.getString("id_aluno"),
				        rs.getString("id_turma"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void select_join_aluno(Connection conn, String tipo_join) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso %s JOIN aluno ON curso.id_aluno = aluno.id_aluno",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s %-10s%n","ID_CURSO", "NOME_CURSO", "CODIGO",
	                "ID_ALUNO", "ID_TURMA", "ID_ALUNO","NOME", "MATRICULA");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-10s %-10s%n",
	                    rs.getString("id_curso"),
	                    rs.getString("nome_curso"),
	                    rs.getString("codigo"),
	                    rs.getString("id_aluno"),
	                    rs.getString("id_turma"),
	                    rs.getString("id_aluno"),
	                    rs.getString("nome"),
						rs.getString("matricula"));
			}
			
			
			
		}catch(Exception e){
			System.out.println(e); 
		}
	}
	
	public void select_join_turma(Connection conn, String tipo_join) {
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("SELECT * FROM curso %s JOIN turma ON curso.id_turma = turma.id_turma",tipo_join);
			statement=conn.createStatement();
			rs=statement.executeQuery(query);
			System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-15s %-10s %-10s%n","ID_CURSO", "NOME_CURSO", "CODIGO",
	                "ID_ALUNO", "ID_TURMA", "ID_TURMA","QUANTIDADE_ALUNO","CODIGO", "ID_ALUNO");
			while (rs.next()) {
				System.out.printf("%-10s %-15s %-15s %-10s %-15s %-10s %-15s %-10s %-10s%n",
	                    rs.getString("id_curso"),
	                    rs.getString("nome_curso"),
	                    rs.getString("codigo"),
	                    rs.getString("id_aluno"),
	                    rs.getString("id_turma"),
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
