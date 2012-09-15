package spacetechnology.view;

import org.jfree.chart.ChartPanel;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 13:33
 * To change this template use File | Settings | File Templates.
 */
public class OutputPanel extends JPanel {
    JTabbedPane tabbedPane;
    ChartPanel chart;
    OutputPanelChild xError;
    OutputPanelChild yError;
    OutputPanelChild zError;
    OutputPanelChild absoluteError;

    OutputPanel(){
        super();
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        xError = new OutputPanelChild(" X Error");
        xError.setBounds(getX(),getY(),getWidth(),getHeight());
        yError = new OutputPanelChild(" Y Error");
        yError.setBounds(getX(),getY(),getWidth(),getHeight());
        zError = new OutputPanelChild(" Z Error");
        zError.setBounds(getX(),getY(),getWidth(),getHeight());
        absoluteError = new OutputPanelChild(" Absolute Error");
        absoluteError.setBounds(getX(),getY(),getWidth(),getHeight());
        tabbedPane.addTab("X Error", xError);
        tabbedPane.addTab("Y Error", yError);
        tabbedPane.addTab("Z Error", zError);
        tabbedPane.addTab("Absolute Error", absoluteError);
        tabbedPane.setBounds(this.getBounds());
        add(tabbedPane);
    }
}
