package spacetechnology.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 14.09.12
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class GUI implements ActionListener {

    JFrame frame;
    ControlPanel controlPanel;
    OutputPanel outputPanel;

    public void show(){
        frame = new JFrame("Raumfahrttechnik Übung");
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlPanel = new ControlPanel();
        outputPanel  = new OutputPanel();
        outputPanel.setBounds(200,0,600,600);
        frame.getContentPane().add(controlPanel);
        frame.getContentPane().add(outputPanel);
        frame.setVisible(true);
    }
    /**
     * Invoked when an action occurs.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
