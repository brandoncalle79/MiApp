package com.example.miapp.interfaz.Navegacion

sealed class Presentacion(
    val ruta: String
) {
    object Roles: Presentacion("Roles")
    object Registro: Presentacion("Registro")
    object Login: Presentacion("Login")
}
