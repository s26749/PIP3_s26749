public class Zadanie2 {
    public static void main(String[] args) {


        int i = 1;
        int n = 10;
        int firsTerm = 0;
        int secondTerm = 1;

        while (i <= n) {

            if (i == n) {
                System.out.print(firsTerm);
                return;
            }

            System.out.print(firsTerm + ", ");
            int nextTerm = firsTerm + secondTerm;
            firsTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }


    }


}
