package Devoir1.ex2

class ParcAutomobile {
    val vehicules: MutableList<Vehicule> = mutableListOf()
    val reservations: MutableList<Reservation> = mutableListOf()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
        println("Véhicule ajouté: ${vehicule.immatriculation}")
    }
    fun supprimerVehicule(immatriculation: String) {
        val v = vehicules.find { it.immatriculation == immatriculation }
        if (v != null) {
            vehicules.remove(v)
            println(" supprimé: $immatriculation")
        } else {
            println("Aucun véhicule $immatriculation trouvé.")
        }
    }
    fun reserverVehicule(immatriculation: String, conducteur: Conducteur, dateDebut: String, dateFin: String): Reservation {
        val vehicule = vehicules.find { it.immatriculation == immatriculation }
            ?: throw VehiculeNonTrouveException("Véhicule $immatriculation introuvable.")
        if (!vehicule.estDisponible()) {
            throw VehiculeIndisponibleException("véhicule $immatriculation n'est pas disponible.")
        }
        vehicule.marquerIndisponible()
        val reservation = Reservation(vehicule, conducteur, dateDebut, dateFin, vehicule.kilometrage)
        reservations.add(reservation)
        println("Réservation  $immatriculation par ${conducteur.nom} ${conducteur.prenom}")
        return reservation
    }

    fun afficherVehiculesDisponibles() {
        println("=== Véhicules disponibles ===")
        val disponibles = vehicules.filter { it.estDisponible() }
        if (disponibles.isEmpty()) println("Aucun véhicule disponible.") else disponibles.forEach { it.afficherDetails() }
    }

    fun afficherReservations() {
        println("Réservations ")
        if (reservations.isEmpty()) println("Aucune ") else reservations.forEach { it.afficherDetails() }
    }
}
