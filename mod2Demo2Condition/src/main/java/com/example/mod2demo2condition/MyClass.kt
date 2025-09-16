package com.example.mod2demo2condition

fun main() {
    val customerLivingFrance = true
    val customerLivingNl = false
    val shippingCost = if(customerLivingFrance)
        5
    else if(customerLivingNl)
        8
    else 78
}