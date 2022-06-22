package com.example.miapp.interfaz

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(
    navegarRegistro: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Button(
                    onClick = { navegarRegistro() }
                ) {
                    Text(text = "Atras")
                }
            }
        }

        Box() {
            Column(
                Modifier.padding(20.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Iniciar Sesion",
                    style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)
                )
            }
        }

        Box() {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CamposRegistro("Nombre Usuario")
                CamposRegistro("Contraseña")
            }
        }

        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .padding(20.dp)
                        .size(300.dp, 50.dp)
                        .clip(RoundedCornerShape(20))
                ) {
                    Text(text = "Iniciar Sesion", fontSize = 20.sp)
                }
            }
        }
    }
}