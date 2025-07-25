import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args){
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        Scanner scan1 = new Scanner(System.in);
        int var2 = scan1.nextInt();

        System.out.print("Введите действие: ");
        Scanner scan2 = new Scanner(System.in);
        String dd = scan2.nextLine();

        switch (dd){
            case "+":
                int plus = var1 + var2;
                System.out.println(plus);
                break;

            case "-":
                int minus = var1 - var2;
                System.out.println(minus);
                break;

            case "*":
                int umn = var1 * var2;
                System.out.println(umn);
                break;

            default:
                System.out.println("Что-то не то");
        }
    }
}
