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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.escuela.trabajofinal1.Navigation.AppScreens
import com.escuela.trabajofinal1.ViewModel.TrabajoFinal1

@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Registro(navController: NavController, vm: TrabajoFinal1){

    //Barra superior del Registro

    Scaffold(topBar = {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(0.dp,40.dp,0.dp,0.dp)) {
            Icon(
                Icons.Rounded.KeyboardArrowLeft,
                contentDescription = "",
                tint = Color(0xFF2393ce),
                modifier = Modifier.clickable { navController.popBackStack() }
                    .size(60.dp)
                    .padding(10.dp))
        }
    }) {
        BodyContentRegistro( navController = navController, vm = TrabajoFinal1())
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyContentRegistro(navController: NavController, vm:TrabajoFinal1){
Column(modifier = Modifier
    .fillMaxSize()
    .padding(20.dp)) {

    //Colores del diseño

    val verde = Color(0xFF58bbb0)
    val azul = Color(0xFF014a99)
    val azul2 = Color(0xFF2393ce)

    // Variable contexto local para el Toast

    val context = LocalContext.current
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 65.dp, 0.dp, 0.dp)) {
        Text(text = "Ayúdanos con tus datos",
            color = azul,
            fontSize = 30.sp,
            fontWeight = FontWeight(800))
    }
    Column(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = azul,
                unfocusedBorderColor = azul),
            readOnly = true
        )
        Text(text = "Seleccione que tipo de afiliado es",
            color = azul,
            modifier = Modifier.padding(15.dp, 20.dp, 0.dp, 0.dp)
                .alpha(0.7f),
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodySmall)
        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 5.dp, 0.dp, 0.dp),
            placeholder = {Text(text = "Titular",
                color = azul,
                fontWeight = FontWeight(700))},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = azul,
                unfocusedBorderColor = azul),
                readOnly = true
        )

        OutlinedTextField(value = vm.nombre.value,
            onValueChange = {vm.nombre.value = it},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
            enabled = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = azul,
            unfocusedBorderColor = Gray,
                disabledTextColor = Gray,
                unfocusedPlaceholderColor = Gray,
                focusedLabelColor = Black,
                unfocusedLabelColor = Gray,
                focusedPlaceholderColor = Gray),
            placeholder = {Text(text = "Nombre")},
            label = { Text(text = "Nombre")},
            shape = RoundedCornerShape(10.dp))
        OutlinedTextField(value = vm.apellido.value,
            onValueChange = {vm.apellido.value = it},
            placeholder = {Text(text = "Apellido")},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 40.dp, 0.dp, 0.dp),
            label = { Text(text = "Apellidos")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = azul,
            unfocusedBorderColor = Gray,
                disabledTextColor = Gray,
                focusedLabelColor = Black,
                unfocusedLabelColor = Gray,
                focusedPlaceholderColor = Gray),
            shape = RoundedCornerShape(10.dp)
        )
        OutlinedTextField(value = vm.empresa.value,
            onValueChange = {vm.empresa.value = it},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
            label = { Text(text = "Empresa")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = azul,
            unfocusedBorderColor = Gray,
                disabledTextColor = Gray,
                focusedLabelColor = Black,
                unfocusedLabelColor = Gray,
                focusedPlaceholderColor = Gray),
            placeholder = {Text(text = "Empresa")},
            shape = RoundedCornerShape(10.dp))
        OutlinedTextField(value = vm.mail.value,
            onValueChange = {vm.mail.value = it},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 40.dp, 0.dp, 0.dp),
            label = { Text(text = "Email")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = azul,
            unfocusedBorderColor = Gray,
                disabledTextColor = Gray,
                focusedLabelColor = Black,
                unfocusedLabelColor = Gray,
                focusedPlaceholderColor = Gray),
            placeholder = {Text(text = "Email")},
            shape = RoundedCornerShape(10.dp))
        OutlinedTextField(value = vm.mobil.value,
            onValueChange = {vm.mobil.value = it },
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp, 0.dp, 0.dp) ,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            label = { Text(text = "Mobil")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = azul,
            unfocusedBorderColor = Gray,
                disabledTextColor = Gray ,
                focusedLabelColor = Black,
                unfocusedLabelColor = Gray,
                focusedPlaceholderColor = Gray),
            placeholder = {Text(text = "Mobil")},
            shape = RoundedCornerShape(10.dp))

    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {

        //Validacion de campos del registro

        TextButton(onClick = { if (vm.ValidarRegistro()){navController.navigate(route = AppScreens.Screen1.route)
            Toast.makeText(context, "Datos cargados correctamente" ,
                Toast.LENGTH_SHORT ).show()}
        else{ Toast.makeText(context, "Completar todos los campos" ,
            Toast.LENGTH_SHORT ).show()}},
            modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 20.dp, 0.dp, 0.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(verde)
            .height(50.dp)
        ) {
            Text(text = "Enviar",
                color = Color.White,
                fontSize = 19.sp,
                modifier = Modifier.padding(0.dp))
        }
    }
}
}