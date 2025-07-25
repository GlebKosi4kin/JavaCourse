import java.util.Scanner;

public class CanDrive {
    public static void main(String[] args) {

        System.out.println("Если вы водитель, впишите слово \" водитель\" ");
        Scanner scan = new Scanner(System.in);
        String driver = scan.nextLine();

        System.out.println("Введите название авто");
        Scanner scan2 = new Scanner(System.in);
        String car = scan2.nextLine();

        if (driver.equals("водитель")) {
            System.out.println("Вы водитель, круто");
            if (car.equals("Ford Mondeo"))
                System.out.println("У Вас Американский автомобиль");
        }
    }
}
