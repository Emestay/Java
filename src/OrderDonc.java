public class OrderDonc {
    public static void main(String[] args) {
        int[] array = {51, 23, 44, 102, 666};
        array = triage(array);
        //for each d'impression
        for (int i : array) {
            System.out.println(i);
        }
    }
    static int[] triage(int[] array) {
        boolean bool;
        do {
            bool = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tampon = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tampon;
                    bool = true;
                }
            }
        } while (bool);
        return array;
    }
}