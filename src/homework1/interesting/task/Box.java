package homework1.interesting.task;

import homework1.interesting.task.fruits.Fruit;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> box;

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public float getWeight() {
        float weight = 0.0f;
        for(T fruit : box){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<T> anotherBox) {
        return anotherBox.getWeight() == this.getWeight();
    }

    public Box<T> putOut(Box<T> anotherBox){
        anotherBox.box.addAll(this.box);
        box.clear();
        return anotherBox;
    }
}
