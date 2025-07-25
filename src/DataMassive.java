import java.util.Scanner;

public class DataMassive {
    public static void main(String[]args){
        int[] nums = new int[5];
        nums[0] = 18;
        nums[1] = 23;
        nums[2] = 42;
        nums[3] = 52;
        nums[4] = 100;
        int res = nums[0] + nums[3];
        System.out.println(nums[0] + " " + res);

        float[] nums1 = new float[] {3.14f, 32.22f, 213.3f};
        for (int i = 0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива под номером " + i + ": ");
            Scanner scan = new Scanner(System.in);
            arr[i] = scan.nextInt();
        }


        for (int i = 0; i < arr.length; i++){
            System.out.println("Вы ввели такой элемент под номером " + i + ": " + arr[i]);
        }


        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Минимальным элементом является: " + min);


        //Многомерный массив данных
        char[][] init = new char[2][2];
        init [0][0] = 'Г';
        init [0][1] = 'C';

        byte[][] ages = new byte[][]{
                {23, 24},
                {34, 32},
                {23, 26}
        };

        for (int i = 0; i < ages[0].length; i++){
            System.out.println("Первому другу " + ages[i][0] + ", а второму другу " + ages[i][1]);
        }

        for (int i = 0; i < ages[0].length; i++){
            System.out.println(ages[0][i]);
        }
    }
}
