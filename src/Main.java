//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("Min kat siger: ");
        myCat.makeSound();


        System.out.println("Min kat spiser: " +myCat.eat("Fish"));

        System.out.println("Min hund siger: ");
        myDog.makeSound();
        System.out.println("Min hund spiser: "+ myDog.eat("meat"));

    }
}
