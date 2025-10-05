package Devoir1.ex1

class Utilisateur(nom: String, prenom: String, email: String, val idUtilisateur: Int) : Personne(nom, prenom, email) {
    val emprunts: MutableList<Emprunt> = mutableListOf()
    override fun afficherInfos() {
        println("id: $idUtilisateur, Nom: $nom $prenom, Email: $email")
    }
    fun emprunterLivre(livre: Livre, dateEmprunt: String) {
        if (livre.disponiblePourEmprunt()) {
            val emprunt = Emprunt(this, livre, dateEmprunt)
            emprunts.add(emprunt)
            livre.decrementerExemplaire()
            println("${this.nom} ${this.prenom} a emprunté \"${livre.titre}\" le $dateEmprunt")
        } else {
            println(" livre ${livre.titre}  pas disponible ")
        }
    }
    fun afficherEmprunts() {
        println("Emprunts  $nom $prenom (ID: $idUtilisateur):")
        if (emprunts.isEmpty()) {
            println("  Aucun ")
        } else {
            emprunts.forEach { it.afficherDetails() }
        }
    }
}