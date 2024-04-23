public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Katten siger miav...");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean goodMood) {
        if(goodMood){
            System.out.println("Katten er glad og spinder");
        } else if (!goodMood) {
            System.out.println("Katten er sur og hvæser");
        }
    }
}
