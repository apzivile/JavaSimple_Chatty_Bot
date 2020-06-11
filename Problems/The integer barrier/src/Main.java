import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (sum >= 1000) {
                continue;
            }

            if (number >= 1000) {
                sum += number;
                continue;
            }

            sum = sum + number;

        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}