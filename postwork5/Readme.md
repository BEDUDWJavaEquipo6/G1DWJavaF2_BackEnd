## Postwork Sesión 5: Inversión de Control (IoC) en Spring Boot

### 🎯 OBJETIVO

- Extender el programa de línea de comandos para utilizar el IoC de Spring Boot de manera que: 
1. Valide que el número de teléfono solo contenga caracteres válidos: números, guion medio y espacio en blanco.
1. Valide que el número de teléfono contenga 10 dígitos.
1. Si se tiene un número válido, elimine todos los caracteres que no sean numéricos.
1. De al número de teléfono un formato de (##)-####-#### antes de imprimirlo en la consola.


### INSTRUCCIONES


1. Baja el código en tu computadora.

2. Si trabajas con equipos donde alguno tiene una version mas antigua de
   JDK que la tuya, ejeplo JDK 18; para hacer codigo compatible con tus colegas
   revisa estas lineas en gradle.build

![Ejecutando postwork3](images/ConfigJDK1.8ySpringBoot2.7.9.png)


3. Ejecuta la aplicación desde el IDE de tu preferencia, o con el comando gradle dentro del folder postwork.
   ``` 
   gradle bootRun
   ```
   
4. Interactúa con la aplicación mediante la consola del IDE seleccionado. 
* Ejecutando postwork5 con teléfono con formato válido
![Ejecutando postwork5Teléfono valido](images/ValidPhone.png)


En caso de introducir un teléfono con un formato no permitido por la aplicación, se obtendrá el siguiente resultado: 

* Ejecutando postwork5 con teléfono con formato no válido
![Ejecutando postwork5-Teléfono no valido](images/NotValidPhone.png)

5. En caso de obtener un error con el formato, regresar al paso 3 e introducir un nuevo teléfono- 

[**`Siguiente`** -> postwork](../postwork6/)

[**`Regresar`**](../)