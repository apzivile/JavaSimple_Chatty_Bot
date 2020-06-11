import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int totalNumbers = 0;
        float average;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                totalNumbers++;
            }
        }
        average = (float) sum / totalNumbers;
        System.out.println(average);

    }
}