package Devoir1.ex2

fun main() {
    println("parc Automobile ")
    val parc = ParcAutomobile()

    val v1 = Voiture("MA-101-AA", "Peugeot", "208", 45000, 5, "Diesel")
    val v2 = Moto("MC-222-BB", "Honda", "CB500F", 8500, 471)
    val v3 = Voiture("MA-303-CC", "Volkswagen", "Golf", 62000, 5, "Essence")

    parc.ajouterVehicule(v1)
    parc.ajouterVehicule(v2)
    parc.ajouterVehicule(v3)

    val c1 = Conducteur("Mouaad", "Bennani", "P9988776")
    val c2 = Conducteur("Ihssane", "El Fassi", "P4455667")

    println(" Véhicules disponibles ")
    parc.afficherVehiculesDisponibles()

    try {
        val res1 = parc.reserverVehicule("MA-101-AA", c1, "2025-10-06", "2025-10-08")
        println(" Réservations en cours ")
        parc.afficherReservations()

        res1.cloturerReservation(45500)
    } catch (e: Exception) {
        println("Erreur: ${e.message}")
    }
    try {
        parc.reserverVehicule("MA-101-AA", c2, "2025-10-09", "2025-10-11")
    } catch (e: Exception) {
        println("Erreur lors de la réservation: ${e.message}")
    }
    try {
        parc.reserverVehicule("MA-999-ZZ", c2, "2025-10-12", "2025-10-13")
    } catch (e: Exception) {
        println("Erreur lors réservation: ${e.message}")
    }
    println(" Véhicules disponibles après opérations ")
    parc.afficherVehiculesDisponibles()
    println(" Liste finale des réservations ")
    parc.afficherReservations()
}
