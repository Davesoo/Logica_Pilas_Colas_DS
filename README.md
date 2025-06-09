# Práctica de Algoritmos de Ordenamiento  
📌 **Información General**  
**Título:** Práctica de Ordenamiento con Pila  
**Asignatura:** Estructura de Datos  
**Carrera:** Computación  
**Estudiante:** Dave Fernando Sigüenza Vallejo - Grupo 2  
**Fecha:** 08 / 06 / 2025  
**Profesor:** Ing. Pablo Torres  

---

## 🛠️ Descripción

Este proyecto implementa un **algoritmo de ordenamiento utilizando exclusivamente pilas**. Se simula el ordenamiento sin el uso de arreglos u otras estructuras lineales como listas o colas, respetando la lógica de una pila (LIFO).

### Funcionalidades:

- Estructura de datos personalizada: `Stack`.
- Ordenamiento ascendente de los valores enteros en la pila.
- Visualización de la pila antes y después del ordenamiento.

---

## ⚙️ ¿Cómo Funciona?

1. Se construye una pila con elementos ingresados manualmente (en código o por consola).
2. Se llama al método `sort(Stack)` que ordena los elementos de la pila utilizando una pila auxiliar.
3. Se muestra la pila antes y después del ordenamiento.

> **Nota:** No se usa ningún tipo de arreglo o lista para el ordenamiento. Solo se emplean estructuras tipo `Stack` definidas por el estudiante.

---

## 🚀 Ejecución

Para compilar y ejecutar el proyecto desde consola:

```bash
javac App.java
java App
O bien, puedes ejecutar directamente la clase MainSorting.java del paquete Ejercicio_02_sorting.

🧑‍💻 Ejemplo de Salida
plaintext
Copiar
Editar
---- MENÚ PRINCIPAL ----
1. Validar signos
2. Ordenar pila
0. Salir
Opción: 2

Pila antes de ordenar:
4 | 1 | 3 | 2 | 

Pila ordenada:
1 | 2 | 3 | 4 |
