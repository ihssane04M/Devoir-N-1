package Devoir1.ex1

class Livre(val titre: String, val auteur: String, val isbn: String, private var nombreExemplaires: Int
) {
    fun afficherDetails() {
        println(" Titre: $titre, Auteur: $auteur, ISBN: $isbn, exemplaire: $nombreExemplaires")
    }
    fun disponiblePourEmprunt(): Boolean = nombreExemplaires > 0

    fun mettreAJourStock(nouveauStock: Int) {
        nombreExemplaires = nouveauStock.coerceAtLeast(0)
    }
    internal fun decrementerExemplaire() {
        if (nombreExemplaires > 0) nombreExemplaires--
    }

    internal fun incrementerExemplaire() {
        nombreExemplaires++
    }
}