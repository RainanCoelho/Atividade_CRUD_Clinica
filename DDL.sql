CREATE TABLE aluno(
	id_aluno SERIAL PRIMARY KEY,
	nome VARCHAR(100),
	matricula VARCHAR(10)
)

CREATE TABLE turma(
	id_turma SERIAL PRIMARY KEY,
	quantidade_aluno INT,
	codigo VARCHAR(10),
	id_aluno INTEGER REFERENCES aluno(id_aluno)
)

CREATE TABLE curso(
	id_curso SERIAL PRIMARY KEY,
	nome_curso VARCHAR(50),
	codigo VARCHAR(50),
	id_aluno INTEGER REFERENCES aluno(id_aluno),
	id_turma INTEGER REFERENCES turma(id_turma)
)




