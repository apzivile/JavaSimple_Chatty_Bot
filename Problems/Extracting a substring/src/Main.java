import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println(str.substring(one,two+1));
    }
}