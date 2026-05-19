
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



