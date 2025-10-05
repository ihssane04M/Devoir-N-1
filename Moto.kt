package Devoir1.ex2

class Moto(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    val cylindree: Int
) : Vehicule(immatriculation, marque, modele, kilometrage) {
    override fun afficherDetails() {
        println("Moto -> $immatriculation, $marque $modele, Cylindrée: ${cylindree}cc, Km: $kilometrage, Disponible: ${if (estDisponible()) "Oui" else "Non"}")
    }
}
