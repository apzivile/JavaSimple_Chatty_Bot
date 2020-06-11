import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int recommendedSleep = scanner.nextInt();
        int excessSleep = scanner.nextInt();
        int annSleep = scanner.nextInt();

        if (annSleep >= recommendedSleep && annSleep <= excessSleep) {
            System.out.println("Normal");
        } else if (annSleep < recommendedSleep) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }

    }
}