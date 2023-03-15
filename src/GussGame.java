import java.util.Random;
import java.util.Scanner;
class Geme {
    int computer = 0;
    int n = 0;
    int gusses = 1;
    Geme() {
        Random r = new Random();
        computer = r.nextInt(100);
    }

    void getGusses() {
        System.out.println("your no of gusses is = " + gusses);
    }

    public void enterInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Guss any number");
        n = sc.nextInt();

        while (n != computer) {
            gusses++;
            if (n > computer) {
                System.out.println("please take smaller no");
            } else if (n < computer) {
                System.out.println("please take larger no");
            }
            n = sc.nextInt();
        }
        System.out.println("congratulations your guss is correct");
        System.out.println();
    }
}

public class GussGame {
    public static void main(String[] args) {
        Geme g = new Geme();
        g.enterInput();
        g.getGusses();
    }
}
