package spacetechnology.model.helper;

import spacetechnology.model.TLEData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 17.09.12
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class TLELoader {



    static public List<TLEData> loadTLEData(File[] files){
        List<TLEData> result = new ArrayList<TLEData>();
        System.out.println(files.length);
        for(File file : files){
            System.out.println("hello");
            result.add(loadFromFile(file));
        }
        return result;
    }

    static public TLEData loadFromFile(File file){
        TLEData result = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] lines = new String[2];
            lines[0] = reader.readLine();
            lines[1] = reader.readLine();
            result = parseLine(lines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static TLEData parseLine(String[] lines){
        String lineOne = lines[0];
        String lineTwo = lines[1];
        int satelliteNumber = Integer.parseInt(lineOne.substring(2, 7));
        int launchYear = Integer.parseInt("20"+lineOne.substring(9, 11));
        int launchNumber = Integer.parseInt(lineOne.substring(11, 14));
        String launchPiece =  lineOne.substring(14, 17);
        int epochYear = Integer.parseInt(lineOne.substring(18, 20));
        double epochDay = Double.parseDouble(lineOne.substring(20, 32));
        double derivativeMeanMotion = Double.parseDouble(lineOne.substring(33, 43));

        double inclination = Double.parseDouble(lineTwo.substring(8, 16));
        double rightAscension = Double.parseDouble(lineTwo.substring(17, 25));
        double eccentricity = Double.parseDouble(lineTwo.substring(26, 33));
        double perigee = Double.parseDouble(lineTwo.substring(34, 42));
        double meanAnomaly = Double.parseDouble(lineTwo.substring(43, 51));
        double meanMotion = Double.parseDouble(lineTwo.substring(52, 63));
        int revolutions = Integer.parseInt(lineTwo.substring(63, 68));

        return new TLEData(satelliteNumber,launchYear,launchNumber,launchPiece,epochYear,epochDay,derivativeMeanMotion,
                inclination,rightAscension,eccentricity,perigee,meanAnomaly,meanMotion,revolutions);
    }
}
