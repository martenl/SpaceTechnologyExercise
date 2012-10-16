package spacetechnology.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.10.12
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class DiagrammPanel  extends JPanel {

    int[] xs;
    int[] ys;
    public DiagrammPanel(){
        super();
    }

    public void initDiagramm(int columnWidth,double[] data){
        int length = data.length;
        xs = new int[length];
        ys = new int[length];
        for(int i = 0;i<length;i++){
            xs[i] = i * columnWidth;
            ys[i] = 400 + (int)data[i];
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawPolyline(xs, ys, xs.length);


    }
}
