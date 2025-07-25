package project;
public class Cycles {
    public static void main(String[] args){
        for (int i = 0; i < 10; i ++){
            if (i == 2)
                continue;
            System.out.println("Число: " + i);

        }

        int b = 3;
        int a = 0;
        while(a <= 10) {
            a++;
            b--;
            if(a == 0)
                continue;

            System.out.println("Hi number: " + a);


            if (b == 0)
                break;
        }

        int money = 40;
        do {
            money -= 15;
            System.out.println("У Вас списано 15 рублей, текущий баланс: " + money);
        } while (money >= 15);

    }
}

