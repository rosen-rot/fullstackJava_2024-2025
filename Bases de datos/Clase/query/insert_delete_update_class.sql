SELECT * FROM usuarios; -- Seleccionamos la informacion/atributos/columnas de la tabla usuarios

-- INSERT: Crear un nuevo registro en una tabla
INSERT INTO usuarios(nombre, edad, direccion_id) VALUES ("Juana", 30, 4);

-- DELETE: Elimina un registro
DELETE FROM usuarios where id = 8;

-- UPDATE: Actualiza un registro
UPDATE usuarios SET edad = 31 WHERE id = 9; -- Cambia la edad del usuario 9



