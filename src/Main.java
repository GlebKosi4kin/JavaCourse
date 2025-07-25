import java.util.Scanner;

public class Main { //любой файл - определенный класс. названия файла и класса одинаковые
    public static void main(String[] args){
        System.out.print("Hi World \n");
        System.out.println("Hi \t табуляция");
        System.out.println("Hi \'\"\\");
        /* крутой
        комментарий
         */
        byte age = 10;
        short num1 = 2000;
        int num2 = 19990;
        long num3 = 412412421;

        float floint = 3.231f;

        String Name = "Gleb";
        char ch = 'ч';

        boolean isDriver = true;

        System.out.println(age);

        System.out.println("Возраст: " + age);
        System.out.println(Name + age);

        String surname;
        byte yrage;
        System.out.println("Введите Вашу фамилию");
        Scanner scan = new Scanner(System.in);
        surname = scan.nextLine();

        System.out.println("Введите Ваш возраст");
        Scanner scan1 = new Scanner(System.in);
        yrage = scan1.nextByte();

        System.out.println("Ваша фамилия " + surname + ", и Вам " + age + " лет");


        short sums = 23, sums1 = 42;
        int sum = sums + sums1;

        float ftest = 23, ftest1 = 12;
        float resf = ftest / ftest1;
        resf += 10;
        resf++;

        System.out.println(resf);


        System.out.println("Введите первое число");
        Scanner scan4 = new Scanner(System.in);
        short firstsh = scan4.nextShort();


        System.out.println("Введите второе число");
        Scanner scan2 = new Scanner(System.in);
        short sesh = scan2.nextShort();

        int res1 = firstsh + sesh;
        int res2 = firstsh - sesh;
        int res3 = firstsh * sesh;
        System.out.println("Sum = " + res1);
        System.out.println("Minus = " + res2);
        System.out.println("Umnozh = " +res3);


        boolean isHasCar = true;

        if ((age > 19 && isHasCar) || (isDriver)) {
            System.out.println("Вы водитель");
            System.out.println("Вы можете водить свою машину");
        } else if (age == 19)
            System.out.println("Вам 19");
        else {
            System.out.println("Вам меньше 19");
            System.out.println("Вам нельзя за руль");
        }

        char sym1 = 'A', sym2 = 'a';


        if (!isHasCar) {
            System.out.println("He dont have a car");
        } else {
            System.out.println("He have a car");
        }



    }

    public static void Ifelse(String[] args){
        System.out.println("S func");
    }
}
