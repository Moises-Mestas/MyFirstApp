# Tarea S1 – Fundamentos de Kotlin (Android)

**Proyecto:** MyFirstApp  
**Rama sugerida:** `tarea-s1`  
**Autor:** *Completa tu nombre*

---

## 1) Descripción
App mínima en Android (Jetpack Compose) para demostrar fundamentos de Kotlin a través de funciones que imprimen resultados en Logcat.

Incluye ejemplos de:
- Tipos de datos
- Control de flujo (`if`, `when`)
- Colecciones y operaciones funcionales (`filter`, `map`, `reduce`, `forEach`)
- Funciones puras y expresiones
- Clases y `data class`

---

## 2) Requisitos
- Android Studio (versión reciente)
- JDK y SDK Android configurados
- Dispositivo/emulador con API 24+

---

## 3) Cómo ejecutar
1. Abrir el proyecto en Android Studio.
2. Ejecutar **Run ▶️** sobre `app`.
3. Abrir **Logcat** y filtrar por el proceso de la app (o por el **TAG** `Sesion1` si usaste `Log.d`).

> En esta tarea puedes dejar `println(...)`. Para evidencias más claras, se recomienda añadir:
>
> ```kotlin
> import android.util.Log
> private const val TAG = "Sesion1"
> ```
> y al inicio de cada demo:
> ```kotlin
> Log.d(TAG, "— IF —")
> ```

---

## 4) Estructura (demos incluidas)
Archivo: `MainActivity.kt`
- `demoVariablesYConstantes()`
- `demoTiposBasicos()`
- `demoIf()`
- `demoWhen()`
- `demoTryCatch()`
- `demoWhile()`
- `demoFor()`
- `demoForeach()`
- `demoArrays()`
- `demoListas()`
- `demoFunciones()`
- `demoClases()`
- `demoDeclarativaVsImperativa()`

---

## 5) Evidencias (capturas de Logcat)
Crea una carpeta **`docs/evidencias/`** y coloca capturas en PNG/JPG. Nombra así:

- `01_variables_constantes.png`
- `02_tipos_basicos.png`
- `03_if.png`
- `04_when.png`
- `05_try_catch.png`
- `06_while.png`
- `07_for.png`
- `08_foreach.png`
- `09_arrays.png`
- `10_listas.png`
- `11_funciones.png`
- `12_clases.png`
- `13_declarativa_vs_imperativa.png`

**Cómo obtenerlas en Android Studio:**
1. Abre **Logcat** (View → Tool Windows → Logcat).
2. Marca **Show only selected application** (opcional).
3. Si usas `Log.d(TAG, ...)`, escribe `Sesion1` en el filtro.
4. Ejecuta la app y toma la captura (icono de cámara o `Save as file`).

**Alternativa por terminal (opcional):**
```bash
adb logcat -s Sesion1:D *:S > docs/evidencias/demo_if.txt
```

---

## 6) Respuestas y reflexiones de aprendizaje
**Responde brevemente (2–4 líneas) y agrega ejemplos:**

1. Diferencia entre **colección inmutable** y **mutable** en Kotlin. Ejemplifica con `listOf` y `mutableListOf`.
2. ¿Cuándo usarías `when` en vez de múltiples `if-else`? Da un caso concreto.
3. Explica con tus palabras la diferencia entre **estilo imperativo** y **declarativo**. Menciona una ventaja del declarativo.
4. ¿Qué hace `filter → map → reduce` en tu ejemplo y qué devuelve cada etapa?
5. ¿Por qué `data class` resulta útil? Cita `Usuario(id, correo)`.
6. ¿Qué aprendiste al manejar errores con `try/catch` en `NumberFormatException`?

**Reflexión personal (3–5 bullets):**
- …
- …
- …

---

## 7) Cómo entregar

### Opción A – Enlace a Git
1. Crea la rama `tarea-s1` y sube cambios:
   ```bash
   git checkout -b tarea-s1
   git add .
   git commit -m "Tarea S1: demos Kotlin y evidencias"
   git push -u origin tarea-s1
   ```
2. Comparte la URL del repositorio o del Pull Request.

### Opción B – ZIP
1. Comprímelo desde el sistema operativo **excluyendo** `/.gradle`, `/build/` y `/app/build/` para reducir tamaño.
2. Entrega el archivo: `MyFirstApp_tarea-s1.zip`.

---

## 8) Estructura sugerida del repositorio
```
MyFirstApp/
├─ app/
├─ docs/
│  └─ evidencias/
│     ├─ 01_variables_constantes.png
│     └─ ...
├─ README.md
└─ .gitignore
```

---

## 9) Notas
- Si escondiste los Tool Windows (Project, Logcat), ve a **Window → Restore Default Layout** o usa **Alt+1** (Project) y **View → Tool Windows → Logcat**.
- Para pruebas repetibles, reinicia la app entre capturas para limpiar el Logcat.
