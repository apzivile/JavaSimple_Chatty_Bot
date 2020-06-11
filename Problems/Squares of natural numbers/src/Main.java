import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double squares;

        for (int i = 1; i <= number; i++) {

            squares = Math.sqrt(i);
            if (squares % 1 == 0) {
                System.out.println(i);
            }
        }
    }
}