## Postwork Sesión 4: Aplicación de línea de comandos

### 🎯 OBJETIVO

- Implementar una aplicación de línea de comandos utilizando Spring Boot

### DESARROLLO

El postwork se realizará en equipo, los cuales serán formados previamente a la sesión uno.

Dentro de las muchas bondades con las que cuenta en Framework de Spring, y en particular Spring Boot, se encuentra la opción de poder ejecutar comandos al momento de iniciar la aplicación. Gracias a esto puedes proporcionar algunas instrucciones, rutas, o valores particulares a tu aplicación.

En este postwork deberás implementar la interface `CommandLineRunner` que proporciona Spring Boot, para que por medio de línea de comandos solicite dos valores y los establezca como atributos de una clase `Persona`. 

Recuerda que para leer datos a través de una línea de comandos se utiliza la clase `Scanner` del paquete `java.util`.

Recuerda que en el archivo de configuración de Gradle debes agregar la siguiente línea:

```groovy
bootRun {
  standardInput = System.in
}
```


<br/>

1. Baja el código en tu computadora.

2. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle build
   ```
2. 1. Si trabajas con equipos donde alguno tiene una version mas antigua de 
JDK que la tuya, ejeplo JDK 18; para hacer codigo compatible con tus colegas
revisa estas lineas en gradle.build

![Ejecutando postwork3](images/ConfigJDK1.8ySpringBoot2.7.9.png)

4. Modifica comentando y descomentado los complementos
   del helado que no deseas incluir en la orden

4. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle bootRun
   ```
   
![Ejecutando postwork3](images/postwork4Solved.png)


[**`Siguiente`** -> postwork](../postwork5/)

[**`Regresar`**](../)