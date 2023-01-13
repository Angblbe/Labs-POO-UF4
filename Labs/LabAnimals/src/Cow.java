
public class Cow extends Animal implements Speakable {

    private double weight;
    private String color;
    private String race;
    
    
    @Override
    public void makeSound() {
        System.out.println("Muuuuu, muuuuu !!");
    }


    public void donarLlet() {
        System.out.println("La vaca dóna llet");
    }
    
}
