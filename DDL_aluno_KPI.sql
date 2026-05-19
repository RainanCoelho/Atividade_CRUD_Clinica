CREATE TABLE aluno (
	id_aluno SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	curso VARCHAR(100)
)

CREATE TABLE caso_clinico (
	id_caso_clinico SERIAL PRIMARY KEY,
	nota INT,
	id_aluno INTEGER REFERENCES aluno(id_aluno)
)

INSERT INTO aluno (nome, curso) VALUES
('Rafael Silva', 'Medicina'),
('Mariana Costa', 'Enfermagem'),
('Lucas Oliveira', 'Fisioterapia'),
('Beatriz Souza', 'Medicina'),
('Carlos Mendes', 'Enfermagem'),
('Fernanda Lima', 'Fisioterapia'),
('João Pereira', 'Medicina'),
('Ana Clara Rocha', 'Enfermagem'),
('Pedro Henrique', 'Fisioterapia'),
('Juliana Alves', 'Medicina'),
('Gabriel Martins', 'Enfermagem'),
('Larissa Gomes', 'Fisioterapia'),
('Thiago Ribeiro', 'Medicina'),
('Camila Fernandes', 'Enfermagem'),
('Felipe Araújo', 'Fisioterapia'),
('Amanda Carvalho', 'Medicina'),
('Bruno Dias', 'Enfermagem'),
('Patrícia Nunes', 'Fisioterapia'),
('Vinícius Teixeira', 'Medicina'),
('Eduarda Melo', 'Enfermagem');

INSERT INTO caso_clinico (nota, id_aluno) VALUES
(8, 1),
(9, 2),
(7, 3),
(10, 4),
(8, 5),
(6, 6),
(9, 7),
(8, 8),
(10, 9),
(7, 10),
(9, 11),
(10, 12),
(5, 13),
(8, 14),
(9, 15),
(6, 16),
(10, 17),
(8, 18),
(7, 19),
(9, 20);


SELECT * FROM aluno WHERE curso = 'Medicina'

SELECT * FROM aluno WHERE curso = 'Enfermagem'

SELECT * FROM aluno WHERE curso = 'Fisioterapia'

SELECT curso, COUNT(*) FROM aluno GROUP BY curso

SELECT aluno.nome, caso_clinico.nota FROM aluno JOIN caso_clinico ON aluno.id_aluno = caso_clinico.id_aluno ORDER BY nota DESC LIMIT 10

SELECT COUNT(DISTINCT aluno) AS "total alunos" FROM aluno

SELECT curso, AVG(nota) FROM aluno JOIN caso_clinico ON aluno.id_aluno = caso_clinico.id_aluno GROUP BY curso

SELECT CASE WHEN nota >= 7 THEN 'Aprovados' ELSE 'Reprovados' END AS status, COUNT(*) AS quantidade FROM caso_clinico GROUP BY status;

SELECT AVG(nota) FROM caso_clinico

SELECT nota, COUNT(*) AS quantidade_alunos FROM caso_clinico GROUP BY nota ORDER BY nota;

SELECT  nota, COUNT(*) AS quantidade_alunos FROM caso_clinico GROUP BY nota ORDER BY nota
