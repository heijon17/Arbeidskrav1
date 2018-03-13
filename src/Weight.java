import java.util.Objects;

/**
 * En vekt med et spesifikt vektintervall.
 *
 * @author Jon-Martin Heiberg
 * @version v1.0
 */
public class Weight extends Meter
{
    private double minWeight;
    private double maxWeight;

    //Standard konstruktør, brukes ikke i dette prosjektet.
    public Weight() {
        super();
        setMinWeight(0);
        setMaxWeight(50);
    }

    public Weight(String regNr, boolean isWorking, String locationCode, double minWeight, double maxWeight) {
        super(regNr, isWorking, locationCode);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //Tilgangsmetoder
    private double getMinWeight() {
        return minWeight;
    }

    private void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    private double getMaxWeight() {
        return maxWeight;
    }

    private void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    //Tilgangsmetoder, slutt.

    @Override
    public String toString() {
        String text = "";
        text += "Vekt\n" +
                "(Måleintervall: " + getMinWeight() + " - " + getMaxWeight() + ")\n" +
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
        Weight that = (Weight) o;
        return this.getRegNr().equals(that.getRegNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRegNr());
    }
}
