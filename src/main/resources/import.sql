INSERT INTO usuarios (nombre, apellido) VALUES('Cristian', 'Gaona');
INSERT INTO usuarios (nombre, apellido) VALUES('Daniel', 'Gaona');
INSERT INTO usuarios (nombre, apellido) VALUES('Juan', 'Gaona');

INSERT INTO empleados (id, apellidos, create_at, nombres, rol) VALUES (NULL, 'Jaramillo', NULL, 'Pedro', 'ASESOR');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol) VALUES (NULL, 'Valarezo', NULL, 'Valeria', 'ASESOR');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol) VALUES (NULL, 'Rodriguez', NULL, 'José', 'ASESOR');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol) VALUES (NULL, 'Carrión', NULL, 'Fernando', 'ASESOR');

INSERT INTO vehiculos (id, anio, create_at, marca, modelo) VALUES (NULL, '2020', NULL, 'Nissan', 'Frontier'); 
INSERT INTO vehiculos (id, anio, create_at, marca, modelo) VALUES (NULL, '2020', NULL, 'Nissan', 'Kicks');
INSERT INTO vehiculos (id, anio, create_at, marca, modelo) VALUES (NULL, '2020', NULL, 'Nissan', 'Qashqai');
INSERT INTO vehiculos (id, anio, create_at, marca, modelo) VALUES (NULL, '2020', NULL, 'Nissan', 'Versa');
INSERT INTO vehiculos (id, anio, create_at, marca, modelo) VALUES (NULL, '2020', NULL, 'Nissan', 'XTrail');

INSERT INTO clientes (id, apellidos, correo_electronico, create_at, detalle, nombres, profesion, telefono_casa, telefono_movil, empleado_id) VALUES (NULL, 'Correa', 'ra.correa90@gmail.com', NULL, 'Cliente desea que le envíen el catálogo del vehículo de su interés', 'Andrés', 'Ingeniero', '072721817', '0986245602', '2');

INSERT INTO clientes_vehiculos (clientes_id, vehiculos_id) VALUES (1, 2), (1, 1);