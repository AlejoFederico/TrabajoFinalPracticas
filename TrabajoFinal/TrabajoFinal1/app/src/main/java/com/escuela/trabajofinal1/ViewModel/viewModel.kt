package com.escuela.trabajofinal1.ViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//Implemetacion del ViewModel (Logica de funcionamiento)

class TrabajoFinal1 : ViewModel(){

    //Variables del Login

    var email = mutableStateOf("")
    var contra = mutableStateOf("")

    //Constantes de validacion del Login

    val email1 = "Alejo"
    val contra1 = "Alejo"

    // Variables del registro

    var nombre = mutableStateOf("")
    var apellido = mutableStateOf("")
    var empresa = mutableStateOf("")
    var mail = mutableStateOf("")
    var mobil = mutableStateOf("")

    //Validacion Login

    fun ValidarDatos(): Boolean {
        if ((email.value == email1) && (contra.value == contra1)){
            return true
        }else{
            return false
        }
    }

    //Validacion de campos Registro

    fun ValidarRegistro():Boolean{
        if ((nombre.value != "") && (apellido.value != "") && (empresa.value != "") && (mail.value != "") && (mobil.value != "")){
            return true
        }else{
            return false
        }
    }

    //Validacion de campos del Login

    fun Datos():Boolean{
        if ((email.value != "") && (contra.value != "")){
            return true
        }else{
            return false
        }
    }
}