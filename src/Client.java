/**
 *  Client klassen. Starter programmet.
 *
 *  @author Jon-Martin Heiberg
 *  @version v1.0
 */

public class Client {
    public static void main(String[] args) {

        MeterArchive ma = new MeterArchive();

        //Legger til måleinstrumenter i listen
        ma.addMeter(new Weight("V1000", true, "R101H1", 0.01, 10.0));
        ma.addMeter(new Weight("V1001", true, "R101H2", 0.1, 100.0));
        ma.addMeter(new Weight("V1002", true, "R101H3", 1.0, 1000.0));
        ma.addMeter(new Thermometer("T2000", true, "R101H4", 0.01, 100.0));
        ma.addMeter(new Thermometer("T2001", true, "R101H5", 1.0, 200.0));
        ma.addMeter(new Clock("K3000", true, "R101H6", 10E-4));
        ma.addMeter(new Clock("K3001", true, "R101H7", 0.01));
        ma.addMeter(new Clock("K3002", false, "R101H8", 1.0));

        //Skriver ut alle instrumenter
        System.out.println("Oversikt ovar alle instrumenter:");
        for (Meter m : ma.getMeters()){
            System.out.println(m.toString());
        }

        //Sletter instrument "T2007" om det finnes
        System.out.println("Sletter instrument med regnummer : T2007");
        if(ma.removeMeter("T2007"))
            System.out.println("Sletting utført.");
        else
            System.out.println("Ukjent regnummer!");

        //Endrer posisjon for instrument "T2001" om det finnes
        System.out.println("Endrer posisjon for instrument med regnummer: T2001");
        if(ma.changeLocation("T2001", "R101H6"))
            System.out.println("Endret!");
        else
            System.out.println("Ukjent regnummer!");

        //Skriver ut alle instrumenter nå
        System.out.println("Oversikt over alle instrumenter nå:");
        for (Meter m : ma.getMeters()){
            System.out.println(m.toString());
        }

        //Henter instrument "T2001"
        System.out.println("Henter instrument med regnummer T2001;");
        Meter m = ma.getMeter("T2001");
        System.out.println(m.toString());

        //Setter instrument "T2001" til ikke i orden
        System.out.println("Setter instrument med regnummer T2001 til ikke i orden:");
        m = ma.getMeter("T2001");
        if(ma.setNotWorking("T2001"))
            System.out.println(m.toString());
        else
            System.out.println("Ukjent regnummer");


    }
}
