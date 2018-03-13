import java.util.Objects;

/**
 * Write a description of class Weight here.
 *
 * @author Jon-Martin Heiberg
 * @version v0.1
 */
public class Weight extends Meter
{
    private double minWeight;
    private double maxWeight;

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

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String toString() {
        return "Weight{" +
                "minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                '}';
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
