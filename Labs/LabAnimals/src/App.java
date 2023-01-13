public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

/*
        //Fase 1
        //Gat
        Cat cat = new Cat();
        cat.move();

        //Duck
        Duck patito = new Duck();
        patito.cuaqueja();
        
        //Vaca
        Cow vaca = new Cow();
        vaca.donarLlet();
        
        //Bacteri
        Bacteria bacteri = new Bacteria();
        bacteri.move();
        bacteri.reproduir();
*/
    	/*
        //Fase 2

        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = new Duck();
        animals[2] = new Cow();
        animals[3] = new Bacteria();

        for(Animal animal : animals) {
            System.out.print(animal.getClass().getName() + ": ");
            animal.dormir();
        }
		*/
        //Fase 3

    	Speakable[] speak = new Speakable[3];

        speak[0] = new Cat();
        speak[1] = new Duck();
        speak[2] = new Cow();

        for(Speakable speakable : speak) {
            System.out.print(speakable.getClass().getName() + ": ");
            speakable.makeSound();
            speakable.organ();
        }
    	
    	
    	
    	
    }
    
}
