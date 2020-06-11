import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        while (n > 0) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");

            }
        }
    }
}
