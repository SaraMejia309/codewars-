# #06 - Get the Middle Character

## Problem Description
You are going to be given a non-empty string. Your job is to return the middle character(s) of the string.

- If the string's length is odd, return the middle character.
- If the string's length is even, return the middle 2 characters.

**Examples:**
- `"test"` --> `"es"`
- `"testing"` --> `"t"`
- `"middle"` --> `"dd"`
- `"A"` --> `"A"`

---

## Solución Propuesta

### Algoritmo
1. **Longitud e Índice Medio:** Se obtiene la longitud de la palabra `len` y se calcula el punto medio como `len / 2`.
2. **Evaluación de Paridad:**
   - Si la longitud es par (`len % 2 == 0`), se extrae una subcadena de 2 caracteres desde `middle - 1` hasta `middle + 1`.
   - Si la longitud es impar, se extrae el único carácter ubicado en el índice `middle`.
3. **Retorno:** Se devuelve el resultado obtenido mediante `substring()`.
