package TestAutomation;

import java.util.ArrayList;
import java.util.List;

public class CollectionsFrameWork {
    public static void main(String[] args) {
        //object is grandparent to every class
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //System.out.println(fruit.get(2)); //index
       // System.out.println(fruit.size()); //how many fruits
       // System.out.println(fruit); //print array list

        var i = fruit.iterator(); //allows you to go through each item in collection
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String item: fruit){
            System.out.println(item);
        }
        
        fruit.forEach(x -> System.out.println(x)); //takes lamda expression
    }
}
