package TestAutomation;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Bark bark!!");
    }

    public void fetch(){
        System.out.println("Fetch is fun!!");
    }
}
