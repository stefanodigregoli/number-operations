public class Main {
    public static void main(String[] args) {
        int a = 15;

        a += 5;
        a -= 4;

        int b = a;
        b++;

        boolean case1 = b % 2 != 0;
        boolean case2 = (b * (b + 1)) % 3 == 0;

        if (case1 && case2) {
            System.out.println("Le entrambe affermazioni sono vere.");
        } else {
            System.out.println("Almeno una delle affermazioni è falsa.");
        }
    }
}