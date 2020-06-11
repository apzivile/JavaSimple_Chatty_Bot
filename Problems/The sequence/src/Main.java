import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        int answer = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int number = scanner.nextInt();
            while (number % 4 == 0 && number > answer) {
                answer = number;
            }
        }
        System.out.println(answer);
    }
}