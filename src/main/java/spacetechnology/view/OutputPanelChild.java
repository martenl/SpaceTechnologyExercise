package spacetechnology.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public class OutputPanelChild extends JPanel {

    JLabel description;

    OutputPanelChild(String title){
        setLayout(new GridLayout(2, 2));
        description = new JLabel("Here goes the description "+title);
        add(description);
    }
}
