SELECT * FROM cursos;
SELECT * FROM estudiantes;
SELECT * FROM inscripciones;

-- DESC inscripciones;
-- DROP TABLE IF EXISTS inscripciones;
/*CREATE TABLE inscripciones (
    id_estudiante INT,
    id_curso INT,
    PRIMARY KEY (id_estudiante, id_curso),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id) ON DELETE CASCADE,
    FOREIGN KEY (id_curso) REFERENCES cursos(id) ON DELETE CASCADE
);*/


-- Insertar estudiantes
INSERT INTO estudiantes (nombre, edad) VALUES
('Ana López', 22),
('Carlos Pérez', 25),
('María González', 20),
('Juan Torres', 23),
('Sofía Ramírez', 21);

-- Insertar cursos
INSERT INTO cursos (nombre, duracion) VALUES
('Matemáticas', 12),
('Historia', 8),
('Programación', 16),
('Física', 10);

-- Asociar estudiantes con cursos
INSERT INTO inscripciones (id_estudiante, id_curso) VALUES
(1, 1), (1, 2),
(2, 1), (2, 3),
(3, 4), (3, 2),
(4, 3), (4, 4);

-- Proyectar estudiantes y sus cursos inscritos
SELECT estudiantes.nombre AS Estudiante, cursos.nombre AS Curso 
FROM inscripciones
JOIN estudiantes ON inscripciones.id_estudiante = estudiantes.id
JOIN cursos ON inscripciones.id_curso = cursos.id;

-- Proyectar los estudiantes inscritos en un curso específico
SELECT e.nombre AS estudiante
FROM inscripciones i
JOIN estudiantes e ON i.id_estudiante = e.id
JOIN cursos c ON i.id_curso = c.id
WHERE c.nombre = 'Matemáticas';

-- Proyectar los cursos en los que está inscrito un estudiante específico
SELECT c.nombre AS curso
FROM inscripciones i
JOIN estudiantes e ON i.id_estudiante = e.id
JOIN cursos c ON i.id_curso = c.id
WHERE e.nombre = 'Ana López';

-- Contar el número de estudiantes en cada curso
SELECT c.nombre AS curso, COUNT(i.id_estudiante) AS num_estudiantes
FROM cursos c
LEFT JOIN inscripciones i ON c.id = i.id_curso
GROUP BY c.id, c.nombre;

-- Encontrar estudiantes no inscritos en ningún curso
SELECT e.nombre AS estudiante
FROM estudiantes e
LEFT JOIN inscripciones i ON e.id = i.id_estudiante
WHERE i.id_estudiante IS NULL;