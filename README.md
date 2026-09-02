# Sistema de Retos JavaFX - Ejercicios en Pareja
**Universidad Americana (UAM) - Ingeniería en Sistemas**

Este repositorio contiene la resolución de tres retos prácticos enfocados en el manejo de eventos y el diseño de interfaces gráficas utilizando JavaFX bajo el patrón de arquitectura Modelo-Vista-Controlador (MVC).

## Descripción de los Módulos

* **Reto 1: Inventario de Pulpería**
  Módulo para el registro de productos. Implementa validaciones estrictas para campos vacíos y valores numéricos. Utiliza `ActionEvent` para guardar registros y `KeyEvent` para ejecutar búsquedas al presionar la tecla ENTER.

* **Reto 2: Recepción de Café**
  Sistema para gestionar los lotes entregados por productores agrícolas. Los datos se muestran en un `TableView`. Incluye un `MouseEvent` para mostrar detalles adicionales al hacer doble clic y un `ContextMenu` para eliminar lotes con su respectiva alerta de confirmación.

* **Reto 3: Tienda de Artesanías**
  Catálogo de productos artesanales. Su interfaz principal está estructurada con un `MenuBar` (Catálogo, Ventas, Ayuda) y un `ToolBar` con acciones rápidas (Nuevo, Guardar, Buscar). Los productos se visualizan en una tabla con representación simulada de imágenes.

## Tecnologías Utilizadas
* **Lenguaje:** Java 17+
* **Framework UI:** JavaFX 21
* **Gestor de Dependencias:** Maven
* **Estructura:** MVC (Archivos FXML separados de la lógica)

## Estructura del Proyecto
```text
src/main/
├── java/ni/edu/uam/pae_eventos_javafx_equipo_2/
│   ├── Main.java                 # Punto de entrada
│   ├── controllers/              # Controladores de eventos (Main, Reto1, 2, 3)
│   └── models/                   # Entidades de datos (LoteCafe, Artesania)
└── resources/views/              # Archivos de diseño FXML
