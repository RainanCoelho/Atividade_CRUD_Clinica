package CRUD;

import java.sql.Connection;

public class Main {

public static void main(String[]args) {
		
		ConexãoBD db = new ConexãoBD();
		Connection conn = db.connect_to_db("BDclinica", "postgres", "posthabbgres16");
		AlunoBD aluno = new AlunoBD();
		//aluno.insert_values_aluno(conn, "Adalberto", "129889889");
		//aluno.update_aluno(conn, "nome", "Marcos", 1);
		//aluno.delete_aluno_id(conn, 2);
		//aluno.select_from(conn);
		//aluno.select_nome(conn, "Marcos");
		//aluno.select_matricula(conn, "123456789");
		//aluno.select_order_by(conn,"nome", "asc");
		//aluno.select_join_turma(conn,"inner");
		//aluno.select_join_curso(conn, "full");
		//aluno.select_join_turma(conn, "inner");
		//aluno.select_where_like(conn, "nome", "ilike", "%n%");

		TurmaBD turma = new TurmaBD();
		//turma.insert_values_turma(conn, 30, "98765", 1);
		//turma.update_turma_int(conn, "quantidade_aluno",50, 1);
		//turma.update_turma_string(conn, "codigo", "765", 5);
		//turma.delete_turma_id(conn, 6);
		//turma.select_from(conn);
		//turma.select_codigo(conn, "123");
		//turma.select_order_by(conn, "id_turma", "asc");
		//turma.select_where_like(conn, "codigo", "ilike", "%3%");
		//turma.select_join_aluno(conn, "inner");
		
		CursoBD curso = new CursoBD();
		//curso.insert_values_curso(conn, "Engenharia", "55555", 4, 2);
		//curso.update_curso(conn, "nome_curso", "Sociologia", 4);
		//curso.delete_curso_id(conn, 6);
		//curso.select_from(conn);
		//curso.select_codigo(conn, "12345");
		//curso.select_nome_curso(conn, "Matemática");
		//curso.select_order_by(conn, "codigo", "asc");
		//curso.select_where_like(conn, "nome_curso", "ilike", "%m%");
		//curso.select_join_aluno(conn, "inner");
		//curso.select_join_turma(conn, "inner");





}	
}

