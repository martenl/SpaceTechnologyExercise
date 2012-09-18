package spacetechnology.view;

import spacetechnology.model.helper.GPSLoader;
import spacetechnology.model.helper.TLELoader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class ControlPanel extends JPanel implements ActionListener {

    JButton loadGPSFile;
    JButton loadTLEFile;
    JButton computeChart;
    JFileChooser fileChooser;

    ControlPanel(){
        super();
        setBounds(0, 0, 200, 200);
        loadGPSFile = new JButton("Load files");
        loadGPSFile.setBounds(10, 10, 50, 50);
        loadGPSFile.setActionCommand("l");
        loadGPSFile.addActionListener(this);
        add(loadGPSFile);
        loadTLEFile = new JButton("Load TLE files");
        loadTLEFile.setBounds(10, 70, 50, 50);
        loadTLEFile.setActionCommand("t");
        loadTLEFile.addActionListener(this);
        add(loadTLEFile);
        computeChart = new JButton("Compute Charts");
        computeChart.setBounds(10, 20, 50, 50);
        add(computeChart);
    }

    /**
     * Invoked when an action occurs.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand().charAt(0)){
            case 'l':
                   loadGPSFile();
                    break;
            case 't':
                loadTLEFile();
        }
    }

    private void loadGPSFile() {
        fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        System.out.println(GPSLoader.loadFromFile(fileChooser.getSelectedFile()).size());
    }

    private void loadTLEFile() {
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.showOpenDialog(this);
        TLELoader.loadTLEData(fileChooser.getSelectedFiles());
    }

}
