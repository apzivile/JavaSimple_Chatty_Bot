import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigit = scanner.nextInt();
        int firstDigit = threeDigit / 100;
        int secondDigit = (threeDigit % 100) / 10;
        int thirdDigit = threeDigit % 10;
        int result = firstDigit + secondDigit + thirdDigit;
        System.out.println(result);
    }
}