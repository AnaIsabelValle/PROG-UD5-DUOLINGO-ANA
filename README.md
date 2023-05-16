# PROG-UD5-DUOLINGO-ANA Practica 2

- Autor:
  - Nombre:
    - Ana Isabel González Rosales
  - Fecha:
    - Mayo 2023
  - git:
    - <https://github.com/AnaIsabelValle/PROG-UD5-DUOLINGO-ANA>

## Introducción:

![unnamed.jpg](unnamed.jpg)
Nos solicita la empresa Duolingo Inc una elaboración de una aplicación para usuarios. El objetivo es que los usuarios puedan acceder al diccionario y poder interactuar de la siguiente manera: añadir, eliminar palabras, etc.

## Análisis:

Se basa en una estructura de datos donde implementa un menú dónde el usuario puede interactuar:

1. Añadir palabra:
2. Eliminar palabra:
3. Existe palabra:
4. Mostrar iniciales disponibles:
5. Ver palabras por inicial:
6. Cerrar programa.

## Sintaxis:

1. Creación de paquetes:
   1. Paquete raíz llamado **com**, incluye:
      1. Paquete **duolingo**, que se componen de :
         1. Paquete **diccionario**
         2. Paquete **utilidades**
2. Creación de clases:
   1. Dentro del paquete **duolingo**, se encuentra la clase ejecutable:
      1. **Main**
   2. Dentro del paquete **diccionario**, se ha creado la clase:
      1. **Diccionario**, donde se implentan los métodos.
   - Quedando los paquetes y clases de la siguiente manera:
   3. Dentro del paquete **utilidades**, se ha craeado la clase:
      1. **MenuDccionario**, siendo sus funciones y métodos:
         1. **Añadir palabra:** Permite inntroducir y almacenar
         2. **Eliminar palabra:** Solicita al usuario la palabra que será eliminada
         3. **Existe palabra:** Solicita al usuario la palabra que buscará en el diccionario
         4. **Mostrar iniciales** disponibles: Muestra una lista de palabras
         5. **Ver palabras por inicial:** Mostrar las palabras almacenadas
         6. **Cerrar programa**
   4. En la clase ejecutable**Main**:
      Creación del Objeto menu
