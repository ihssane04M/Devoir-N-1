package Devoir1.ex1

abstract class GestionBibliotheque {
    val utilisateurs: MutableList<Utilisateur> = mutableListOf()
    val livres: MutableList<Livre> = mutableListOf()

    abstract fun ajouterUtilisateur(utilisateur: Utilisateur)
    abstract fun ajouterLivre(livre: Livre)
    abstract fun afficherTousLesLivres()
}