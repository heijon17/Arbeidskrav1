/**
 *  Client klassen. Starter programmet.
 */

public class Client {
    public static void main(String[] args) {

        MeterArchive ma = new MeterArchive();

        ma.addMeter(new Weight("V1000", true, "R101H1", 0.01, 10.0));
        ma.addMeter(new Weight("V1001", true, "R101H2", 0.1, 100.0));
        ma.addMeter(new Weight("V1002", true, "R101H3", 1.0, 1000.0));
        ma.addMeter(new Thermometer("T2000", true, "R101H4", 0.01, 100.0));
        ma.addMeter(new Thermometer("T2001", true, "R101H5", 1.0, 200.0));
        ma.addMeter(new Clock("K3000", true, "R101H6", 10E-4));
        ma.addMeter(new Clock("K3001", true, "R101H7", 0.01));
        ma.addMeter(new Clock("K3002", false, "R101H8", 1.0));

        System.out.println("Sletter instrumentmed regnummer : T2007");
        if(ma.removeMeter("T2007"))
            System.out.println("Sletting utført.");
        else
            System.out.println("Ukjent regnummer!");

        

    }
}
