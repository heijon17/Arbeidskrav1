import java.util.Objects;

/**
 * Write a description of class Thermometer here.
 *
 * @author Jon-Martin Heiberg
 * @version v0.1
 */
public class Thermometer extends Meter
{
    private double minDegrees;
    private double maxDegrees;

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

    public String toString() {
        return "Thermometer{" +
                "minDegrees=" + minDegrees +
                ", maxDegrees=" + maxDegrees +
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
