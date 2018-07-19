/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encounterconverter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import my.encounterconverter.EncounterConverterUI;
/**
 *
 * @authors yxp10898  pxm10899 
 */
public class EncounterConverter extends EncounterConverterUI implements ActionListener {
    /**
     * @param args the command line arguments
     */
    
    public EncounterConverter() {
        EncounterConverterUI test = new EncounterConverterUI();
        test.setVisible(true);
    }
    
    public static void main(String[] args) {
        EncounterConverter encounterConverter = new EncounterConverter();
    }
}

    

