import java.util.Objects;

/**
 * Et termometer som kan måle temperatur mellom maks og min temp.
 *
 * @author Jon-Martin Heiberg
 * @version v1.0
 */
public class Thermometer extends Meter
{
    private double minDegrees;
    private double maxDegrees;

    //Standard konstruktør, brukes ikke i dette prosjektet.
    public Thermometer(){
        super();
        setMinDegrees(-30);
        setMaxDegrees(50);
    }

    public Thermometer(String regNr, boolean isWorking, String locationCode,double minDegrees, double maxDegrees){
        super(regNr, isWorking, locationCode);
        setMinDegrees(minDegrees);
        setMaxDegrees(maxDegrees);
    }

    //Tilgangsmetoder
    private void setMinDegrees(double minDegrees){
        this.minDegrees = minDegrees;
    }

    private void setMaxDegrees(double maxDegrees){
        this.maxDegrees = maxDegrees;
    }

    private double getMinDegrees(){
        return minDegrees;
    }

    private double getMaxDegrees(){
        return maxDegrees;
    }
    //Tilgangsmetoder, slutt.

    @Override
    public String toString() {
        String text = "";
        text += "Termometer\n" +
                "(Min- og maks temp: " + getMinDegrees() + " - " + getMaxDegrees() + ")\n" +
                "Regnummer: " + getRegNr() + "\n" +
                "Plassering: " + getLocationCode() + "\n";
        if(this.isWorking())
            text += "Status: i orden";
        else
            text += "Status: i uorden";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thermometer that = (Thermometer) o;
        return this.getRegNr().equals(that.getRegNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRegNr());
    }
}
