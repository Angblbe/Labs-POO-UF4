
public class Bus extends Vehicle implements Polluter {

	private String empresaPropietaria;
	private boolean autobusDoble;


    @Override
    public void expulsaC02() {
        System.out.println("El bus de la empresa Avaria expulsa més de 28,4 g de CO2/km per passatger");
    }  
}
