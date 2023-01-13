
public class Tren extends Vehicle implements Polluter {

	private int numeroVagons;
	private String empresaPropietaria;

    @Override
    public void expulsaC02() {
        System.out.println("El tren de la empresa Avaria expulsa més de 14 g de CO2/km per passatger");
    }  
}
