import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        z("Entrez une heure  : ");
        int heure = scanner.nextInt();
        z("Entrez les minutes : ");
        int minute = scanner.nextInt();

        laMinute(heure, minute);
    }

    public static void laMinute(int heure, int minute) {
        minute++;
        if (minute == 60) {
            minute = 0;
            heure++;
            if (heure == 24) {
                heure = 0;
            }
        }
        z("Dans une minute il sera " + heure + " H " + minute);
    }
    public static void z(String u) {
        System.out.println(u);
    }
}