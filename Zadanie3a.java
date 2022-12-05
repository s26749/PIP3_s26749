public class Zadanie3a {
    public static void main(String[] args) {


        int rows = 5;


        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                continue;
            }

            for (int j = i ; j < rows; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
