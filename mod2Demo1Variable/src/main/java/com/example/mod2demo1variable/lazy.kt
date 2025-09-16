package com.example.mod2demo1variable

fun main() {
    var mot = "World !"
    val message by lazy { "hello $mot"}
//    println (message)

    mot = "man !"

    print(message)
}