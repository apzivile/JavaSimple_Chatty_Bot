import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();
        int firstSecond = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();
        int secondSecond = scanner.nextInt();

        int firstTime = (firstHour * 60 * 60) + (firstMinute * 60) + firstSecond;
        int secondTime = (secondHour * 60 * 60) + (secondMinute * 60) + secondSecond;

        int passedTime = Math.abs(firstTime-secondTime);

        System.out.println(passedTime);
    }
}