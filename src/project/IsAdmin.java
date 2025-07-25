package project;
import java.util.Scanner;

public class IsAdmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pass = scan.nextInt();
        // Нельзя проверить на больше, меньше и тп, то есть проверяем на значение
        switch (pass) {
            case 123:
                System.out.println("Вы обычный пользователь");
                break;

            case 1234:
                System.out.println("Вы программист");
                break;

            case 12345:
                System.out.println("Вы админ");
                break;

            default:
                System.out.println("Ваш пароль не подходит");
        }
    }
}

