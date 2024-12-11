package com.escuela.trabajofinal1.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.sharp.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.escuela.trabajofinal1.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.escuela.trabajofinal1.Navigation.AppScreens

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun Home(navController: NavController){
    Scaffold() {
        BodyContentHome( navController = navController)
    }
}

@Composable
fun BodyContentHome(navController: NavController){

    //Colores del diseño

    val azul = Color(0xFF014a99)
    val celeste = Color(0xFF4cb9f4)
    val claro = Color(0xFFf9fbf6)
    val turquesa = Color(0xFF2e9beb)

Column(modifier = Modifier.fillMaxSize()) {
    Row(modifier = Modifier
        .fillMaxWidth(0.9f)
        .padding(3.dp, 100.dp, 0.dp, 0.dp)) {
        Card() {
            Image(painter = painterResource(id = R.drawable.card),
                contentDescription = "")
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(celeste)) {
                Text(text = "Descubre más",
                    fontSize = 19.sp,
                    color = Color.White,
                    modifier = Modifier.padding(40.dp, 10.dp,0.dp,10.dp))
            }
        }
    }
    Row(modifier = Modifier
        .fillMaxWidth(0.85f)
        .padding(3.dp, 40.dp, 0.dp, 0.dp)) {
        Card(colors = CardDefaults.cardColors(containerColor = claro)) {
           Row (modifier = Modifier
               .fillMaxWidth()
               .height(150.dp)){
               Column (modifier = Modifier
                   .clip(shape = RoundedCornerShape(10.dp))
                   .background(azul)
                   .fillMaxHeight(),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally){
                   Image(painter = painterResource(id = R.drawable.icon1),
                       contentDescription = "",
                       modifier = Modifier.size(70.dp))
               }
               Column(modifier = Modifier.padding(20.dp, 10.dp, 0.dp, 0.dp)) {
                   Row {
                       Text(text = "Próxima cita",
                           fontWeight = FontWeight(500), color = azul)
                   }
                   Row {
                       Text(text = "ASISTENCIA NUTRICIONAL",
                           fontSize = 17.sp,
                           fontWeight = FontWeight(800),
                           color = azul,
                           style = MaterialTheme.typography.titleLarge)
                   }
                   Row( modifier = Modifier.padding(0.dp, 10.dp, 0.dp,0.dp)) {
                       Icon(Icons.Outlined.DateRange,
                           contentDescription = "",
                           tint = azul,
                           modifier = Modifier.padding(0.dp, 0.dp, 15.dp,0.dp))
                       Text(text = "04 de Julio de 2022", color = azul)
                   }
                   Row (modifier = Modifier.padding(0.dp, 10.dp, 0.dp,0.dp)){
                       Icon(Icons.Outlined.AddCircle,
                           contentDescription = "",
                           tint = azul ,
                           modifier = Modifier.padding(0.dp, 0.dp, 15.dp,0.dp))
                       Text(text = "10:30 hs",
                           color = azul)
                   }
               }
           }
        }
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceBetween){
        Text(text = "Clínicas",
            fontSize = 24.sp,
            color = azul)
        Text(text = "Ver todo",
            fontSize = 18.sp,
              color = turquesa)
    }
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp,0.dp,0.dp)) {
        Column(modifier = Modifier
            .padding(10.dp)
        ) {
            Box(modifier = Modifier
                .shadow(
                    elevation = 5.dp,
                    RoundedCornerShape(50.dp),
                    spotColor = Color.LightGray
                )){
                Row(modifier = Modifier.background(Color.White).
                padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.icon2),
                        contentDescription = "",
                        modifier = Modifier
                            .size(80.dp)
                            .padding(10.dp))
                }
            }
            Row (modifier = Modifier.width(100.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text(text = "Telemedicina",
                    textAlign = TextAlign.Center,
                    color = azul,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    style = MaterialTheme.typography.titleLarge)
            }
        }
        Column(modifier = Modifier
            .padding(10.dp)
        ) {
            Box(modifier = Modifier
                .shadow(
                    elevation = 5.dp,
                    RoundedCornerShape(100.dp),
                    spotColor = Color.LightGray
                )){
                Row(modifier = Modifier.background(Color.White)
                    .padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.icon3),
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                            .padding(10.dp))
                }
            }
            Row (modifier = Modifier.width(100.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text(text = "Deporte",
                    textAlign = TextAlign.Center,
                    color = azul,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    style = MaterialTheme.typography.titleLarge)
            }
        }
        Column(modifier = Modifier
            .padding(10.dp)
        ) {
            Box(modifier = Modifier
                .shadow(
                    elevation = 5.dp,
                    RoundedCornerShape(100.dp),
                    spotColor = Color.LightGray
                )){
                Row(modifier = Modifier.background(Color.White)
                    .padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.icon4),
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                            .padding(10.dp))
                }
            }
            Row (modifier = Modifier.width(100.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text(text = "Salud sexual",
                    textAlign = TextAlign.Center,
                    color = azul,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    style = MaterialTheme.typography.titleLarge)
            }
        }
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.clickable { navController.navigate(route = AppScreens.Screen5.route) },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Outlined.AccountCircle,
                contentDescription = "",
                tint = Color.Gray)
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Perfil",
                color = Color.Gray)
        }
    }
}
}