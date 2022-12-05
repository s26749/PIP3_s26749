import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        method(x);
    }

    private static void method(int x){
        for (int i = 0; i <= x; i++) {
            System.out.println(i);

        }

        if (x<0){
            for (int i = 0; i >= x ; i--) {
                System.out.println(i);

            }
        }

    }
}
