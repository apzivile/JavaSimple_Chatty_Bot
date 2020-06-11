import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        for (int i = 1; i < m; i++) {
            n = n * i;
            if (n > m) {
                System.out.println(i);
                break;
            }
        }
    }
}