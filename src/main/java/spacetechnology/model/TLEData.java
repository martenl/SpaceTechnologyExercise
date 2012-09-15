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
    final private int internationalDesignator;
    final private char internationalDesignatorPiece;
    final private int epochYear;
    final private int Epoch;
    final private int firstTimeDerivativeOfTheMeanMotionDividedByTwo;
    final private int secondTimeDerivativeOfMeanMotionDividedBySix;
    final private int BSTARDragTerm;
    final private int ElementNumber;
    final private int checksum;

    // values of line 2
    final private int inclination;
    final private int rightAscensionOfTheAscendingNode;
    final private int eccentricity;
    final private int argumentOfPerigee;
    final private int meanAnomaly;
    final private int meanMotion;
    final private int RevolutionNumber;


    public TLEData(int satelliteNumber, int internationalDesignator, char internationalDesignatorPiece, int epochYear, int epoch, int firstTimeDerivativeOfTheMeanMotionDividedByTwo, int secondTimeDerivativeOfMeanMotionDividedBySix, int bstarDragTerm, int elementNumber, int checksum, int inclination, int rightAscensionOfTheAscendingNode, int eccentricity, int argumentOfPerigee, int meanAnomaly, int meanMotion, int revolutionNumber) {
        this.satelliteNumber = satelliteNumber;
        this.internationalDesignator = internationalDesignator;
        this.internationalDesignatorPiece = internationalDesignatorPiece;
        this.epochYear = epochYear;
        Epoch = epoch;
        this.firstTimeDerivativeOfTheMeanMotionDividedByTwo = firstTimeDerivativeOfTheMeanMotionDividedByTwo;
        this.secondTimeDerivativeOfMeanMotionDividedBySix = secondTimeDerivativeOfMeanMotionDividedBySix;
        BSTARDragTerm = bstarDragTerm;
        ElementNumber = elementNumber;
        this.checksum = checksum;
        this.inclination = inclination;
        this.rightAscensionOfTheAscendingNode = rightAscensionOfTheAscendingNode;
        this.eccentricity = eccentricity;
        this.argumentOfPerigee = argumentOfPerigee;
        this.meanAnomaly = meanAnomaly;
        this.meanMotion = meanMotion;
        RevolutionNumber = revolutionNumber;
    }
}

