import java.util.LinkedList;
import java.util.Scanner;

public class FuncArrTest {
    public static void main(String[] args){
        LinkedList<Integer> arr = new LinkedList<>();
        for(int i = 0; i < 3; i++){
            arr.add(scanning());
        }
        System.out.println(arrSum(arr));
    }

    public static int arrSum(LinkedList<Integer> list){
        int res = 0;
        for (Integer item: list) {
            res += item;
        }
        return res;
    }

    public static int scanning(){
        Scanner scan = new Scanner(System.in);
        int scannedInt = scan.nextInt();
        return scannedInt;
    }
}
