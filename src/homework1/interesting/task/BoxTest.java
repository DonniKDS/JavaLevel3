package homework1.interesting.task;

import homework1.interesting.task.fruits.Apple;
import homework1.interesting.task.fruits.Fruit;
import homework1.interesting.task.fruits.Orange;

import java.util.ArrayList;

public class BoxTest {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        ArrayList<Orange> orangesList = new ArrayList();
        ArrayList<Apple> applesList = new ArrayList<>();
        ArrayList<Fruit> fruitsList = new ArrayList<>();

        orangesList.add(orange1);
        orangesList.add(orange2);
        applesList.add(apple1);
        applesList.add(apple2);
        applesList.add(apple3);
        fruitsList.add(orange1);
        fruitsList.add(orange2);
        fruitsList.add(apple1);
        fruitsList.add(apple2);
        fruitsList.add(apple3);


        Box oranges = new Box(orangesList);
        Box apples = new Box(applesList);
        Box fruits = new Box(fruitsList);

        System.out.println(oranges.getWeight());
        System.out.println(apples.getWeight());
        System.out.println(fruits.getWeight());

        System.out.println(oranges.compare(apples));
        System.out.println(oranges.compare(fruits));
    }
}
