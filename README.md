# Sistema de Inventario – Java + MySQL

## Descripción
Sistema de gestión de inventario con interfaz gráfica en Java (JFrame)
y conexión a base de datos MySQL. Permite registrar productos y
visualizarlos mediante JTable. Implementa el patrón de diseño MVC
(Modelo – Vista – Controlador).

## Tecnologías
- Java
- JFrame / Swing (interfaz gráfica)
- MySQL Workbench
- MySQL Connector/J
- NetBeans IDE

## Funcionalidades
- Registro de productos en la base de datos
- Listado de productos con JTable
- Arquitectura MVC separada por paquetes

## Estructura del proyecto
- `ConexionMySQL.java` – Configuración de la conexión a MySQL
- `conectar.java` – Lógica de conexión
- `Producto.java` – Modelo del producto
- `Registro.java` – Registro de datos en la base de datos
- `ListarProductos.java` – Consulta y listado de productos
- `formulario_RegistrarProducto` – Vista del formulario
- `Controlador_del_formulario_Regi...` – Controlador del formulario
- `Index.java` – Pantalla de inicio
- `Principal.java` – Clase principal

## Estado del proyecto
⚠️ En desarrollo – La conexión a MySQL está siendo corregida.

## Cómo ejecutarlo
1. Clonar el repositorio
2. Abrir el proyecto en NetBeans
3. Nota: la conexión a la base de datos está en proceso de corrección
