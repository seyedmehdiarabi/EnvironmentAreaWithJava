/**
 *
 * @author Seyed Mahdi Arabi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square extends JFrame {

    private JLabel lengthL, areaL, circumferenceL , contentL;
    private JTextField lengthTF, areaTF, circumferenceTF, contentTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    
    public Square() 
    {
        lengthL = new JLabel ("Enter the length : ", SwingConstants.RIGHT);
        areaL = new JLabel ("Area : ", SwingConstants.RIGHT);
        circumferenceL = new JLabel ("Circumference : ", SwingConstants.RIGHT);
        contentL = new JLabel ("Content : ", SwingConstants.RIGHT);
        
        lengthTF = new JTextField(10);
        areaTF = new JTextField(10);
        circumferenceTF = new JTextField(10);
        contentTF = new JTextField(10);

        
        calculateB = new JButton ("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        
        exitB =  new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle ("Area And Circumference of a Square");
        Container pane = getContentPane();
        pane.setLayout (new GridLayout (5, 2));
        
        pane.add(lengthL);
        pane.add(lengthTF);
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
            double length , area , circumference, content;
            
            length = Double.parseDouble (lengthTF.getText());
            area = length * length ;
            circumference = length * 4;
            content = Math.pow(length,3);
            
            
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
