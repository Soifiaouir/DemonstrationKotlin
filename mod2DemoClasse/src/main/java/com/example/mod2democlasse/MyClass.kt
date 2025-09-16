package com.example.mod2democlasse

data class Travail(
    val intitulePoste : String,
    val salaireAnnuel : Int,
    val isCadre : Boolean,
val ville : String?
)

fun main() {
    val developpeurNantais = Travail(
        "Développeur(se)",
        34000,
        true,
        "Nantes"
    )
    println("Le/La ${developpeurNantais.intitulePoste} travaille à ${developpeurNantais.ville}")
    val designerTeleTravail = Travail(
        "Designer(se)",
        44000,
        true,
        null
    )
    println("Le/La ${designerTeleTravail.intitulePoste} travaille à ${designerTeleTravail.ville}")
    val dirigeantESN = Travail(
        "PDG",
        74000,
        true,
        "Paris"
    )
    println("Le/La ${dirigeantESN.intitulePoste} travaille à ${dirigeantESN.ville}")
}