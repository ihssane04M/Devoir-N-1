package Devoir1.ex2

class Reservation(
    val vehicule: Vehicule,
    val conducteur: Conducteur,
    val dateDebut: String,
    val dateFin: String,
    val kilometrageDebut: Int,
    var kilometrageFin: Int? = null) {
    var cloturee: Boolean = false

    fun cloturerReservation(kmRetour: Int) {
        if (cloturee) {
            println(" Réservation déjà clôturée.")
            return
        }
        kilometrageFin = kmRetour
        vehicule.mettreAJourKilometrage(kmRetour)
        vehicule.marquerDisponible()
        cloturee = true
        println("Réservation  pour le véhicule ${vehicule.immatriculation}, km retour: $kmRetour")
    }
    fun afficherDetails() {
        println(" Vehicule: ${vehicule.immatriculation}, Conducteur: ${conducteur.nom} ${conducteur.prenom}, Début: $dateDebut, Fin: $dateFin, Km début: $kilometrageDebut, Km fin: ${kilometrageFin ?: "non renseigné"}, Clôturée: $cloturee")
    }
}
