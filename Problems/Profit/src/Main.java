import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double beginningMoney = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double endMoney = scanner.nextDouble();

        double bankMoney;
        int year = 0;

        if (beginningMoney == endMoney) {
            System.out.println(0);
        }
        while (beginningMoney < endMoney) {

            bankMoney = (beginningMoney * percent) / 100;
            beginningMoney = (beginningMoney + bankMoney);
            year++;
            if (beginningMoney >= endMoney) {
                System.out.println(year);
            }

        }
    }
}