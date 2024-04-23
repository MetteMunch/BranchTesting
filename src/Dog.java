public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hunden siger vov");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean goodMood) {
        if(goodMood){
            System.out.println("Hunden er glad og logrer med halen.");
        } else if (!goodMood) {
            System.out.println("Hunden er sur og knurrer.");
        }
    }
}
