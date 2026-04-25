INSERT INTO aluno(nome,matricula)
VALUES
	('Rainan','456832196'),
	('Gustavo','246754324');

INSERT INTO turma(quantidade_aluno,codigo,id_aluno)
VALUES
	(20,'123',3),
	(35,'234',4),
	(40,'345',5);

INSERT INTO curso(nome,codigo,id_aluno,id_turma)
VALUES
	('Matemática','12345',1,2),
	('Inglês','54321',1,3);

--Essencial para que o código entenda que o nome_curso seja diferente do nome que está na tabela aluno(Feito especialmente para os JOINs)
ALTER TABLE curso RENAME COLUMN nome to nome_curso

UPDATE aluno
SET nome = 'Marlon'
WHERE id_aluno = 1

UPDATE turma
SET quantidade_aluno = 25
WHERE id_turma = 4

DELETE FROM turma
WHERE id_turma = 5






