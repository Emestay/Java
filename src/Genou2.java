import java.util.Scanner;

public class Genou2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        z("Age de l'enfant ?? ");
        int age = scanner.nextInt();

        if (age >= 6 && age <= 7) {
            z("Poussin");
        } else if (age >= 8 && age <= 9) {
            z("Pupille");
        } else if (age >= 10 && age <= 11) {
            z("Minimes Claude nougaro");
        } else if (age >= 12) {
            z("Cadet");
        } else {
            z("Pas bon");
        }
    }
    public static void z(String u) {
        System.out.println(u);
    }
}