# #03 - Sum of positive

## Task
You get an array of numbers, return the sum of all of the positives ones.

**Example:**
`[1, -4, 7, 12]` => $1 + 7 + 12 = 20$

**Note:**
If there is nothing to sum, the sum is default to `0`.

---

## Solución Propuesta

### Algoritmo
1. **Acumulador:** Se declara una variable `sum = 0` para almacenar la suma total.
2. **Iteración:** Se recorre el arreglo con un bucle *for-each*.
3. **Condición de Positivos:** Se evalúa si el número actual es mayor a cero (`num > 0`). Si es así, se añade al acumulador.
4. **Retorno:** Se devuelve el resultado final. Si no había números positivos, retorna `0` por defecto.
