package TestAutomation;

public class Polymorphism {

    public static void main(String[] args) {
        Dog remy = new Dog();
        feed(remy);
        remy.fetch();
        remy.makeSound();

        Animal bear = new Cat();
        feed(bear);
        bear.makeSound();
        bear = new Dog();
        bear.makeSound();
        ((Dog) bear).fetch(); //casting

        Cat cat = new Cat();
        cat.drinksMilk("Bear");
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){ //checks whatever is on left is actually an instance of what's on the right
            System.out.println("Here's your dog food!!");
        } //object was instaniated of type dog

        else if (animal instanceof Cat){
            System.out.println("Here's your cat food!!!");
        }
    }
}
