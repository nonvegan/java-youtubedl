package FrontEnd;

import BackEnd.CustomOutputStream;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import BackEnd.Sistema;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow extends javax.swing.JFrame {
    
    private Sistema sistema;
    private ArrayList<String> comandosArray;
    private Consola consola;
    
    public MainWindow(Sistema sistema, Consola consola) {
        this.sistema = sistema;
        comandosArray = new ArrayList<>();
        this.consola = consola;
        PrintStream printStream = new PrintStream(new CustomOutputStream(this.consola.getjTextArea1()));
        System.setOut(printStream);
        System.setErr(printStream);
        initComponents();
        setValues();
        setLocationRelativeTo(null);
        setResizable(false);
        comandosArray.add("cmd.exe");
        comandosArray.add("/c");
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setValues() {
        bestVideoButton.setSelected(sistema.isBestVideo());
        bestAudioButton.setSelected(sistema.isBestAudio());
        destinoTextField.setText(sistema.getFilePath());
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destinoTextField = new javax.swing.JTextField();
        destinoButton = new javax.swing.JButton();
        bestVideoButton = new javax.swing.JRadioButton();
        bestAudioButton = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Youtube-dl");
        setMaximumSize(new java.awt.Dimension(475, 230));
        setMinimumSize(new java.awt.Dimension(475, 230));
        setPreferredSize(new java.awt.Dimension(475, 230));

        destinoTextField.setEditable(false);
        destinoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoTextFieldActionPerformed(evt);
            }
        });
        destinoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinoTextFieldKeyReleased(evt);
            }
        });

        destinoButton.setText("Destino");
        destinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoButtonActionPerformed(evt);
            }
        });

        bestVideoButton.setText("Best Video");
        bestVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestVideoButtonActionPerformed(evt);
            }
        });

        bestAudioButton.setText("Best Audio");
        bestAudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestAudioButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close-circle-red-512.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bestVideoButton)
                    .addComponent(bestAudioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(70, 70, 70))
                            .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinoButton)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestVideoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestAudioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoButtonActionPerformed
        try {
            JFileChooser f = new JFileChooser(destinoTextField.getText());
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.showSaveDialog(null);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
            sistema.setFilePath(f.getSelectedFile().getAbsolutePath());
            destinoTextField.setText(sistema.getFilePath());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e", "Diretório não encontrado", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_destinoButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (isURL(jTextField1.getText()) && isValidPath(sistema.getFilePath())) {
            String mainComando = "cd " + sistema.getFilePath() + " && " + "youtubedl " + jTextField1.getText();
            if (sistema.isBestVideo() && sistema.isBestAudio()) {
                mainComando += " -f best";
            } else {
                if (sistema.isBestVideo()) {
                    mainComando += " -f bestvideo";
                } else {
                    if (sistema.isBestAudio()) {
                        mainComando += " -f bestaudio";
                    }
                }
            }
            comandosArray.add(mainComando);
            ProcessBuilder processBuilder = new ProcessBuilder(comandosArray);
            
            try {
                OutputStream stdin = null;
                InputStream stderr = null;
                InputStream stdout = null;
                String line;
                consola.getjTextArea1().setText("");
                Process processo = processBuilder.start();
                
                consola.setLocation((int) this.getLocation().getX() + (int) this.getSize().getWidth(), (int) this.getLocation().getY());
                consola.setVisible(true);
                consola.requestFocus();
                
                stdin = processo.getOutputStream();
                stderr = processo.getErrorStream();
                stdout = processo.getInputStream();
                
                line = "param1" + "\n";
                stdin.write(line.getBytes());
                stdin.flush();
                
                line = "param2" + "\n";
                stdin.write(line.getBytes());
                stdin.flush();
                
                line = "param3" + "\n";
                stdin.write(line.getBytes());
                stdin.flush();
                stdin.close();
                
                BufferedReader brCleanUp = new BufferedReader(new InputStreamReader(stdout));
                System.out.println(mainComando.substring(0, mainComando.indexOf("&&")));
                System.out.println(mainComando.substring(mainComando.indexOf("&&") + 3));
                while ((line = brCleanUp.readLine()) != null) {
                    System.out.println("[Stdout] " + line);
                }
                brCleanUp.close();
                
                brCleanUp = new BufferedReader(new InputStreamReader(stderr));
                
                while ((line = brCleanUp.readLine()) != null) {
                    System.out.println("[Stderr] " + line);
                }
                
                brCleanUp.close();
                
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex, "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            
            final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
            
            if (runnable != null) {
                runnable.run();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bestVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestVideoButtonActionPerformed
        if (bestVideoButton.isSelected()) {
            sistema.setBestVideo(true);
        } else {
            sistema.setBestVideo(false);
        }
    }//GEN-LAST:event_bestVideoButtonActionPerformed

    private void bestAudioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestAudioButtonActionPerformed
        if (bestAudioButton.isSelected()) {
            sistema.setBestAudio(true);
        } else {
            sistema.setBestAudio(true);
        }
    }//GEN-LAST:event_bestAudioButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sistema.writeSistema(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void destinoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoTextFieldActionPerformed

    }//GEN-LAST:event_destinoTextFieldActionPerformed

    private void destinoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinoTextFieldKeyReleased
        sistema.setFilePath(destinoTextField.getText());
    }//GEN-LAST:event_destinoTextFieldKeyReleased
    
    public boolean isURL(String url) {
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Link inválido", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    public boolean isValidPath(String path) {
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Path inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bestAudioButton;
    private javax.swing.JRadioButton bestVideoButton;
    private javax.swing.JButton destinoButton;
    private javax.swing.JTextField destinoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
