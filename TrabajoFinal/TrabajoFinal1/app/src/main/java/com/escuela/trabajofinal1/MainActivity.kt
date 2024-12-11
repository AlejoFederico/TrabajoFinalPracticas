package com.escuela.trabajofinal1

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.escuela.trabajofinal1.Navigation.AppNavigation
import com.escuela.trabajofinal1.ui.theme.TrabajoFinal1Theme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabajoFinal1Theme {
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.S)
@Preview(showBackground = true)

@Composable
fun GreetingPreview() {
    TrabajoFinal1Theme {
        Surface {
            AppNavigation()
        }
    }
}