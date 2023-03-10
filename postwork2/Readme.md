## Postwork Sesión 2: Patrón Decorador

### 🎯 OBJETIVO

- Resolver un problema utilizando patrones de diseño
- Construir la solución utilizando Gradle

### DESARROLLO

En esta sesión aprendimos la importancia de los patrones de diseño en el desarrollo y el cómo pueden facilitarnos la solución de diversos problemas a través de la Programación Orientada a Objetos. 

Recuerda que todo lo trabajado en tu prework, así como durante la sesión, puede ser aplicado a tu proyecto personal. 

El postwork se realizará en equipo, los cuales serán formados previamente a la sesión uno.

**Asegúrate de comprender:**
1. Cómo construir una solución utilizando Gradle
2. Las diferentes categorías de Patrones de Diseño
3. En qué casos utilizar un patrón de diseño determinado


**Indicaciones generales:**

Una cadena de helados muy famosa en el país ha solicitado tu ayuda para implementar una nueva versión de su sistema actual. Sus productos disponibles son los siguientes:


- Helado Suave	**$30**
- Con Cobertura	**$20 extra**
- Con Granola 	**$10 extra**
- Con Topping	**$20 extra**

El sistema actualmente está diseñado con Programación Orientada a Objetos usando el lenguaje Java y tienen una clase por cada variante de los productos, como se muestra a continuación:

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
 
La inclusión de estos productos complica el desarrollo del sistema actual debido a que habría que agregar todas las variantes de los productos viejos con los nuevos. Por lo tanto el sistema **no es mantenible**.

Tú misión será crear la nueva versión del sistema utilizando el patrón Decorador de los patrones estructurales, así como un programa que permita probar la nueva implementación.

A continuación te dejamos una lista de recursos donde podrás estudiar más acerca de este patrón:
- [https://refactoring.guru/es/design-patterns/decorator](https://refactoring.guru/es/design-patterns/decorator)
- [https://www.javacodegeeks.com/2015/09/decorator-design-pattern.html](https://www.javacodegeeks.com/2015/09/decorator-design-pattern.html)
- [https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/](https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/)

<br>

1. Baja el código en tu computadora.

2. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle.build
   ```

3. Modifica comentando y descomentado los complementos
del helado que no deseas incluir en la orden

4. Ejecuta el comando gradle dentro del folder postwork.
   ``` 
   gradle run
   ```
![Ejecutando postwork2](images/postwork1Solved.png)
   

[**`Siguiente`** -> postwork](../postwork3/)

[**`Regresar`**](../)