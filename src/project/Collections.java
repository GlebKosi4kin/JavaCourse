package project;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[]args){
        //arraylist и linkedlist
        // Arraylist
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(53);

        //Добавляем элемент в самое начало
        nums.add(1, 23);

        //Выводим конкретный элемент списка
        System.out.println(nums.get(1));

        //Размер списка
        System.out.println(nums.size());

        //Удалить конкретный элемент
        nums.remove(1);

        //Полностью очистить список
        nums.clear();

        //перебираем коллекцию nums, и к i обращаемся уже не как к индексу, а как к элементу
        for(Integer i: nums){
            System.out.println(i);
        }

        ArrayList<String> his = new ArrayList<>();
        his.add("Hello");
        his.add("Hi");
        his.add("Hey");

        for(String x: his){
            System.out.println(x);
        }


        LinkedList<Float> nums1 = new LinkedList<>();
        nums1.add(3.23f);

        for(Float x: nums1){
            System.out.println(x);
        }

    }
}
