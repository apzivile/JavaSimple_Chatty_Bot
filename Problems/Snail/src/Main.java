import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poleHeight = scanner.nextInt();
        int dayFeetUp = scanner.nextInt();
        int nightFeetDown = scanner.nextInt();
        int days = 0;
        int sum = 0;

        while (sum != poleHeight) {
            days++;
            sum += dayFeetUp;
            if (sum >= poleHeight) {
                System.out.println(days);
                break;
            }
            sum -= nightFeetDown;
        }
    }
}