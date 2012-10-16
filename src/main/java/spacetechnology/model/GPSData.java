package spacetechnology.model;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
public class GPSData {
    final private double positionX;
    final private double positionY;
    final private double positionZ;

    final private double velocityX;
    final private double velocityY;
    final private double velocityZ;

    final private int gpsWeek;
    final private double gpsSecond;

    final private int numberOfGPSSatellites;

    final private double gdop;

    public GPSData(double positionX, double positionY, double positionZ, double velocityX, double velocityY, double velocityZ, int gpsWeek, double gpsSecond, int numberOfGPSSatellites, double gdop) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
        this.gpsWeek = gpsWeek;
        this.gpsSecond = gpsSecond;
        this.numberOfGPSSatellites = numberOfGPSSatellites;
        this.gdop = gdop;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public double getPositionZ() {
        return positionZ;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public double getVelocityZ() {
        return velocityZ;
    }

    public int getGpsWeek() {
        return gpsWeek;
    }

    public double getGpsSecond() {
        return gpsSecond;
    }

    public int getNumberOfGPSSatellites() {
        return numberOfGPSSatellites;
    }

    public double getGdop() {
        return gdop;
    }

    static GPSData parseFromLine(String line){
         return null;
    }


    public int compareTo(GPSData dp) {
        if(getGpsWeek() < dp.getGpsWeek() || getGpsWeek() == gpsWeek && getGpsSecond() < dp.getGpsSecond()) return -1;
        if(getGpsWeek() == gpsWeek && getGpsSecond() == dp.getGpsSecond()) return 0;
        return 1;
    }
}
