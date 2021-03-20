/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.CustomOutputStream;
import BackEnd.Sistema;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Pedro
 */
public class Arranque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new MainWindow(new Sistema().readSistema(null), new Consola()).setVisible(true);
    }

}
