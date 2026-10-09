# #10 - Sum of Digits / Digital Root

## Problem Description
Digital root is the recursive sum of all the digits in a number.

Given $n$, take the sum of the digits of $n$. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

**Examples:**
- `16`  --> `1 + 6 = 7`
- `942` --> `9 + 4 + 2 = 15` --> `1 + 5 = 6`
- `132189` --> `1 + 3 + 2 + 1 + 8 + 9 = 24` --> `2 + 4 = 6`

---

## Solución Propuesta

### Algoritmo
1. **Fórmula Matemática (Módulo 9):** La raíz digital de un número $n > 0$ coincide matemáticamente con $1 + (n - 1) \pmod 9$.
2. **Evaluación de Cero:** Si $n = 0$, la raíz digital es $0$.
3. **Optimización:** Esto permite resolver el problema en complejidad temporal $O(1)$ sin necesidad de bucles o recursión.

