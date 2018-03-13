
/**
 * Abstrakt klasse for måleinstrumenter.
 * Holder felles egenskaper for alle måleinstrumenter.
 *
 * @author Jon-Martin Heiberg
 * @version v1.0
 */
public abstract class Meter
{
    private String regNr;
    private boolean isWorking;
    private String locationCode;

    //Standard konstruktør, brukes ikke i dette prosjektet.
    public Meter() {
    }

    public Meter(String regNr, boolean isWorking, String locationCode) {
        setRegNr(regNr);
        setWorking(isWorking);
        setLocationCode(locationCode);
    }

    //Tilgangsmetoder
    protected String getRegNr() {
        return regNr;
    }

    protected void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    protected boolean isWorking() {
        return isWorking;
    }

    protected void setWorking(boolean working) {
        isWorking = working;
    }

    protected String getLocationCode() {
        return locationCode;
    }

    protected void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    //Tilgangsmetoder, slutter.


}
