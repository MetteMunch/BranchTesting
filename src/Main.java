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
        myCat.showMood(true);
        myCat.jump(2.5);
        if(myCat.eat("Fish")){
            System.out.println("Min kat spiser: " +catFood);
        }

        System.out.println(" ");


        System.out.println("Alt om hunden: ");
        myDog.makeSound();
        myDog.showMood(false);
        myDog.jump(1.4);
        if(myDog.eat("meat")){
            System.out.println("Min hund spiser: " +dogFood);
        }

        System.out.println("Ændring til Main efter Stash");


    }
}
