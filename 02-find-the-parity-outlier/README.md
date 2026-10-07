# #02 - Find The Parity Outlier

## Problem Description
You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer `N`. Write a method that takes the array as an argument and returns this "outlier" `N`.

**Examples:**
- `[2, 4, 0, 100, 4, 11, 2602, 36]` --> `11` (the only odd number)
- `[160, 3, 1719, 19, 11, 13, -21]` --> `160` (the only even number)

---

## Solución Propuesta

### Algoritmo
1. **Determinar la paridad mayoritaria:** Evaluamos los primeros 3 números del arreglo. Si al menos 2 son pares, la mayoría del arreglo es par (por lo que buscamos un impar). De lo contrario, la mayoría es impar (buscamos un par).
2. **Filtrar el valor atípico (Outlier):** Recorremos el arreglo comprobando si el número actual no coincide con la paridad mayoritaria.
3. **Manejo de valores negativos:** Usamos `n % 2 != 0` para evitar errores de signo con números negativos.
