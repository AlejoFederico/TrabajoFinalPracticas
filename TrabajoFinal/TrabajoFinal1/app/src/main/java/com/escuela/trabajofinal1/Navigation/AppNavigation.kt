package com.escuela.trabajofinal1.Navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.escuela.trabajofinal1.ViewModel.TrabajoFinal1
import com.escuela.trabajofinal1.Views.Home
import com.escuela.trabajofinal1.Views.Inicio
import com.escuela.trabajofinal1.Views.Login
import com.escuela.trabajofinal1.Views.Perfil
import com.escuela.trabajofinal1.Views.Registro

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun AppNavigation(){

    //Constante de navegacion

    val navController = rememberNavController()

    //Configuracion de navegacion y pagina inicial

    NavHost(navController = navController, startDestination = AppScreens.Screen1.route) {

        //Asignacion de rutas a las diferentes Views

        composable(route = AppScreens.Screen1.route){
                Inicio(navController = navController)
        }
        composable(route = AppScreens.Screen2.route){
                Login(navController = navController, vm = TrabajoFinal1())
        }
        composable(route = AppScreens.Screen3.route){
                Registro(navController = navController, vm = TrabajoFinal1())
        }
        composable(route = AppScreens.Screen4.route){
                Home(navController = navController)
        }
        composable(route = AppScreens.Screen5.route){
                Perfil(navController = navController)
        }

        
    }
}

