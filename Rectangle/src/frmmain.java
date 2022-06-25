/**
 *
 * @author Arka
 */
import javax.swing.JFrame;

public class frmmain {
    private static final int WIDTH = 325;
    private static final int HEIGHT = 220;
    public static void main (String[] args)
    {
        Rectangle cirObject = new Rectangle ();
        cirObject.setSize(WIDTH, HEIGHT);
        cirObject.setVisible(true);
        cirObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
