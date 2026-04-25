
SELECT * FROM aluno
WHERE nome ILIKE '%m%'

SELECT * FROM turma
WHERE quantidade_aluno > 30

SELECT * FROM aluno
RIGHT JOIN turma ON aluno.id_aluno = turma.id_aluno

SELECT * FROM turma
INNER JOIN aluno ON aluno.id_aluno = turma.id_aluno

SELECT * FROM curso
LEFT JOIN turma ON curso.id_turma = turma.id_turma
