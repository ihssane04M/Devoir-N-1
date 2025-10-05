package Devoir1.ex2

class Voiture(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    val nombrePortes: Int,
    val typeCarburant: String
) : Vehicule(immatriculation, marque, modele, kilometrage) {
    override fun afficherDetails() {
        println("Voiture -> $immatriculation, $marque $modele, Portes: $nombrePortes, Carburant: $typeCarburant, Km: $kilometrage, Disponible: ${if (estDisponible()) "Oui" else "Non"}")
    }
}
