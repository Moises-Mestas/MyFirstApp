# Tarea S1 – Fundamentos de Kotlin (implementación personal)

**Repositorio:** https://github.com/Moises-Mestas/MyFirstApp  
**Rama de trabajo:** `tarea-s1`  
**Paquete principal:** `com.example.myfirstapp`  
**Archivo principal:** `app/src/main/java/com/example/myfirstapp/MainActivity.kt`  
**Autor:** *Moises Joaquin Mestas Maque*

---

## 1) ¿Qué hice?
Construí una app mínima con **Jetpack Compose**. Toda la práctica de Kotlin se ejecuta desde `MainActivity` en el método `onCreate`, donde invoco una serie de funciones de demostración. Para ver los resultados, uso **`println(...)`** (aparecen en **Logcat** como `System.out`). La UI muestra un `Text` de bienvenida para verificar que la app corre.

---

## 2) Contenidos demostrados
- **Variables y constantes:** `val`/`var` y `companion object` (`PI`, `MAX_USUARIOS`).  
  → `demoVariablesYConstantes()`
- **Tipos básicos:** `Int`, `Double`, `Float`, `Short`, `Long`, `Byte`, `Boolean`, `Char`, `String`.  
  → `demoTiposBasicos()`
- **Control de flujo:** `if` (con expresión) y `when`.  
  → `demoIf()`, `demoWhen()`
- **Manejo de errores:** `try/catch/finally` con `NumberFormatException`.  
  → `demoTryCatch()`
- **Bucles:** `while`, `for` (rangos y `downTo step`), `forEach`.  
  → `demoWhile()`, `demoFor()`, `demoForeach()`
- **Arreglos y listas:** `arrayOf`, `listOf`, `mutableListOf`.  
  → `demoArrays()`, `demoListas()`
- **Funciones (expresión/puras):** `saludo`, `doble`, `esAdulto`.  
  → `demoFunciones()`
- **Clases y `data class`:** `Persona` (métodos y mutabilidad controlada) y `Usuario`.  
  → `demoClases()`
- **Declarativo vs imperativo:** `filter → map → reduce` vs contador con bucle.  
  → `demoDeclarativaVsImperativa()`

---

## 3) Cómo ejecutar
1. Abrir el proyecto en Android Studio.
2. Ejecutar **Run ▶️** sobre el módulo `app`.
3. Abrir **View → Tool Windows → Logcat** y seleccionar el proceso de la app.
4. Como uso `println`, filtrar por **`System.out`** o por el nombre del paquete para ver las salidas.



## 4) Evidencias (capturas)
Las evidencias se guardan en la raíz del repo como imágenes PNG. Actualmente tengo:

- `Evidencia1.png`
- `Evidencia2.png`



## 5) Respuestas y reflexiones de aprendizaje

1. **Variables y constantes**  
   Usé `val`/`var` y constantes en `companion object` (`PI`, `MAX_USUARIOS`). Prefiero `val` por defecto para dejar clara la intención inmutable y evitar cambios accidentales.

2. **Tipos básicos**  
   Probé `Int`, `Double`, `Float` (sufijo `f`), `Short`, `Long` (sufijo `L`), `Byte`, `Boolean`, `Char` y `String`. Elegir el tipo correcto evita conversiones implícitas y problemas de precisión; el separador `_` mejora la legibilidad.

3. **`if`**  
   Lo usé como instrucción y como **expresión** para asignar `mensaje`. Como expresión reduce código “ceremonial” y hace explícito el valor resultante.

4. **`when`**  
   Mapeé `día → nombre`. Es más claro y mantenible que varios `if-else` y permite casos exhaustivos (útil con `enum`/rangos).

5. **`try/catch/finally`**  
   Atrapé `NumberFormatException` al convertir `"abc".toInt()`. Aprendí a degradar con mensaje en lugar de crashear; alternativa idiomática: `toIntOrNull()`.

6. **`while`**  
   Ciclo controlado por condición previa; lo usé para contar hasta 3. Recordatorio: cuidar la actualización de la condición para evitar bucles infinitos.

7. **`for`**  
   Recorrí rangos (`1..5`) y descendentes con `downTo` y `step`. Los rangos de Kotlin evitan errores “off-by-one” y son muy legibles.

8. **`forEach`**  
   Iteración funcional sobre listas; es limpio cuando solo leo elementos. No admite `break/continue`, así que si necesito cortar, prefiero `for`.

9. **Arrays**  
   Con `arrayOf` muté por índice y observé tamaño fijo. Útil para datos de longitud conocida; para tamaño dinámico prefiero colecciones.

10. **Listas**  
   Diferencié `listOf` (inmutable) y `mutableListOf` (permite `add`). Por defecto usaré inmutables y solo mutables cuando realmente necesite cambios.

11. **Funciones (puras/expresión)**  
   `saludo`, `doble`, `esAdulto` no dependen de estado externo y son fáciles de probar. Los cuerpos de expresión hacen el código breve y claro.

12. **Clases y `data class`**  
   `Persona` muestra estado y comportamiento con `cumplirAnios`; `Usuario` como `data class` me da `toString/equals/copy/hashCode` automáticos, útiles para depuración y tests.

13. **Declarativa vs imperativa**  
   Imperativo: conté pares con bucle y contador. Declarativo: `filter → map → reduce` expresa el “qué” y reduce errores por estado mutable; ganó en concisión y legibilidad.






