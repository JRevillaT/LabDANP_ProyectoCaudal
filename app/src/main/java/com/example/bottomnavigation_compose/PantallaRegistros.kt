package com.example.bottomnavigation_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun PantallaRegistros() {
    Column() {
        Text(
            text = "Registros",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))


        Column(
            modifier = Modifier
                .wrapContentSize(Alignment.Center)
                .align(CenterHorizontally)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(width = 350.dp, height = 150.dp)
                    .background(color = Color.LightGray)
                    .wrapContentSize(Alignment.Center)




            ) {
                Column() {
                    Row(modifier = Modifier
                        .fillMaxWidth()) {
                        Icon(
                            Icons.Rounded.ShoppingCart,
                            contentDescription = stringResource(id = androidx.compose.ui.R.string.in_progress)
                        )
                        Text(text = "Sensor", textAlign = TextAlign.Center)
                        Text(text = "Hace N horas", textAlign = TextAlign.Right)
                    }
                    Text(text = "Altitud: ")
                    Text(text = "Profundidad: ")
                    Text(text = "Presion: ")
                    Text(text = "Temperatura: ")
                }
            }
        }
    }
}