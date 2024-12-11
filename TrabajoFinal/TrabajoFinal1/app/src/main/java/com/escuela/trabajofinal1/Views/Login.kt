package com.escuela.trabajofinal1.Views

import android.annotation.SuppressLint
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.escuela.trabajofinal1.Navigation.AppScreens
import com.escuela.trabajofinal1.ViewModel.TrabajoFinal1



@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Login(navController: NavController, vm: TrabajoFinal1){

    //Barra superior del Login

    Scaffold(topBar = { Row(modifier = Modifier.fillMaxWidth()
        .padding(0.dp,40.dp,0.dp,0.dp)) {
        Icon(Icons.Rounded.KeyboardArrowLeft,
            contentDescription = "",
            tint = Color(0xFF2393ce), modifier = Modifier
            .size(60.dp)
            .padding(10.dp)
            .clickable { navController.navigate(route = AppScreens.Screen1.route) })
    }}) {
        BodyContentLogin( navController = navController, vm = TrabajoFinal1())
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyContentLogin(navController: NavController, vm:TrabajoFinal1) {

    //Colores del diseño

    val verde = Color(0xFF58bbb0)
    val azul = Color(0xFF014a99)
    val azul2 = Color(0xFF2393ce)
    val turquesa = Color(0xFF2e9beb)

    // Variable contexto local para el Toast

    val context = LocalContext.current


Column(modifier = Modifier.fillMaxSize()) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp,90.dp,20.dp,20.dp)) {
        Text(text = "¡Hola de nuevo!",
            fontSize = 45.sp,
            fontWeight = FontWeight(1000),
            color = azul,
            modifier = Modifier.padding(0.dp,0.dp,0.dp,20.dp))
        Text(text = "Bienvenido, descubramos juntos como vivir sano y saludable",
            fontSize = 20.sp,
            color = azul,
            modifier = Modifier.padding(0.dp,10.dp,0.dp,40.dp))
        OutlinedTextField(value = vm.email.value,
            onValueChange = { vm.email.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = turquesa,
                unfocusedBorderColor = Gray),
            shape = RoundedCornerShape(10.dp),
            placeholder = { Text(
            text = "Email",
                color = Color.Gray
        )}, modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 30.dp, 0.dp, 30.dp))
        OutlinedTextField(value = vm.contra.value,
            onValueChange = {vm.contra.value = it },
            placeholder = { Text(text = "Password",
                color = Color.Gray)},
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = turquesa,
                unfocusedBorderColor = Gray),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
            .fillMaxWidth())
        Text(text = "¿Olvidaste tu contraseña?",
            textAlign = TextAlign.End,
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 30.dp, 20.dp, 0.dp),
            fontSize = 17.sp,
            color = turquesa, )
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(0.dp, 0.dp, 0.dp, 20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {

        // Validacion de campos completos

        if (vm.Datos()){

            // Validacion de datos ingresados

            TextButton(onClick = { if (vm.ValidarDatos()){navController.navigate(route = AppScreens.Screen4.route) }
            else{ Toast.makeText(context, "Datos incorrectos" , Toast.LENGTH_SHORT ).show()} },
                colors = ButtonDefaults.buttonColors(containerColor = verde.copy(alpha = 1f)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            ) {
                Text(text = "Iniciar Sesion",
                    color = Color.White,
                    fontSize = 19.sp,
                    modifier = Modifier.padding(10.dp))
            }
        }else{

            // Validacion de datos ingresados


            TextButton(onClick = { if (vm.ValidarDatos()) { navController.navigate(route = AppScreens.Screen4.route) }
            else{ Toast.makeText(context, "Completar Datos" , Toast.LENGTH_SHORT ).show()} },
                colors = ButtonDefaults.buttonColors(containerColor = verde.copy(alpha = 0.5f)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            ) {
                Text(text = "Iniciar Sesión",
                    color = Color.White,
                    fontSize = 19.sp,
                    modifier = Modifier.padding(10.dp))
            }
        }
        TextButton(onClick = { navController.navigate(route = AppScreens.Screen3.route) },
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(
                RoundedCornerShape(10.dp))){
            Text(text = "Registrarme",
                color = turquesa,
                fontSize = 17.sp,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight(400))
        }
    }
}
}
