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
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
