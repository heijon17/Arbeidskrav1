
/**
 * Write a description of class Meter here.
 *
 * @author Jon-Martin Heiberg
 * @version v0.1
 */
public abstract class Meter
{
    private String regNr;
    private boolean isWorking;
    private String locationCode;

    public Meter() {

    }

    public Meter(String regNr, boolean isWorking, String locationCode) {
        setRegNr(regNr);
        setWorking(isWorking);
        setLocationCode(locationCode);
    }

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


}
