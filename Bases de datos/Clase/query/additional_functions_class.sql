SELECT * FROM usuarios;

SELECT nombre as apodo FROM usuarios; -- AS se usa para renombrar una tabla temporal
SELECT SUM(edad) as sumatoria_edad FROM usuarios; -- SUM(atributo) Se usa para generar una sumatoria de los valores
SELECT AVG(total) as promedio FROM pedidos; -- AVG(atributo) calcula el promedio
SELECT COUNT(id) FROM pedidos; -- COUNT cuenta la cantidad de resultados, muentras cuantos id hay en la tabla pedidos
SELECT CONCAT(nombre, edad) FROM usuarios; -- Une las columnas
SELECT * FROM pedidos; #Selecciona TODO de la tabla pedidos
SELECT YEAR(created_at) as anio_compra FROM pedidos; -- Selecciona el año de created_at y lo renombra como "anio_compra de la tabla pedidos"