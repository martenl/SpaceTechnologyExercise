package spacetechnology.model;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 20.09.12
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public class GPSDataList {

    List<GPSData> data;
    double maxGDOP;

    GPSDataList(){
        data = new ArrayList<GPSData>();
        maxGDOP = 10.0;
    }

    public void addDataPoint(GPSData dp){
        int index = 0;
        while (index < data.size()){
            if(data.get(index).compareTo(dp) == -1) index++;
            else break;
        }
        data.add(index,dp);
    }

}
