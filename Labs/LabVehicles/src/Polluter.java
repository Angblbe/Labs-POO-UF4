
public interface Polluter {
	
	abstract public void expulsaC02();
	
	default public void carburant(){    
		System.out.println("My carburant is Gasoline");
	}
}
