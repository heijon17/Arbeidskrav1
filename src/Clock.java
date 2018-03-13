import java.util.Objects;

/**
 * En klokke med et spesifikk tidsintervall.
 *
 * @author Jon-Martin Heiberg
 * @version v1.0
 */
public class Clock extends Meter
{
    private double minTimeInterval; //i sekunder

    //Standard konstruktør, brukes ikke i dette prosjektet.
    public Clock() {
        super();
        setMinTimeInterval(1);
    }

    public Clock(String regNr, boolean isWorking, String locationCode, double minTimeInterval) {
        super(regNr, isWorking, locationCode);
        setMinTimeInterval(minTimeInterval);
    }

    //Tilgangsmetoder
    private double getMinTimeInterval() {
        return minTimeInterval;
    }

    private void setMinTimeInterval(double minTimeInterval) {
        this.minTimeInterval = minTimeInterval;
    }
    //Tilgangsmetoder, slutt.

    @Override
    public String toString() {
        String text = "";
        text += "Klokke\n" +
                "(Minste tidsintervall: " + getMinTimeInterval() + ")\n" +
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
        Clock that = (Clock) o;
        return this.getRegNr().equals(that.getRegNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRegNr());
    }
}
