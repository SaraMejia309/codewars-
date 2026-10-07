# #04 - Return Negative

## Problem Description
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

**Examples:**
- `Kata.makeNegative(1);` // return -1
- `Kata.makeNegative(-5);` // return -5
- `Kata.makeNegative(0);` // return 0

**Notes:**
- The number can be negative already, in which case no change is required.
- Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

---

## Solución Propuesta

### Algoritmo
1. **Evaluación de Signo:** Se verifica si el número ingresado `x` es mayor a 0.
2. **Transformación:** Si es positivo, se retorna su opuesto multiplicado por -1 (o `-x`).
3. **Casos Negativo y Cero:** Si ya es menor o igual a 0, se retorna el mismo valor sin modificaciones.
4. **Forma Directa:** Se puede simplificar usando `Math.abs()` o un operador ternario: `x > 0 ? -x : x`.

---