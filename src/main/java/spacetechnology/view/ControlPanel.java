package spacetechnology.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class ControlPanel extends JPanel {

    JButton loadFiles;
    JButton computeChart;
    FileDialog fd;

    ControlPanel(){
        super();
        setBounds(0, 0, 200, 200);
        loadFiles = new JButton("Load files");
        loadFiles.setBounds(10, 10, 50, 50);
        add(loadFiles);
        computeChart = new JButton("Compute Charts");
        loadFiles.setBounds(10, 20, 50, 50);
        add(computeChart);
    }
}
