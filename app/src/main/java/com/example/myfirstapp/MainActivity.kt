package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme


class MainActivity : ComponentActivity() {

    // Constantes
    companion object {
        const val PI = 3.1416
        const val MAX_USUARIOS = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("===== SESIÓN 1: FUNDAMENTOS KOTLIN =====")
        demoVariablesYConstantes()
        demoTiposBasicos()
        demoIf()
        demoWhen()
        demoTryCatch()
        demoWhile()
        demoFor()
        demoForeach()
        demoArrays()
        demoListas()
        demoFunciones()
        demoClases()
        demoDeclarativaVsImperativa()

        // 🔹 PARTE VISUAL (Se muestra en el emulador)
        setContent {
            MyFirstAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(
                        text = "Hola soy Moises, esta es mi primera app!",
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }
    }

    // 1) Variables y constantes
    private fun demoVariablesYConstantes() {
        println("— Variables y Constantes —")
        val nombre = "Persona"
        var edad = 28
        println("Nombre: $nombre, Edad: $edad")
        edad += 1
        println("Edad actualizada: $edad")

        val ciudad: String = "CiudadX"
        var altura: Double = 1.75
        println("Ciudad: $ciudad, Altura: $altura")

        var correoOpcional: String? = null
        println("Correo (inicial): $correoOpcional")
        correoOpcional = "usuario@dominio.com"
        println("Correo (asignado): $correoOpcional")

        println("PI = $PI, MAX_USUARIOS = $MAX_USUARIOS")
    }

    // 2) Tipos básicos
    private fun demoTiposBasicos() {
        println("— Tipos Básicos —")
        val numeroEntero: Int = 42
        val numeroDecimal: Double = 3.99
        val numeroFlotante: Float = 5.5f
        val numeroCorto: Short = 120
        val numeroLargo: Long = 3_000_000_000L
        val numeroByte: Byte = 120
        val esActivo: Boolean = true
        val letra: Char = 'A'
        val texto: String = "Kotlin"

        println("Int: $numeroEntero, Double: $numeroDecimal, Float: $numeroFlotante")
        println("Short: $numeroCorto, Long: $numeroLargo, Byte: $numeroByte")
        println("Boolean: $esActivo, Char: $letra, String: $texto")
    }

    // 3) IF
    private fun demoIf() {
        println("— IF —")
        val edad = 20
        if (edad >= 18) println("Es mayor de edad") else println("Es menor de edad")
        val mensaje = if (edad >= 18) "Mayor" else "Menor"
        println("Mensaje: $mensaje")
    }

    // 4) WHEN
    private fun demoWhen() {
        println("— WHEN —")
        val dia = 1
        val nombreDia = when (dia) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miércoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sábado"
            7 -> "Domingo"
            else -> "Desconocido"
        }
        println("Día $dia = $nombreDia")
    }

    // 5) Try/Catch
    private fun demoTryCatch() {
        println("— Try/Catch —")
        try {
            val numero = "abc".toInt()
            println(numero)
        } catch (e: NumberFormatException) {
            println("Error de formato: ${e.message}")
        } finally {
            println("Finalmente: bloque ejecutado")
        }
    }

    // 6) While
    private fun demoWhile() {
        println("— While —")
        var contador = 1
        while (contador <= 3) {
            println("Contador: $contador")
            contador++
        }
    }

    // 7) For
    private fun demoFor() {
        println("— For —")
        for (i in 1..5) println("i = $i")
        for (i in 10 downTo 6 step 2) println("desc = $i")
    }

    // 8) forEach
    private fun demoForeach() {
        println("— forEach —")
        val letras = listOf("A", "B", "C")
        letras.forEach { println(it) }
    }

    // 9) Arrays
    private fun demoArrays() {
        println("— Arrays —")
        val numeros = arrayOf(1, 2, 3, 4)
        println("Tam: ${numeros.size}, primero: ${numeros[0]}")
        numeros[0] = 99
        println("Mutado primero: ${numeros[0]}")
    }

    // 10) Listas
    private fun demoListas() {
        println("— Listas —")
        val inmutable = listOf("Manzana", "Pera", "Uva")
        val mutable = mutableListOf("Rojo", "Azul")
        println("Inmutable: $inmutable")
        mutable.add("Verde")
        println("Mutable: $mutable")
    }

    // 11) Funciones
    private fun demoFunciones() {
        println("— Funciones —")
        println(saludo("Estudiante"))
        println("Doble de 7 = ${doble(7)}")
        println("Es adulto(18) = ${esAdulto(18)}")
    }

    private fun saludo(nombre: String): String = "Hola, $nombre"
    private fun doble(x: Int): Int = x * 2
    private fun esAdulto(edad: Int): Boolean = edad >= 18

    // 12) Clases
    private fun demoClases() {
        println("— Clases —")
        val p = Persona(nombre = "Ana", edad = 30)
        println(p.presentacion())
        p.cumplirAnios()
        println("Después de cumplir años: ${p.edad}")
        val u = Usuario(id = 1, correo = "ana@dominio.com")
        println("Usuario: $u")
    }

    class Persona(val nombre: String, var edad: Int) {
        fun presentacion() = "Soy $nombre y tengo $edad años"
        fun cumplirAnios() { edad++ }
    }

    data class Usuario(val id: Int, val correo: String)

    // 13) Declarativa vs Imperativa
    private fun demoDeclarativaVsImperativa() {
        println("— Declarativa vs Imperativa —")
        val numeros = listOf(1, 2, 3, 4, 5, 6)

        var conteoPares = 0
        for (n in numeros) {
            if (n % 2 == 0) conteoPares++
        }
        println("Imperativo - pares: $conteoPares")

        val pares = numeros.filter { it % 2 == 0 }
        val cuadrados = pares.map { it * it }
        val suma = cuadrados.reduce { acc, n -> acc + n }

        println("Declarativo - pares: $pares")
        println("Declarativo - cuadrados: $cuadrados")
        println("Declarativo - suma de cuadrados: $suma")
    }
}
