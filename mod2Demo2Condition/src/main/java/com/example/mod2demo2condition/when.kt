package com.example.mod2demo2condition

fun main(){
    val idCategorie = 9832
    val categorieGenerale = when(idCategorie){
        in 1..1000 -> "Alimentaire"
        in 1001..4500 -> "Culture"
        else -> "Santé"
    }
}