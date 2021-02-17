/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.awt.Component;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class Sistema implements Serializable {

    private boolean bestVideo;
    private boolean bestAudio;
    private String filePath;
    private final String FILENAME = "Sistema.Dados";

    public Sistema() {
        bestVideo = true;
        bestVideo = true;
        filePath = System.getProperty("user.home") + "/Desktop";
    }

    public Sistema readSistema(Component componente) throws ClassNotFoundException, IOException { //Método que lê um ficheiro stream objeto e retorna um objeto Sistema. Se ocorrer um erro, irá delvolver um novo Objeto criado e gravá-lo depois.
        ObjectInputStream inputSistema = null;
        ObjectOutputStream outputSistema = null;
        try {
            inputSistema = new ObjectInputStream(new FileInputStream(FILENAME));
            Sistema sistema = (Sistema) inputSistema.readObject();
            return sistema;
        } catch (IOException ex) {
            outputSistema = new ObjectOutputStream(new FileOutputStream(FILENAME));
            Sistema sistema = new Sistema();
            return sistema;
        } finally {
            if (inputSistema != null) {
                inputSistema.close();
            }
        }
    }

    public void writeSistema(Component componente) {                             //Método que grava o objeto da class sistema num ficheiro stream objeto. Se ocorrer um erro, fecha a stream.
        ObjectOutputStream outputSistema = null;
        try {
            outputSistema = new ObjectOutputStream(new FileOutputStream(FILENAME));
            outputSistema.writeObject(this);
        } catch (IOException ex) {
        } finally {
            if (outputSistema != null) {
                try {
                    outputSistema.close();
                } catch (IOException ex) {
                    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean isBestVideo() {
        return bestVideo;
    }

    public void setBestVideo(boolean bestVideo) {
        this.bestVideo = bestVideo;
    }

    public boolean isBestAudio() {
        return bestAudio;
    }

    public void setBestAudio(boolean bestAudio) {
        this.bestAudio = bestAudio;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
