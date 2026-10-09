# #08 - Removing Elements

## Problem Description
Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

**Example:**
`["Keep", "Remove", "Keep", "Remove", "Keep", ...]` --> `["Keep", "Keep", "Keep", ...]`

**Note:**
None of the arrays will be empty, so you don't have to worry about that!

---

## Solución Propuesta

### Algoritmo
1. **Cálculo del Nuevo Tamaño:** Al conservar un elemento sí y otro no, el tamaño del nuevo arreglo será la mitad del original (redondeado hacia arriba), es decir, `(arr.length + 1) / 2`.
2. **Construcción del Arreglo:** Se itera únicamente sobre los índices pares (`i += 2`) del arreglo original y se asignan de forma secuencial al arreglo resultante.
3. **Retorno:** Se devuelve el nuevo arreglo con los elementos alternados.

