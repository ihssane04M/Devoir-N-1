package Devoir1.ex1

class Bibliotheque : GestionBibliotheque() {
    override fun ajouterUtilisateur(utilisateur: Utilisateur) {
        utilisateurs.add(utilisateur)
        println("Utilisateur ajoute: ${utilisateur.nom} ${utilisateur.prenom} (ID: ${utilisateur.idUtilisateur})")
    }

    override fun ajouterLivre(livre: Livre) {
        livres.add(livre)
        println("Livre ajoute: \"${livre.titre}\" , ${livre.auteur}")
    }

    override fun afficherTousLesLivres() {
        println("Tous les livres ")
        if (livres.isEmpty()) {
            println("Aucun livre.")
        } else {
            livres.forEach { it.afficherDetails() }
        }
    }
    fun rechercherLivreParTitre(titre: String): Livre? {
        return livres.find { it.titre.equals(titre, ignoreCase = true) }
    }
}