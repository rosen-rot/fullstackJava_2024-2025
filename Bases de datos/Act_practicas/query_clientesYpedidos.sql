SELECT * FROM clientes;
SELECT * FROM pedidos;

-- DROP TABLE IF EXISTS pedidos;
/*CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    fecha DATE NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id) ON DELETE CASCADE
);*/


-- INSERCIÓN DE 5 CLIENTES
INSERT INTO clientes (nombre, direccion, telefono) VALUES
('Juan Pérez', 'Calle 123, Ciudad A', '123456789'),
('María López', 'Avenida 456, Ciudad B', '987654321'),
('Carlos Gómez', 'Plaza 789, Ciudad C', '456123789'),
('Ana Rodríguez', 'Boulevard 101, Ciudad D', '789456123'),
('Luis Fernández', 'Calle 202, Ciudad E', '321654987');

-- INSERCIÓN DE 10 PEDIDOS
INSERT INTO pedidos (cliente_id, fecha, total) VALUES
(1, '2024-02-01', 150),
(2, '2024-02-02', 200),
(3, '2024-02-03', 350),
(4, '2024-02-04', 120),
(5, '2024-02-05', 450),
(1, '2024-02-06', 90),
(2, '2024-02-07', 310),
(3, '2024-02-08', 275),
(4, '2024-02-09', 180),
(5, '2024-02-10', 500);

-- PROYECCIÓN DE TODOS LOS CLIENTES Y SUS PEDIDOS
SELECT c.id, c.nombre, p.id AS pedido_id, p.fecha, p.total 
FROM clientes c 
LEFT JOIN pedidos p ON c.id = p.cliente_id;

-- PROYECCIÓN DE LOS PEDIDOS DE UN CLIENTE ESPECÍFICO (Ejemplo con cliente_id = 2)
SELECT * FROM pedidos WHERE cliente_id = 2;

-- CÁLCULO DEL TOTAL DE TODOS LOS PEDIDOS POR CLIENTE
SELECT c.id, c.nombre, SUM(p.total) AS total_pedidos
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nombre;

-- ELIMINACIÓN DE UN CLIENTE Y SUS PEDIDOS ASOCIADOS (Ejemplo con cliente_id = 3)
DELETE FROM clientes WHERE id = 3;

-- PROYECCIÓN DE LOS 3 CLIENTES CON MÁS PEDIDOS, ORDENADOS DESCENDENTEMENTE
SELECT c.id, c.nombre, COUNT(p.id) AS total_pedidos
FROM clientes c
JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nombre
ORDER BY total_pedidos DESC
LIMIT 3;