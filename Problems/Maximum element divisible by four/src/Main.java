import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        int maximum = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > maximum) {
                maximum = element;
            }
        }
        System.out.println(maximum);
    }
}