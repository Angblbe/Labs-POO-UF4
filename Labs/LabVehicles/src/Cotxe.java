
public class Cotxe extends Vehicle implements Polluter {

	private boolean rodesDeRecanvi;
	private int numeroAmbientadors;
    
    @Override
    public void expulsaC02() {
        System.out.println("El cotxe de la empresa Avaria expulsa més de 250 g de CO2/km ");
    }  
}
