package com.example.miapp.interfaz

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
fun Registro(
    navegarRoles: () -> Unit, navegarLogin: () -> Unit
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
                    onClick = { navegarRoles() }
                ) {
                    Text(text = "Atras")
                }
            }
        }

        Box() {
            Column(
                Modifier.padding(20.dp).fillMaxWidth().clickable { /*navegarRoles()*/ },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Registro",
                    style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold))
            }
        }

        Box() {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CamposRegistro("Nombre Completo")
                CamposRegistro("Correo Electronico")
                CamposRegistro("Nombre Usuario")
                CamposRegistro("Contrasena Usuario")
                CamposRegistro("Fecha de Nacimiento")
            }
        }

        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { navegarLogin() },
                    modifier = Modifier
                        .padding(20.dp)
                        .size(300.dp, 50.dp)
                        .clip(RoundedCornerShape(20))
                ) {
                    Text(text = "Registrarse", fontSize = 20.sp)
                }
            }
        }
    }
}

@Composable
fun CamposRegistro(nombre: String) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        label = { Text(text = "$nombre")})
}