import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int balance = 50;
        int addBalance = 1500;
        int bonus = addBalance / 100;
        int total = balance + addBalance + bonus;
        if (addBalance > 1000) {
            System.out.println("Бонусы:" + bonus);
            System.out.println("Итого:" + total);
        } else {
            System.out.println("Бонусы: 0");
            System.out.println("Итого: " + (balance + addBalance));
        }
    }
}
