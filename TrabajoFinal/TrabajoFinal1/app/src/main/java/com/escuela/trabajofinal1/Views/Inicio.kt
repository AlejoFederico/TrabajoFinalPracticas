package com.escuela.trabajofinal1.Views

import android.annotation.SuppressLint
import android.graphics.Paint.Style
import android.os.Build
import android.view.RoundedCorner
import androidx.annotation.RequiresApi
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.escuela.trabajofinal1.R
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.escuela.trabajofinal1.Navigation.AppScreens

@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Inicio(navController: NavController){
    Scaffold(topBar =
    { Box(modifier = Modifier.padding(0.dp,30.dp,0.dp,0.dp))}) {
        BodyContent( navController = navController)
    }
}

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun BodyContent(navController: NavController){


    // Colores

    val verde = Color(0xFF58bbb0)

Column(modifier = Modifier
    .fillMaxSize()
    .paint(painterResource(id = R.drawable.fondo),
        contentScale = (ContentScale.FillBounds)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .size(600.dp)
            .padding(0.dp, 50.dp, 0.dp, 0.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = R.drawable.imagen1),
                contentDescription = "",
                modifier = Modifier
                .size(200.dp)
                .weight(1f))
            Text(fontSize = 19.sp,
                text = "Atención virtual inmediata por medio \n de nuestra Clinica Virtual",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(30.dp),
                textAlign = TextAlign.Center,
                color = Color.White
           )
            Column (modifier = Modifier
                .fillMaxWidth()
                .size(300.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                TextButton(onClick = { navController.navigate(route = AppScreens.Screen2.route)},
                    modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(verde)
                ) {
                    Text(text = "Iniciar Sesión",
                        color = Color.White,
                        fontSize = 19.sp,
                        modifier = Modifier.padding(10.dp))
                }
                TextButton(onClick = { navController.navigate(route = AppScreens.Screen3.route) },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White.copy(alpha = 0.2f)),
                    shape = RoundedCornerShape(10.dp),
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(10.dp)

                ) {
                    Text(text = "Registrarse",
                        color = Color.White,
                        fontSize = 19.sp,
                        modifier = Modifier.padding(10.dp))
                }
            }
        }
    }
}
}



