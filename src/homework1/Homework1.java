package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework1 {

    public static<T> void swapTwoElements(T[] array, int first, int second){
        T a = array[first];
        array[first] = array[second];
        array[second] = a;
    }

    public static <T> ArrayList<T> toArrayList(T[] block){
        return new ArrayList<>(Arrays.asList(block));
//        или
//        ArrayList<T> array = new ArrayList<>();
//        for (int i = 0; i < block.length; i++){
//            array.add(block[i]);
//        }
//        return array;
    }

    public static void main(String[] args) {
        Object[] objects = {"0", "1", "2", "3", "4"};
        String[] strings = {"0", "1", "2", "3", "4"};
        Integer[] integers = {1, 2, 3, 4, 5};

        swapTwoElements(objects, 1, 3);
        swapTwoElements(strings, 0, 2);
        swapTwoElements(integers, 0,2);

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(integers));

        System.out.println(objects.getClass().toString());
        System.out.println(strings.getClass().toString());
        System.out.println(integers.getClass().toString());

        ArrayList<Object> array1 = toArrayList(objects);
        ArrayList<String> array2 = toArrayList(strings);
        ArrayList<Integer> array3 = toArrayList(integers);

        System.out.println(array1.getClass().toString());
        System.out.println(array2.getClass().toString());
        System.out.println(array3.getClass().toString());
    }
}
