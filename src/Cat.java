public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Katten siger miav...");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
