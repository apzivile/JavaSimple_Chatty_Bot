import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numOfBridges = sc.nextInt();

        for (int i = 0; i < numOfBridges; i++) {
            int bridgesHeight = sc.nextInt();
            if (bridgesHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                return;
            }
        }

        System.out.println("Will not crash");
    }
}
