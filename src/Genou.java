import java.util.Scanner;

public class Genou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        z("Age de l'enfant ?? ");
        int age = scanner.nextInt();

        switch (age) {
            case 6, 7 -> z("Poussin");
            case 8, 9 -> z("Pupille");
            case 10, 11 -> z("Minimes Claude nougaro");
            default -> {
                if (age >= 12) {
                    z("Cadet");
                } else {
                    z("Pas bon");
                }
            }
        }
    }
    public static void z(String u) {
        System.out.println(u);
    }
}


