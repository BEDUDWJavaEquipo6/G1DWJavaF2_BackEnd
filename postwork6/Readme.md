## Postwork Sesión 6: Introducción a Spring MVC

### OBJETIVO

- Reemplazar la aplicación de línea de comandos por un API Rest que reciba la información de nombre y teléfono.
- Tener un almacenamiento temporal de la información en la memoria.
- Desarrollar un Endpoint que regrese la información almacenada en la agenda.
- La lógica de la aplicación debe estar contenida en una clase “servicio” que deberá recibir todas sus dependencias a través de inyección por constructor.


### INSTRUCCIONES 


1. Baja el código en tu computadora.


2. Ejecuta la aplicación directamente desde el IDE de tu preferencia. 
``` 
   'Run Postwork6Application'
  ```

3. Crea un archivo formato
JSON el cual será enviado como solicitud a nuestra aplicación. Sigue el formato descrito a continuación:

```
{ "nombre": "nombre", 
"apellido": "apellido",
 "edad": ##,
 "id": "XX",
  "telefono":"##-####-##-##"} 
```
4. Mediante *POSTMAN* realiza una solicitud de tipo ***POST*** en la siguiente dirección: 

```
http://localhost:8080/api/v1/phonebook
```
Nota: verifica que la sección **BODY** de la solicitud se encuentre configurada en modo **raw** y con el formato **JSON**.  

* Ejemplo solicitud POST / Verificación en consola.
  ![* Ejecutando postwork6-POST](images/repuestapost.png)

5. Mediante *POSTMAN* realiza una solicitud de tipo ***GET*** en la misma dirección: 

```
http://localhost:8080/api/v1/phonebook
```
Nota: verifica que la solicitud se haya cambiado por una del tipo *GET*.

* Ejemplo solicitud GET 7 Verificación en consola.


  ![* Ejecutando postwork6-POST](images/respuestaget.png)

6. Observa la agenda telefónica creada mediante solicitudes *POST* y *GET*.

[**`Siguiente`** -> sesión 07](../postwork7/)

[**`Regresar`**](../)