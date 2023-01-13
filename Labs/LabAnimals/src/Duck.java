
public class Duck extends Animal implements Speakable {
    
    private double weight;
    private String color;
    private String race;
    
    @Override
    public void makeSound() {
        System.out.println("Cuak, cuak  !!");
    }  
}

