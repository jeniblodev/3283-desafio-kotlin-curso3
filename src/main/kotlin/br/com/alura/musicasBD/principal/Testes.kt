package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda

fun main(){
    val titas = Banda("Titãs")
    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    println(titas)
    println(goBack)
    println(cabecaDinossauro)
}