/**
 *
 * @author Seyed Mahdi Arabi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleProgram extends JFrame {

    private JLabel radiusL, areaL, circumferenceL , contentL;
    private JTextField radiusTF, areaTF, circumferenceTF, contentTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    
    public CircleProgram() 
    {
        radiusL = new JLabel ("Enter the radius : ", SwingConstants.RIGHT);
        areaL = new JLabel ("Area : ", SwingConstants.RIGHT);
        circumferenceL = new JLabel ("Circumference : ", SwingConstants.RIGHT);
        contentL = new JLabel ("Content : ", SwingConstants.RIGHT);
        
        radiusTF = new JTextField(10);
        areaTF = new JTextField(10);
        circumferenceTF = new JTextField(10);
        contentTF = new JTextField(10);

        
        calculateB = new JButton ("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        
        exitB =  new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle ("Area And Circumference of a Circle");
        Container pane = getContentPane();
        pane.setLayout (new GridLayout (5, 2));
        
        pane.add(radiusL);
        pane.add(radiusTF);
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
            double radius , area , circumference, content;
            
            radius = Double.parseDouble (radiusTF.getText());
            area = Math.PI * Math.pow(radius, 2) ;
            circumference = 2 * Math.PI * radius;
            content = 1.33333333333 * Math.PI * Math.pow(radius, 3);            
            
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
