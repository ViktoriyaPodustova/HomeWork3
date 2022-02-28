package Fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight(){
        float sum=0;
        for (T fruit: fruits
             ) {
            sum+= fruit.weigth;
        }
        return sum;
    }

    public boolean compare(Box<?> another){
        float firstWeight=getWeight();
        float secondWaight= another.getWeight();
    return firstWeight == secondWaight;
    }

    public void addToBox(T fruit){fruits.add(fruit);}


    public void transferToBox(Box<T> other){
        for (T fruit : this.fruits) {
            other.fruits.add(fruit);
        }
        fruits.clear();
    }
}
