package spacetechnology.model;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */
public class TLEData {

    // values of line 1
    final private int satelliteNumber;
    final private int launchYear;
    final private int launchNumber;
    final private String launchPiece;
    final private int epochYear;
    final private double epochDay;
    final private double derivativeMeanMotion;

    // values of line 2
    final private double inclination;
    final private double rightAscension;
    final private double eccentricity;
    final private double perigee;
    final private double meanAnomaly;
    final private double meanMotion;
    final private int revolutions;



    public TLEData(int satelliteNumber, int launchYear, int launchNumber, String launchPiece, int epochYear, double epochDay, double derivativeMeanMotion, double inclination, double rightAscension, double eccentricity, double perigee, double meanAnomaly, double meanMotion, int revolutions) {
        this.satelliteNumber = satelliteNumber;
        this.launchYear = launchYear;
        this.launchNumber = launchNumber;
        this.launchPiece = launchPiece;
        this.epochYear = epochYear;
        this.epochDay = epochDay;
        this.derivativeMeanMotion = derivativeMeanMotion;
        this.inclination = inclination;
        this.rightAscension = rightAscension;
        this.eccentricity = eccentricity;
        this.perigee = perigee;
        this.meanAnomaly = meanAnomaly;
        this.meanMotion = meanMotion;
        this.revolutions = revolutions;
    }
}

