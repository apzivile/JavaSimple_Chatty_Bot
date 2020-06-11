import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotel = scanner.nextInt();

        int totalCost = (foodPerDay * days) + (flightCost * 2) + hotel * (days - 1);
        System.out.println(totalCost);
    }
}