## Postwork Sesión 8: Conexión a base de datos con Spring Data

### OBJETIVO

- Almacenar la información de la agenda en una base de datos relacional MySQL.
- Recuperar las personas contenidas en la agenda desde la base de datos para mostrarlas en pantalla.
- Que la información ingresada no desaparezca al momento de reiniciar la aplicación.


### DESARROLLO

En esta sesión aprendimos a usar Spring Data JPA como mecanismo para realizar el trabajo en una base de datos relacional. Spring Data JPA hace uso de Hibernate como motor de persistencia y este realiza las conversiones entre objetos Java a tablas de la base de datos para que no tengamos que preocuparnos por escribir ni una sola línea de SQL.

Además aprendimos dos diferentes formas de inicializar la información en la base de datos, la primera usando la interface CommandLineRunner y la segunda usando archivos SQL.

El postwork se realizará en equipo, los cuales serán formados previamente a la sesión uno.

**Asegúrate de comprender:**

1. Cómo integrar Spring Data JPA en un proyecto Spring Boot.
2. La forma de configurar la conexión a la base de datos.
3. Qué es una entidad, un repositorio, y cómo integrarlos en la aplicación.

**Indicaciones generales**

En el Postwork de la sesión anterior le dimos a nuestra agenda una interfaz de usuario muy sencilla. Con ella ya podemos ingresar en un formulario la información de las personas, y recuperar la misma para mostrarla en una lista. Sin embargo, debido a que estamos usando un almacén en memoria, cada vez que reiniciamos la aplicación perdemos la información que ya habíamos guardado.


En esta ocasión tu misión será extender este programa eliminando el `Set` en donde almacenamos la información de la agenda, y reemplzándolo por una base de datos relacional en MySQL. De esta forma, aunque reiniciemos la aplicación la información seguirá estando disponible.

1. Deberás integrar las depencias de Spring data JPA y el driver de MySQL en el archivo `build.gradle`.
1. Reemplaza la clase `AgendaMemoryDao` por un repositorio de Spring Data.
1. Convierte la clase `Persona` en una entidad de JPA.
1. Los distintos elementos de la aplicación se conectarán a través de clases “servicio” y controladores de Spring MVC.


</br>

[**`Regresar`**](../)