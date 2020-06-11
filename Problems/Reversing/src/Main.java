import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        if (number % 10 == 0) {
            int secondDigit = (number / 10) % 10;
            System.out.println("" + secondDigit + "" + firstDigit);
        } else {
            int secondDigit = (number % 100) / 10;
            int thirdDigit = number % 10;
            System.out.println(thirdDigit + "" + secondDigit + "" + firstDigit);
        }

    }
}