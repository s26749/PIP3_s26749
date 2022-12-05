public class Zadanie4 {
    public static void main(String[] args) {


        int x = 5;
        int y = 3;
        int z = 8;
        method(x, y, z);


    }

    private static void method(int x, int y, int z) {
        for (int i = 1; i < z; i++) {
            if (i <= (z - x)) {
                System.out.println();
            } else System.out.println("* ");

            if (i < (z - y)) {
                System.out.print("");
            } else System.out.print("* ");


        }
        System.out.println("* ");

    }
}


