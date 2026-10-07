# #01 - Square(n) Sum (8 kyu)

## Problem Description
Complete the square sum function so that it squares each number passed into it and then sums the results together.

**Example:**
For `[1, 2, 2]` it should return `9` because:
$$1^2 + 2^2 + 2^2 = 9$$

---

## Solucion Propuesta

### Algoritmo
1. **Acumulador:** Se inicializa una variable `sum = 0` para almacenar el resultado acumulado.
2. **Iteración:** Se recorre el arreglo de enteros mediante un bucle *for-each*.
3. **Cálculo:** En cada iteración, el elemento actual se eleva al cuadrado (`num * num`) y se suma al acumulador.
4. **Retorno:** Se devuelve el resultado final acumulado.
