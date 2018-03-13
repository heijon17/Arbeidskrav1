import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Styringsklasse for lagring av måleinstrumenter
 *
 * @author Jon-Martin Heiberg
 * @version v1.0
 */

public class MeterArchive {

    private List<Meter> meters;

    public MeterArchive() {
        meters = new ArrayList<>();
    }

    /**
     * Legger til et nytt måleinstrument listen.
     * @param meter - måleinstrument av typen Meter eller subtyper av denne.
     */
    public void addMeter(Meter meter){
        meters.add(meter);
    }

    /**
     * Finner et måleinstrument basert på regnummer.
     * @param regNr - regnummer på instrumentet som skal finnes.
     * @return Returnerer Meter objetet.
     */
    public Meter getMeter(String regNr){
        for (Meter m : meters) {
            if(m.getRegNr().equals(regNr))
                return m;
        }
        return null;
    }

    /**
     * Sletter et måleinstrument basert på regnummer.
     * @param regNr - regnummer på instrumentet som skal slettes.
     * @return Returnerer true hvis regnummer finnes, false hvis det ikke finnes.
     */
    public boolean removeMeter(String regNr){
        Iterator<Meter> it = meters.iterator();
        while(it.hasNext()){
            Meter m = it.next();
            if(m.getRegNr().equals(regNr)) {
                it.remove();
                return true;
            }
        }
    return false;
    }

    /**
     * Endrer lokasjonkode på et måleinstrument basert på regnummer.
     * @param regNr - Regnummer på instrumentet som skal flyttes.
     * @param locationCode - ny lokasjonskode på instrumentet.
     * @return Returnerer true hvis regnummer finnes, false hvis det ikke finnes.
     */
    public boolean changeLocation(String regNr, String locationCode){
        for(Meter m : meters){
            if(m.getRegNr().equals(regNr)) {
                m.setLocationCode(locationCode);
                return true;
            }
        }
        return false;
    }

    /**
     * Endrer status på instrument til defekt.
     * @param regNr - Regnummer på instrumentet som skal endres.
     * @return  Returnerer true hvis regnummer finnes, false hvis det ikke finnes.
     */
    public boolean setNotWorking(String regNr){
        for(Meter m : meters){
            if(m.getRegNr().equals(regNr)) {
                m.setWorking(false);
                return true;
            }
        }
        return false;
    }

    /**
     * Henter listen med måleinstrumenter.
     * @return Returnerer hele listen med måleinstrumenter.
     */
    public List<Meter> getMeters(){
        return meters;
    }
}
