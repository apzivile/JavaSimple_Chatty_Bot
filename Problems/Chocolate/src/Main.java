import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLength = scanner.nextInt();
        int mWidth = scanner.nextInt();
        int kPieces = scanner.nextInt();

        if ((kPieces >= nLength || kPieces >= mWidth) && (kPieces % nLength == 0 || kPieces % mWidth == 0) && kPieces <= (nLength * mWidth)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}