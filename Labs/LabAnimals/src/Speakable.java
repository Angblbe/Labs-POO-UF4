
public interface Speakable {
	
	abstract public void makeSound();
	
	default public void organ(){    
		System.out.println("Parlo per la boca");
	}
}

