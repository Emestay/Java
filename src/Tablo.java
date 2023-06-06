public class Tablo {
    public static void main(String[] args) {
        int[] tabloo = {1, 2, 3, 4, 5, 6, 7, 85, 55};
        int max = trouverMax(tabloo);
        System.out.println("La valeur max est : " + max);
    }

    public static int trouverMax(int[] array) {
        int max = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}