-- JOIN: combinar datos de dos o más tablas basándose en una condición lógica definida. 
-- Sirve para relacionar tablas que tienen datos conectados entre sí, generalmente mediante claves primarias y claves foráneas.
-- ON:  usa para especificar la condición que debe cumplirse para combinar las filas de dos tablas en una consulta con un JOIN.

-- SELECT <column> FROM <table1> JOIN <table2> ON <table1>.foreingKey = <table2>.primaryKey

-- Union entre usuarios y direcciones (1:1)
SELECT * FROM usuarios JOIN direcciones ON usuarios.direccion_id = direcciones.id; 
-- Devuelve todas las columnas de la tabla usuarios, combinadas con las columnas de la tabla direcciones donde existan coincidencias en el id de dirección entre ambas tablas.



-- Union entre la tabla pedidos y usuarios (1:n)
SELECT * FROM pedidos JOIN usuarios ON usuario_id = usuarios.id;



-- Union entre usuarios y usuarios_has_hobbies, usuarios_has_hobbies y hobbies (n:m)
-- SELECT columnas FROM <tabla1>
-- JOIN <tabla_intermediaria> ON <tabla1>.llave_primaria = <tabla_intermediaria>.llave_foranea
-- JOIN <tabla2> ON <tabla2>.llave_primaria = <tabla_intermediaria>.llave_foranea

SELECT * FROM usuarios
JOIN usuarios_has_hobbies ON usuarios.id = usuarios_has_hobbies.usuario_id
JOIN hobbies ON hobbies.id = usuarios_has_hobbies.hobbie_id
WHERE actividad = 'Patinar' #selecciona solo los que tienen de actividad patinar
ORDER BY nombre DESC; #lo pone en orden descendente 
