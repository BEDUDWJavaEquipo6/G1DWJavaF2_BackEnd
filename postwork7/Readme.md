### Postwork Sesión 7: Integración de Thymeleaf y Spring Boot

### OBJETIVO

- Colocar un formulario que permita crear nuevas entradas en la agenda de nuestro proyecto.
- Almacenar la información en la memoria de la aplicación.
- Mostrar en la pantalla la lista de personas registradas en la agenda (puede ser en la parte inferior de la pantalla del formulario).
- Validar que todos los datos obligatorios se hayan introducido.
- Mostrar un mensaje de error en caso de que algún dato introducido tenga un formato incorrecto.


### DESARROLLO

En ésta ocasión reemplazamos el API con una página web que contenga las siguientes funcionalidades:


1. Muestre la lista de personas registradas en la agenda, ordenadas de forma alfabética.
1. Muestre los teléfonos usando un formato de ##-####-####.
1. Contenga un formulario con validaciones y que permita agregar nuevos registros a la agenda.

Los distintos elementos de la aplicación se conectarán a través de clases “servicio” y empleando controladores de Spring MVC.

</br>


 ---
### INSTRUCCIONES

1. Baja el código en tu computadora.


2. Ejecuta la aplicación directamente desde el IDE de tu preferencia.
``` 
   'Run Postwork7Application'
  ```
3. Ingresa al sitio web:
  ``` 
   http://localhost:8080/personas
  ```
4. Ingresa en el formulario presentado valores que correspondan al campo requerido. 
Nota: los valores introducidos deben ser válidos, de lo contrario el formulario arrojará los errores en validación y deberás intentar nuevamente.  

**Ejemplo de registro**

![img.png](images%2Fimg.png)

5. Una vez ingresados los datos, selecciona **Guardar**.


6. Recibirás un mensaje de confirmación de registro.
![img_1.png](images%2Fimg_1.png)

7. Ingresa diferentes usuarios para conformar una pequeña agenda telefónica. Esto se realiza mediante la selección de la opción **Ingresar otro** 
![img_2.png](images%2Fimg_2.png)
![img_3.png](images%2Fimg_3.png)
![img_4.png](images%2Fimg_4.png)
![img_5.png](images%2Fimg_5.png)
<br>

8. Una vez guardados todos los usuarios, selecciona **Listar personas**

9. Observa en pantalla la agenda telefónica con todos los datos que acabas de ingresar, los cuales se encontrarán ordenados en orden alfabético: 

**Listado y formateo de telefono en orden alfabetico**
![img_6.png](images%2Fimg_6.png)
<br>
  ---
[**`Siguiente`** -> sesión 08](../../Sesion-08/)

[**`Regresar`**](../)
