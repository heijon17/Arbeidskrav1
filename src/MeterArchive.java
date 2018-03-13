import java.util.Iterator;
import java.util.List;

/**
 * Write a description of class Meter here.
 *
 * @author Jon-Martin Heiberg
 * @version v0.1
 */

public class MeterArchive {

    private List<Meter> meters;

    public MeterArchive() {

    }

    public void addMeter(Meter meter){
        meters.add(meter);
    }

    public Meter getMeter(String regNr){
        for (Meter m : meters) {
            if(m.getRegNr().equals(regNr))
                return m;
        }
        return null;
    }

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

    public boolean changeLocation(String regNr, String locationCode){
        for(Meter m : meters){
            if(m.getRegNr().equals(regNr)) {
                m.setLocationCode(locationCode);
                return true;
            }
        }
        return false;
    }

    public boolean setNotWorking(String regNr){
        for(Meter m : meters){
            if(m.getRegNr().equals(regNr)) {
                m.setWorking(false);
                return true;
            }
        }
        return false;
    }
}
