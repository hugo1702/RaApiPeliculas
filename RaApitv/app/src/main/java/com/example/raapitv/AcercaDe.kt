package com.example.raapitv
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.tv.material3.Card
import androidx.tv.material3.CardDefaults
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text

@Composable
fun AcercaDe(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Acerca de",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 24.dp)
        )

        // Tarjeta 1
        InfoCard(
            imageRes = R.drawable.hugo, // Reemplaza con la imagen real en tu proyecto
            nombreCompleto = "Hugo Norberto Navarro Navarro",
            grado = "Carrera: Ingeniería en Desarrollo de Software",
            grupo = "Grupo y Grupo: 9°B",
            materia = "Materia: Desarrollo para Dispositivos Inteligentes",
            profesor = "Maestro: Dr. Armando Méndez Morales",
            cuatrimestre = "Cuatrimenstre: 9°",
            año = "Año: 2024"
        )

        Spacer(modifier = Modifier.height(16.dp))


        // Tarjeta 2
        InfoCard(
            imageRes = R.drawable.esteban, // Reemplaza con la imagen real en tu proyecto
            nombreCompleto = "Esteban Rubiel Sanchez López",
            grado = "Carrera: Ingeniería en Desarrollo de Software",
            grupo = "Grupo y Grupo: 9°B",
            materia = "Materia: Desarrollo para Dispositivos Inteligentes",
            profesor = "Maestro: Dr. Armando Méndez Morales",
            cuatrimestre = "Cuatrimenstre: 9°",
            año = "Año: 2024"
        )
    }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun InfoCard(
    imageRes: Int,
    nombreCompleto: String,
    grado: String,
    grupo: String,
    materia: String,
    profesor: String,
    cuatrimestre: String,
    año: String
) {
    Card(
        modifier = Modifier.padding(16.dp),
        onClick = { /* Puedes agregar una acción aquí si lo deseas */ }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Fotografía de $nombreCompleto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = nombreCompleto, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = grado, fontSize = 16.sp, color = Color.Black)
                Text(text = grupo, fontSize = 16.sp, color = Color.Black)
                Text(text = materia, fontSize = 16.sp, color = Color.Black)
                Text(text = profesor, fontSize = 16.sp, color = Color.Black)
                Text(text = cuatrimestre, fontSize = 16.sp, color = Color.Black)
                Text(text = año, fontSize = 16.sp, color = Color.Black)
            }
        }
    }
}