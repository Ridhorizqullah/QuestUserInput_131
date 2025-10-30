package com.example.pertemuan5






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
}

