import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //2382

        int firstDigit = number / 1000; //2
        int secondDigit = (number / 100) % 10; //3
        int thirdDigit = (number / 10) % 10; //8
        int fourthDigit = number % 10; //2

        if (firstDigit==fourthDigit && secondDigit==thirdDigit){
            System.out.println(1);
        }else {
            System.out.println(37);
        }

    }
}