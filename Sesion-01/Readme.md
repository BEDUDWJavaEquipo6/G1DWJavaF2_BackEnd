## Postwork sesión 1: Compilación de markdown

### 🎯 OBJETIVO

- Compilar un archivo en lenguaje Markdown a HTML

### DESARROLLO

En esta sesión aprendimos qué es Gradle y cómo podemos utilizarlo para automatizar procesos como compilación y ejecución
de proyectos. Una parte fundamental son los plugins que nos ayudarán a extender el potencial de Gradle en nuestros 
proyectos.


**Asegúrate de comprender:**

1. Se creo un archivo de configuración de Gradle 'build.gradle' como indica la documentación del plugin 
[Gradle Markdown Plugin](https://github.com/kordamp/markdown-gradle-plugin).

```
   
plugins {
    id "org.kordamp.gradle.markdown" version "2.2.0"
}

```

2. Se crea la estructura de archivos:
```
/ProjectoPostwork1
   |
   /src
      |
      /mardown
      /html 
```

4. Se colocan todos los archivos a convertir en los siguientes folders:
   - <*.html> en el folder *src/html*
   - <*.md>   en el folder *src/markdown*

   
4. Ejecutan los comandos:
    - *gradle markdownToHTML*
    - *gradle HTMLToMarkdown*
    
   (De tener errores de escritura Mayúsculas/minúsculas el comando aún así se ejecuta)


5. Los productos resultantes o archivos convertidos se encuentyran en el subfolder *build*

**Todos los archivos se convertiran en BULK o grupo**

[**`Siguiente`** -> sesión 02](../../Sesion-02/)

[**`Regresar`**](../)