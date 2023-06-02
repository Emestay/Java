import java.util.Scanner;

public class Devine {
    public static void main(String[] args) {
        devineNbr();
    }

    public static void devineNbr() {
        int randomNum = (int) (Math.random() * 3) + 1;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            z("Veuillez entrer un nombre entre 1 et 3 : ");
            userInput = scanner.nextInt();
        } while (userInput != randomNum);

        z("Vous avez entré le bon nombre 💟: " + userInput);
    }
    public static void z(String u) {
        System.out.println(u);
    }
}
