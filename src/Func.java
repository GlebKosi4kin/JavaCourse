public class Func {
    public static void main(String[]args){
//        String wordRus = "привет по русски";
//
//        info(wordRus);
        summa((short) 5, (short) 7);
        short su1 = 2, su2 = 3;
        summa(su1, su2);

        int res = summa((short)10, (short)15);
        res += 10;

        info(String.valueOf(res));
    }

    //void - ф-ия ничего не возвращает

    //если хочу вернуть конкретное число - пишу тип данных вместо void
    //хочу true или false - пишу boolean вместо void
    public static int summa(short a, short b){
        int res = a + b;
        String result = ("Результат " + res);
        info(result);
        return res;
    }

    public static void info(String word){
        System.out.println(word);
    }

}
