package com.example.miapp.interfaz.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miapp.interfaz.Navegacion.Presentacion.*
import com.example.miapp.interfaz.Registro
import com.example.miapp.interfaz.Roles
import com.example.miapp.interfaz.Login

@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Roles.ruta){

        composable(Roles.ruta){
            Roles(
                navegarRegistro = { navController.navigate(Registro.ruta) }
            )
        }

        composable(Registro.ruta){
            Registro(
                navegarRoles = { navController.navigate(Roles.ruta) },
                navegarLogin = { navController.navigate(Login.ruta) }
            )

        }

        composable(Login.ruta){
            Login(
                navegarRegistro = { navController.navigate(Registro.ruta) }
            )
        }

    }
}