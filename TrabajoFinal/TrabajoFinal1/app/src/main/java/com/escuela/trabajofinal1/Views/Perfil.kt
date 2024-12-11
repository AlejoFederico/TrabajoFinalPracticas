package com.escuela.trabajofinal1.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.escuela.trabajofinal1.Navigation.AppScreens

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun Perfil(navController: NavController){

    //Barra superior del Perfil

    Scaffold(topBar = {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp,40.dp,0.dp,0.dp)
            .drawWithContent {
                drawContent()
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = 5f
                )
            }) {
            Row(modifier = Modifier
                .fillMaxWidth()){

                Column(modifier = Modifier.clickable { navController.navigate(route = AppScreens.Screen4.route) }) {
                    Icon(Icons.Outlined.KeyboardArrowLeft, contentDescription = "", tint = Color(0xFF2393ce),modifier = Modifier
                            .size(60.dp)
                            .padding(10.dp))
                }
                Column(modifier = Modifier.fillMaxWidth(0.8f).padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Perfil", textAlign = TextAlign.Center, color = Color(0xFF014a99), fontWeight = FontWeight(600), fontSize = 18.sp)
                }
            }
        }
    }) {
        BodyContentPerfil( navController = navController)
    }
}

@Composable
fun BodyContentPerfil(navController: NavController) {

    //Colores del diseño

    val azul = Color(0xFF014a99)
    val celeste = Color(0xFF4cb9f4)
    val azul2 = Color(0xFF2393ce)

    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp,90.dp,10.dp,10.dp)) {
            Column(modifier = Modifier.padding(50.dp, 45.dp, 30.dp, 30.dp)){
                Row() {
                    Text(text = "Ana Contreras",
                        color = azul,
                        fontWeight = FontWeight(800),
                        fontSize = 21.sp)
                }
                Row {
                    Text(text = "MetLife",
                        color = azul2,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400))
                }
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)) {
                Icon(Icons.Outlined.AccountBox,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Datos de Usuario",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)) {
                Icon(Icons.Outlined.Home,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Empresas",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)) {
                Icon(Icons.Outlined.Lock,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Cambiar contraseña",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 15.dp, 0.dp, 15.dp)) {
                Icon(Icons.Outlined.Info,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Información legal",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End) {
                    Icon(Icons.Outlined.KeyboardArrowDown,
                        contentDescription = "",
                        tint = azul2)
                }
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)) {
                Icon(Icons.Outlined.Phone,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Ayuda",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)) {
                Icon(Icons.Outlined.Delete,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Eliminar Usuario",
                    color = azul, fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
            Row(modifier = Modifier.padding(0.dp,15.dp,0.dp,15.dp)

                //Boton de Navegacion para volver

                .clickable { navController.navigate(route = AppScreens.Screen1.route) }) {
                Icon(Icons.Outlined.ExitToApp,
                    contentDescription = "",
                    modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)
                        .size(25.dp),
                    tint = azul2)
                Text(text = "Cerrar Sesión",
                    color = azul,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500))
            }
        }
    }
}
