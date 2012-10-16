package spacetechnology.model;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 16.10.12
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
public class TLEDataList {
        List<TLEData> data;

    TLEDataList(){
        data = new ArrayList<TLEData>();
}

    public void addDataPoint(TLEData dp){
        int index = 0;
        while (index < data.size()){
            if(data.get(index).compareTo(dp) == -1) index++;
            else break;
        }
        data.add(index,dp);
    }
}
