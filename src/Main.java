//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        String catFood = "Fish";
        String dogFood = "Meat";

        System.out.println("Alt om katten: ");
        myCat.makeSound();
        if(myCat.eat("Fish")){
            System.out.println("Min kat spiser: " +catFood);
        }


        System.out.println("Alt om hunden: ");
        myDog.makeSound();
        if(myDog.eat("meat")){
            System.out.println("Min hund spiser: " +dogFood);
        }


    }
}
