package com.example.miapp.interfaz

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Roles(
    navegarRegistro: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box() {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Boton(nombre = "Administrador")
                Boton(nombre = "Cajero")
                Boton(nombre = "Encargado del Salon")
            }
        }

        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { navegarRegistro() },
                    modifier = Modifier
                        .size(300.dp, 70.dp)
                        .clip(RoundedCornerShape(20))
                ) {
                    Text(text = "Registrarse", fontSize = 20.sp)
                }
            }
        }
    }
}

@Composable
fun Boton(nombre: String, modifier: Modifier = Modifier,) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .width(280.dp)
            .height(90.dp)
            .padding(20.dp)
            .clip(RoundedCornerShape(15))
            .background(color = Color.LightGray)
            .clickable { /* TODO */ }
    ) {
        Texto(nombre)
    }
}

@Composable
fun Texto(nombre: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = "$nombre",
        textAlign = TextAlign.Center,
        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.Black)
    )
}
