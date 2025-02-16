-- Query es una consulta a la base de datos mediante instrucciones que se mandan al servidor

-- CRUD: Create Read Update Delete
-- SELECT: Selecciona información de una tabla

SELECT * FROM usuarios; -- SELECT * FROM <table> -> Selecciona todas las columnas de la tabla

SELECT nombre, edad FROM usuarios; -- SELECT <column> --> Selecciona la columna especifica

SELECT nombre, edad FROM usuarios WHERE id = 2; -- Filtra la búsqueda de datos de acuerdo el id

SELECT * FROM usuarios WHERE edad > 20; 

SELECT * FROM usuarios WHERE nombre LIKE "Aureliano"; -- Realiza una comparación de texto
SELECT * FROM usuarios WHERE nombre LIKE "Al%"; -- % comodin, puede obtener cualquier nombre que inicie con "al"
SELECT * FROM usuarios WHERE nombre LIKE "%o"; -- nombres que terminan en "o"
SELECT * FROM usuarios WHERE nombre LIKE "%e%"; -- nombres que contengan la letra "e"

-- Cuando buscamos algo especifico, no es necesario usar LIKE
-- SELECT * FROM empleados WHERE departamente = "Ventas";

-- && AND: Ambas condiciones deben cumplirse, se pueden usar infinito
SELECT * FROM usuarios WHERE nombre LIKE "%o" AND edad > 23; -- Debe ser un nombre que acabe en "o" y sea mayor de 23 años

-- || OR: Una u otra condicion se debe cumplir
SELECT * FROM usuarios WHERE nombre LIKE "%o" OR edad > 23;

-- ORDER BY: Ordena alfabeticamente
SELECT * FROM usuarios ORDER BY nombre; -- ASC (A-Z) o DESC (Z-A) / ASC (1-9999) o DESC (9999-1)

-- LIMIT: limita la informacion que se muestra, es una forma de ordenar, debe ir con el ORDER BY
SELECT * FROM usuarios ORDER BY edad DESC LIMIT 0,3; -- for(int i=0; i < 3; i++);