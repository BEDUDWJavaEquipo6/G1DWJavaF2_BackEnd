### Postwork Sesión 7: Integración de Thymeleaf y Spring Boot

### OBJETIVO

- Colocar un formulario que permita crear nuevas entradas en la agenda de nuestro proyecto.
- Almacenar la información en la memoria de la aplicación.
- Mostrar en la pantalla la lista de personas registradas en la agenda (puede ser en la parte inferior de la pantalla del formulario).
- Validar que todos los datos obligatorios se hayan introducido.
- Mostrar un mensaje de error en caso de que algún dato introducido tenga un formato incorrecto.


### DESARROLLO

En esta sesión aprendimos a usar Thymeleaf como un motor de plantillas que nos permite generar páginas HTML del lado del servidor, para mostrar al cliente una vista dinámica con información generada en el servidor.

Además aprendimos la forma de validar y recibir la información proporcionada por el usuario a través de un formulario, y la forma de mostrar esta información en la página.

El postwork se realizará en equipo, los cuales serán formados previamente a la sesión uno.

**Asegúrate de comprender:**

1. Cómo integrar Thymeleaf en un proyecto Spring Boot.
2. Realizar validaciones de los datos de entrada.
3. Mostrar mensajes de error.


**Indicaciones generales**

En el Postwork de la sesión anterior continuamos con la implementación de nuestra agenda, recibiendo los datos a través de un API REST.

En ésta ocasión reemplazamos el API con una página web que contenga las siguientes funcionalidades.

En el Postwork de la sesión anterior continuamos con la implementación de nuestra agenda, recibiendo los datos a través de un API REST. En ésta ocasión reemplazamos el API con una página web que contenga las siguientes funcionalidades.

1. Muestre la lista de personas registradas en la agenda, ordenadas de forma alfabética.
1. Muestre los teléfonos usando un formato de ##-####-####.
1. Contenga un formulario con validaciones y que permita agregar nuevos registros a la agenda.

Los distintos elementos de la aplicación se conectarán a través de clases “servicio” y controladores de Spring MVC.

</br>


 ---
**Capturas de ingreso de registros y guardado de datos**  <br>
  
![img.png](images%2Fimg.png)
![img_1.png](images%2Fimg_1.png)
![img_2.png](images%2Fimg_2.png)
![img_3.png](images%2Fimg_3.png)
![img_4.png](images%2Fimg_4.png)
![img_5.png](images%2Fimg_5.png)
<br>
**Listado y formateo de telefono en orden alfabetico**
![img_6.png](images%2Fimg_6.png)
<br>
  ---
[**`Siguiente`** -> sesión 08](../../Sesion-08/)

[**`Regresar`**](../)
