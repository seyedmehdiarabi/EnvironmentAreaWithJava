/**
 *
 * @author Seyed Mahdi Arabi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rectangle extends JFrame {

    private JLabel lengthL, widthL , heightL, areaL, circumferenceL , contentL;
    private JTextField lengthTF, widthTF , heightTF, areaTF, circumferenceTF, contentTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    
    public Rectangle() 
    {
        lengthL = new JLabel ("Enter the Length : ", SwingConstants.RIGHT);
        widthL = new JLabel ("Enter the Width : ", SwingConstants.RIGHT);
        heightL = new JLabel ("Enter the Height : ", SwingConstants.RIGHT);
       
        areaL = new JLabel ("Area : ", SwingConstants.RIGHT);
        circumferenceL = new JLabel ("Circumference : ", SwingConstants.RIGHT);
        contentL = new JLabel ("Content : ", SwingConstants.RIGHT);
        
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        heightTF = new JTextField(10);       
        areaTF = new JTextField(10);
        circumferenceTF = new JTextField(10);
        contentTF = new JTextField(10);

        
        calculateB = new JButton ("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        
        exitB =  new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle ("Area And Circumference of a Rectangle");
        Container pane = getContentPane();
        pane.setLayout (new GridLayout (7, 2));
        
        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(heightL);
        pane.add(heightTF);        
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(circumferenceL);
        pane.add(circumferenceTF);
        pane.add(contentL);
        pane.add(contentTF);
        pane.add(calculateB);
        pane.add(exitB);
        
    }
    
    private class CalculateButtonHandler implements ActionListener 
    {
        public void actionPerformed (ActionEvent e)
        {
            double length ,width , height ,  area , circumference, content;
            
            length = Double.parseDouble (lengthTF.getText());           
            width = Double.parseDouble (widthTF.getText());           
            height = Double.parseDouble (heightTF.getText());           
            
            area = length * width ;
            circumference = (length + width) *2;
            content = length * width *height;
            
            
            areaTF.setText("" + String.format("%.2f%n" , area));
            circumferenceTF.setText("" + String.format("%.2f%n",circumference));
            contentTF.setText("" + String.format("%.2f%n",content));
        }
    }
    
    private class ExitButtonHandler implements ActionListener 
    {
        public void actionPerformed (ActionEvent e)
        {
            System.exit(0);
        }
    } 
}
