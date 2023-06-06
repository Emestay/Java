import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exo {

    public static class Utilisateur {
        private static int compteur = 0;
        private int id;
        private String nom;
        private String prenom;
        private int age;
        private String rue;
        private String numRue;
        private String ville;
        private String codePostal;

        public Utilisateur() {
            this.id = ++compteur;
        }

        public Utilisateur(String nom, String prenom, int age, String rue, String numRue, String ville, String codePostal) {
            this.id = ++compteur;
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
            this.rue = rue;
            this.numRue = numRue;
            this.ville = ville;
            this.codePostal = codePostal;
        }

        public static int getCompteur() {
            return compteur;
        }

        public static void setCompteur(int compteur) {
            Utilisateur.compteur = compteur;
        }


        public void afficheUtilisateur() {
            System.out.println("Utilisateur: " + this.nom + " " + this.prenom);
        }


        public static void afficheUtilisateursToulouse(Collection<Utilisateur> utilisateurs) {
            for (Utilisateur utilisateur : utilisateurs) {
                if (utilisateur.ville.equalsIgnoreCase("Toulouse")) {
                    utilisateur.afficheUtilisateur();
                }
            }
        }
    }


}
