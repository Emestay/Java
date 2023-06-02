public class Pied {
    public static void main(String[] args) {
        int f = 10, l = 5, o = 3;
        System.out.println(soustraction(f ,l , o));
        intervertir(3, 4);
    }
    public static int soustraction(int f, int l, int o) {
        return f - l - o;
    }
    public static void intervertir(int i, int j) {
        int stockage = i;
        i = j;
        j = stockage;
        z("test ! i est donc a : " + i + " et j a : " + j);
    }
    public static void z(String u) {
        System.out.println(u);
    }

}
