package Devoir1.ex1

fun main() {
    println("Gestion de Bibliothèque ")
    val bibli = Bibliotheque()
    val livre1 = Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "789", 1)
    val livre2 = Livre("L'Étranger",  "Albert Camus", "789", 2)
    bibli.ajouterLivre(livre1)
    bibli.ajouterLivre(livre2)

    val user1 = Utilisateur("Yahia", "Ihssane", "Ihssane@example.com", 1)
    val user2 = Utilisateur("Ettaheri", "Nizar", "nizar@example.com", 2)
    bibli.ajouterUtilisateur(user1)
    bibli.ajouterUtilisateur(user2)

    bibli.afficherTousLesLivres()
    user1.emprunterLivre(livre1, "2025-10-01")
    user2.emprunterLivre(livre1, "2025-10-02")
    user2.emprunterLivre(livre2, "2025-10-03")
    user1.afficherEmprunts()
    user2.afficherEmprunts()

    val empruntARetourner = user1.emprunts.firstOrNull()
    empruntARetourner?.retournerLivre("2025-10-25")
    user1.afficherEmprunts()
    bibli.afficherTousLesLivres()
    val recherche = bibli.rechercherLivreParTitre("Le Petit Prince ")
    if (recherche != null) println("Livre trouvé : ${recherche.titre}") else println("Livre non trouvé")}