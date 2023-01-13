public class Cat extends Animal implements Speakable {
    
    private double weight;
    private String color;
    private String name;
    
    @Override
    public void makeSound() {
        System.out.println("Meawww, meaawww !!");
    }
}
