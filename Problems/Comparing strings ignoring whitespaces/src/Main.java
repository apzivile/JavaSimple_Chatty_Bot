import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String strNoWhiteSpace1 = str1.replace(" ", "").trim();
        String strNoWhiteSpace2 = str2.replace(" ", "").trim();
        System.out.println(strNoWhiteSpace1.equalsIgnoreCase(strNoWhiteSpace2));
    }
}