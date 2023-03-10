## Postwork Sesi贸n 4: Aplicaci贸n de l铆nea de comandos

### 馃幆 OBJETIVO

- Implementar una aplicaci贸n de l铆nea de comandos utilizando Spring Boot

### DESARROLLO

El postwork se realizar谩 en equipo, los cuales ser谩n formados previamente a la sesi贸n uno.

Dentro de las muchas bondades con las que cuenta en Framework de Spring, y en particular Spring Boot, se encuentra la opci贸n de poder ejecutar comandos al momento de iniciar la aplicaci贸n. Gracias a esto puedes proporcionar algunas instrucciones, rutas, o valores particulares a tu aplicaci贸n.

En este postwork deber谩s implementar la interface `CommandLineRunner` que proporciona Spring Boot, para que por medio de l铆nea de comandos solicite dos valores y los establezca como atributos de una clase `Persona`. 

Recuerda que para leer datos a trav茅s de una l铆nea de comandos se utiliza la clase `Scanner` del paquete `java.util`.

Recuerda que en el archivo de configuraci贸n de Gradle debes agregar la siguiente l铆nea:

```groovy
bootRun {
  standardInput = System.in
}
```


<br/>

1. Baja el c贸digo en tu computadora.

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