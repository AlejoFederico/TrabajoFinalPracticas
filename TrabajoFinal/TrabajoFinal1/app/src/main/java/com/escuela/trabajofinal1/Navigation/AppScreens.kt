package com.escuela.trabajofinal1.Navigation

import kotlinx.coroutines.handleCoroutineException

sealed  class AppScreens (val route:String){

    //Definicion de las Views

    object Screen1: AppScreens(route = "Screen1")
    object Screen2: AppScreens(route = "Screen2")
    object Screen3: AppScreens(route = "Screen3")
    object Screen4: AppScreens(route = "Screen4")
    object Screen5: AppScreens(route = "Screen5")
}