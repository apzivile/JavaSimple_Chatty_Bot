import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nextEven = number;
        if (number % 2 == 0) {
            nextEven += 2;
        } else {
            nextEven += 1;
        }
        System.out.println(nextEven);
    }
}