import Fruits.Apple;
import Fruits.Box;
import Fruits.Orange;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1", "2"};
        swapElements(array, 0,1);
        System.out.println(Arrays.toString(array));
        System.out.println("_________________________");

        Box<Apple> appleBox = new Box<>(newApples(6));
        Box<Orange> orangeBox = new Box<>(newOranges(5));
        Box<Orange> orangeBoxEmpty = new Box<>(newOranges(0));
        Box<Apple> appleBoxEmpty = new Box<>(newApples(0));

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBoxEmpty.compare(appleBoxEmpty));
        orangeBox.transferToBox(orangeBoxEmpty);
        appleBox.transferToBox(appleBoxEmpty);
        System.out.println("_________________________");
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBoxEmpty.compare(appleBoxEmpty));



    }
    public static ArrayList<Apple> newApples(int count){
        ArrayList<Apple> fruits =new ArrayList<>();
        for(int i=0; i<count;i++){
            fruits.add(new Apple());
        }
        return fruits;
    }

    public static ArrayList<Orange> newOranges(int count){
        ArrayList<Orange> fruits =new ArrayList<>();
        for(int i=0; i<count;i++){
            fruits.add(new Orange());
        }
        return fruits;
    }

    public static <T>void swapElements(T[]arr, int firstIndex, int secondIndex){
        if (firstIndex<0 || firstIndex>= arr.length || secondIndex<0 || secondIndex >= arr.length || arr.length<2){
            System.out.println("Incorrect index");
        }
        T arrElement = arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=arrElement;
    }

}
