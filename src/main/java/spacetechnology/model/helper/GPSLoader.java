package spacetechnology.model.helper;

import spacetechnology.model.GPSData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * User: Marten
 * Date: 16.09.12
 * Time: 19:14
 */
public class GPSLoader {

    static public List<GPSData> loadFromFile(File file){
        List<GPSData> result = new ArrayList<GPSData>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while(line != null){
                result.add(parseLine(line));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static GPSData parseLine(String line){
        String[] parts = line.split(" ");
        double positionX = Double.parseDouble(parts[0]);
        double positionY = Double.parseDouble(parts[1]);
        double positionZ = Double.parseDouble(parts[2]);

        double velocityX = Double.parseDouble(parts[3]);
        double velocityY = Double.parseDouble(parts[4]);
        double velocityZ = Double.parseDouble(parts[5]);

        int gpsWeek = Integer.parseInt(parts[6]);
        double gpsSecond = Double.parseDouble(parts[7]);

        int numberOfGPSSatellites = Integer.parseInt(parts[8]);

        double gdop = Double.parseDouble(parts[9]);

        return new GPSData(positionX,positionY,positionZ,velocityX,velocityY,velocityZ,gpsWeek,gpsSecond,numberOfGPSSatellites,gdop);
    }
}
