package com.example.pruebas_conceptos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pruebas_conceptos.ui.theme.Pruebas_conceptosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Elementos1()  //pruebas de ubicacion y como hacer botones
        }
    }
}
@Composable
fun Elementos1(){
    Column (Modifier
        .padding(20.dp)){
        for (i in 1 until 4){
            Row (Modifier
                .padding(20.dp)){
                Icon(Icons.Filled.Info, contentDescription = "icono info")
                ElevatedButton(onClick ={Unit}){
                    Text("boton")
                }
            }
        }
    }
}