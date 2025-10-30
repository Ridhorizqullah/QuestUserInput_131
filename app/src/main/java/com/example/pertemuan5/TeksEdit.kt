package com.example.pertemuan5






@composable
fun FormDataDiri(modifier: Modifier
){
    //variabel-variabel untuk mengingat nilai masuk dari keyboard
    var textNama by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }


}

