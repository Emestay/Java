import java.util.Scanner;

public class Pate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reponse;

        do {
            System.out.println("Aimes-tu le pâté? (oui/non)");
            reponse = scanner.nextLine();

            switch (reponse) {
                case "oui" -> System.out.println("Moi aussi, cool !");
                case "non" -> System.out.println("Va crever!");
                default -> System.out.println("REPONDS PAR OUI OU PAR NON");
            }
        } while (!reponse.equals("oui") && !reponse.equals("non") );

        scanner.close();
    }
}
