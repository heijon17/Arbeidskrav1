import java.util.Objects;

/**
 * Write a description of class Clock here.
 *
 * @author Jon-Martin Heiberg
 * @version v0.1
 */
public class Clock extends Meter
{
    private double minTimeInterval; //i sekunder

    public Clock() {
        super();
        setMinTimeInterval(1);
    }

    public Clock(String regNr, boolean isWorking, String locationCode, double minTimeInterval) {
        super(regNr, isWorking, locationCode);
        setMinTimeInterval(minTimeInterval);
    }

    private double getMinTimeInterval() {
        return minTimeInterval;
    }

    private void setMinTimeInterval(double minTimeInterval) {
        this.minTimeInterval = minTimeInterval;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "minTimeInterval=" + minTimeInterval +
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
