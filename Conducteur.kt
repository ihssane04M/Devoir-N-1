package Devoir1.ex2

class Conducteur(
    val nom: String,
    val prenom: String,
    val numeroPermis: String) {
    fun afficherDetails() {
        println("Conducteur -> $nom $prenom, Permis: $numeroPermis")
    }
}
