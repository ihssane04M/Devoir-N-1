package Devoir1.ex2

abstract class Vehicule(val immatriculation: String, val marque: String, val modele: String,
    private var _kilometrage: Int, private var _disponible: Boolean = true) {
    val kilometrage: Int
        get() = _kilometrage

    fun estDisponible(): Boolean = _disponible

    fun marquerIndisponible() {
        _disponible = false
    }

    fun marquerDisponible() {
        _disponible = true
    }

    fun mettreAJourKilometrage(km: Int) {
        if (km >= _kilometrage) _kilometrage = km
        else println(" ($km)  au km actuel ($_kilometrage). ")
    }

    open fun afficherDetails() {
        println("Vehicule -> $immatriculation, $marque $modele, Km: $_kilometrage, Disponible: ${if (_disponible) "Oui" else "Non"}")
    }
}