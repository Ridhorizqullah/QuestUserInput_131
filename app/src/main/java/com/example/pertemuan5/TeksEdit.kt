package com.example.pertemuan5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp


@composable
fun FormDataDiri(modifier: Modifier
){
    //variabel-variabel untuk mengingat nilai masuk dari keyboard
    var textNama by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    //variabel-variabel untuk menyimpan data yang di peroleh dari komponen ui
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")

    Column (modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width = 250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
                nama = it
            }
        )
        Row {
            gender.forEach { item ->
                Row (modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = {
                        textJK = item
                        jenis = item
                    }
                    Text(Text = item)
                )

            }
        }

        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            Modifier.width(width = 250.dp),
            label = { Text(text = "Alamat") },
            onValueChange = {

        )
    }























}

