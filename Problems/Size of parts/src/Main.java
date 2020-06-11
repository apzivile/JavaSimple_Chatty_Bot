import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                perfect++;
            } else if (number == 1) {
                larger++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}