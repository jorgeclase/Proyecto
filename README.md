# Proyecto: Gestor de Equipaciones de Fútbol

Este proyecto es una aplicación en Java que permite gestionar un catálogo de equipaciones de fútbol. Permite realizar operaciones de **alta**, **baja**, **modificación** y **visualización** de las equipaciones disponibles.

## Tabla de Contenidos

1. En ese proyecto podremos añadir nuevas equipaciones , eliminar las no deseadas , editar y mostrar todas las equipaciones disponibles en el catalogo
2. [Instrucciones de Uso]
3. [Instrucciones para Desarrolladores]
4. ![image](https://github.com/user-attachments/assets/316a3b68-1de8-4b43-b441-1c4b36c19478)

5. 5. Apache 2.0



El gestor de equipaciones permite manejar un catálogo de equipaciones de fútbol a través de una interfaz de texto. Las equipaciones se almacenan en un archivo de texto (`equipaciones.txt`), y el programa ofrece opciones para:

- Agregar una nueva equipación
- Eliminar una equipación existente
- Modificar una equipación
- Mostrar todas las equipaciones disponibles

### Estructura del Proyecto

El proyecto se compone de las siguientes clases:

- Equipacion: Representa los datos de una equipación (equipo, temporada, color).
- CatalogoEquipaciones: Gestiona la lista de equipaciones y su persistencia en el archivo.
- Interfaz: Proporciona el menú de usuario y las interacciones de entrada/salida.
- Principal: Clase principal que ejecuta la aplicación.

Instrucciones de Uso



Compilar y Ejecutar

1. Clonar o descargar el proyecto
2. Abrir una terminal en el directorio del proyecto.
3. Ejecutar el siguiente comando para compilar, generar el archivo JAR y la documentación Javadoc usando el `Makefile`:

