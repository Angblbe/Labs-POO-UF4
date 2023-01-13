
public class Vehicle {

	private String marca;
	private String model;
	private double kilometres;
	private double places; 
	
	
    public void accelerar() {
        System.out.println("El vehicle accelera");
    }

    public void frenar() {
        System.out.println("El vehicle frena");
    }

    public void encendreMotor() {
        System.out.println("S'encen el motor del vehicle");
    }

    public void apagarMotor() {
        System.out.println("S'apaga el motor del vehicle");
    } 
    
    public void recorrentKilometres() {
        System.out.println("El vehicle recorreix kilometres");
    }  
}
