package Devoir1.ex1

class Emprunt(val utilisateur: Utilisateur, val livre: Livre, val dateEmprunt: String, var dateRetour: String? = null
) {
    fun afficherDetails() {
        println("Utilisateur: ${utilisateur.nom} ${utilisateur.prenom}, Livre: ${livre.titre}, Emprunt: $dateEmprunt, Retour: ${dateRetour }")
    }
    fun retournerLivre(dateRetour: String) {
        if (this.dateRetour == null) {
            this.dateRetour = dateRetour
            livre.incrementerExemplaire()
            println("Livre =${livre.titre} , ${utilisateur.nom} ${utilisateur.prenom} , $dateRetour")
        } else {
            println("Attention ${this.dateRetour}")
        }
    }
}