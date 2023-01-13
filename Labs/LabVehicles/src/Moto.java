
public class Moto extends Vehicle implements Polluter {

	private boolean maleter;
	private int numeroPlacesGentGran;

    @Override
    public void expulsaC02() {
        System.out.println("La moto de la empresa Avaria expulsa més de 167 g de CO2/km ");
    }  
}
