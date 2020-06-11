import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}