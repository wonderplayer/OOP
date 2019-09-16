/*
 * File: TemperatureApplet.java
 * Author: Java, Java, Java
 * Description: This applet provides a GUI to test the Temperature class.
 */
package com.company;


import java.applet.*;       
import java.awt.*;
import java.awt.event.*;

public class TemperatureApplet extends Applet implements ActionListener
{
    private TextField inField = new TextField(15);     // GUI components
    private TextField resultField = new TextField(15); 
    private Label prompt1 = new Label("Input Temperature >>");
    private Label prompt2 = new Label("Conversion Result:");
    private Button celsToFahr = new Button("C to F");
    private Button fahrToCels = new Button("F to C");

    private Temperature temperature = new Temperature();  // The temperature object

    /** 
     *  init() sets up the applet's interface
     */
    public void init()
    {                      // Set up the user interface
        add(prompt1);        // Input elements
        add(inField);
        add(celsToFahr);     // Control buttons
        add(fahrToCels);
        add(prompt2);        // Output elements
        add(resultField);
        celsToFahr.addActionListener(this);  // Register buttons with listeners
        fahrToCels.addActionListener(this);
        setSize(175,200);
    } // init()

    /** 
     *  actionPerformed() handles clicks on the applet's two buttons. Note
     *   that the TextField input must be converted from String to double.
     *  @param e -- the ActionEvent that caused this method to be called
     */
    public void actionPerformed(ActionEvent e) 
    {
        String inputStr = inField.getText();             // Get user's input
        double userInput = Double.parseDouble(inputStr); // Convert it to double
        double result = 0;

        if (e.getSource() == celsToFahr) {               // Process and report 
            result = temperature.celsToFahr(userInput);       
            resultField.setText(inputStr + " C = " + result  + " F");
        } else {
            result = temperature.fahrToCels(userInput);
            resultField.setText(inputStr + " F = " +  result  + " C");
        }
    } // actionPerformed

} // end of TemperatureApplet
