package Devoir1.ex1

open class Personne(val nom: String, val prenom: String, val email: String
) {
    open fun afficherInfos() {
        println(" nom et prenom: $nom $prenom, email: $email")
    }}