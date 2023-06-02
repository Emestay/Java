import java.util.Scanner;


public class TVA {
    public static void main(String[] args) {

        int prixHT, quantite, tauxTVA, prixTTC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prix HT de l'article : ");
        prixHT = scanner.nextInt();
        System.out.println("Entrez la quantité d'articles : ");
        quantite = scanner.nextInt();
        System.out.println("Entrez le taux de TVA : ");
        tauxTVA = scanner.nextInt();

        prixTTC = calculePrixTTC(prixHT, quantite, tauxTVA);

        System.out.println("Le prix total TTC correspondant est : " + prixTTC);
    }

    public static int calculePrixTTC(int prixHT, int quantite, int tauxTVA) {
        return (int) (prixHT * quantite * (1 + tauxTVA / 100));
    }
}