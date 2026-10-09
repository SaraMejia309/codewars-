# #09 - Number of n-element permutations with k inversions

## Problem Description
Given an array of $n$ integers containing the numbers $1$ to $n$, what is the number of **unique** permutations that contain **exactly** $k$ inversions?

An inversion is defined as a pair of indices $(i, j)$ with $i < j$, such that $\text{permutation}[i] > \text{permutation}[j]$.

---

## Solución Propuesta

### Algoritmo
1. **Programación Dinámica:** Se utiliza una matriz $dp[n + 1][k + 1]$ donde $dp[i][j]$ representa el número de permutaciones de tamaño $i$ con exactamente $j$ inversiones.
2. **Relación de Recurrencia:** Al insertar el $i$-ésimo elemento en una permutación de tamaño $i-1$, se pueden agregar entre $0$ y $i-1$ nuevas inversiones dependiendo de la posición de inserción:
   $$dp[i][j] = \sum_{m=0}^{\min(j, i-1)} dp[i-1][j-m]$$
3. **Casos Base:** $dp[i][0] = 1$ para todo $i$, ya que solo hay una permutación ordenada (con 0 inversiones).