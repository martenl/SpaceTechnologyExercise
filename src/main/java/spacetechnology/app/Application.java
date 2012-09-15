package spacetechnology.app;

import spacetechnology.view.GUI;

/**
 * Created with IntelliJ IDEA.
 * User: Laptop
 * Date: 15.09.12
 * Time: 09:20
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    static public void main(String[] args){
        System.out.println(args[0]);
        GUI myGUI = new GUI();
        myGUI.show();
    }
}
