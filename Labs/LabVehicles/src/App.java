
public class App {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

/*
        //Fase 1
        //Cotxe
        Cotxe cotxe = new Cotxe();
        cotxe.accelerar();
        cotxe.recorrentKilometres();


        //Moto
        Moto moto = new Moto();
        moto.frenar();
        
        //Bus
        Bus bus = new Bus();
        bus.encendreMotor();
        
        //Tren
        Tren tren = new Tren();
        tren.frenar();
        tren.apagarMotor();
*/
/*
        //Fase 2

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Cotxe();
        vehicles[1] = new Moto();
        vehicles[2] = new Bus();
        vehicles[3] = new Tren();

        for(Vehicle vehicle : vehicles) {
            System.out.print(vehicle.getClass().getName() + ": ");
            vehicle.encendreMotor();
        }
*/
        //Fase 3

    	Polluter[] polluters = new Polluter[4];

    	polluters[0] = new Cotxe();
    	polluters[1] = new Moto();
    	polluters[2] = new Bus();
    	polluters[3] = new Tren();

        for(Polluter polluter : polluters) {
            System.out.print(polluter.getClass().getName() + ": ");
            polluter.expulsaC02();
            polluter.carburant();
        }
    }
    
}