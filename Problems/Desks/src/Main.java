import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int allStudents = (firstGroup+1)/2 + (secondGroup+1)/2 + (thirdGroup+1)/2;

        System.out.println(allStudents);

    }
}