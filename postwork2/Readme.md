## Postwork Sesi贸n 2: Patr贸n Decorador

### 馃幆 OBJETIVO

- Resolver un problema utilizando patrones de dise帽o
- Construir la soluci贸n utilizando Gradle

### DESARROLLO

En esta sesi贸n aprendimos la importancia de los patrones de dise帽o en el desarrollo y el c贸mo pueden facilitarnos la soluci贸n de diversos problemas a trav茅s de la Programaci贸n Orientada a Objetos. 

Recuerda que todo lo trabajado en tu prework, as铆 como durante la sesi贸n, puede ser aplicado a tu proyecto personal. 

El postwork se realizar谩 en equipo, los cuales ser谩n formados previamente a la sesi贸n uno.

**Aseg煤rate de comprender:**
1. C贸mo construir una soluci贸n utilizando Gradle
2. Las diferentes categor铆as de Patrones de Dise帽o
3. En qu茅 casos utilizar un patr贸n de dise帽o determinado


**Indicaciones generales:**

Una cadena de helados muy famosa en el pa铆s ha solicitado tu ayuda para implementar una nueva versi贸n de su sistema actual. Sus productos disponibles son los siguientes:


- Helado Suave	**$30**
- Con Cobertura	**$20 extra**
- Con Granola 	**$10 extra**
- Con Topping	**$20 extra**

El sistema actualmente est谩 dise帽ado con Programaci贸n Orientada a Objetos usando el lenguaje Java y tienen una clase por cada variante de los productos, como se muestra a continuaci贸n:

```java
class HeladoSuave {
  //...
}

class HeladoSuaveConCobertura {
  // ...
}

class HeladoSuaveConGranola {
  // ...
}

class HeladoSuaveConTopping {
  // ...
}

class HeladoSuaveConCoberturaYToping {
  // ...
}

class HeladoSuaveConToppingYGranola {
  // ...
}

class HeladoSuaveConCoberturaYGranola {
  // ...
}
```

La cadena busca agregar nuevos extras:

- Con Mermelada	**$10 extra**
- Con Galleta		**$15 extra**
 
La inclusi贸n de estos productos complica el desarrollo del sistema actual debido a que habr铆a que agregar todas las variantes de los productos viejos con los nuevos. Por lo tanto el sistema **no es mantenible**.

T煤 misi贸n ser谩 crear la nueva versi贸n del sistema utilizando el patr贸n Decorador de los patrones estructurales, as铆 como un programa que permita probar la nueva implementaci贸n.

A continuaci贸n te dejamos una lista de recursos donde podr谩s estudiar m谩s acerca de este patr贸n:
- [https://refactoring.guru/es/design-patterns/decorator](https://refactoring.guru/es/design-patterns/decorator)
- [https://www.javacodegeeks.com/2015/09/decorator-design-pattern.html](https://www.javacodegeeks.com/2015/09/decorator-design-pattern.html)
- [https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/](https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/)

<br>

1. Baja el c贸digo en tu computadora.

2. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle build
   ```

3. Modifica comentando y descomentado los complementos
del helado que no deseas incluir en la orden

4. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle run
   ```
![Ejecutando postwork2](images/postwork2Solved.png)
   

[**`Siguiente`** -> postwork](../postwork3/)

[**`Regresar`**](../)