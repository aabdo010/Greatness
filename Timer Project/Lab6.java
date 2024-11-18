import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The main GUI application class for the elapsed timer.
 * It contains a "Start" button to record the start time, 
 * and a "Stop" button to calculate and display the elapsed time.
 * 
 * @author YourName
 * @version 1.0
 */
public class Lab6 extends JFrame {

    private JButton start = new JButton("Start");
    private JButton stop = new JButton("Stop");
    private JLabel show = new JLabel("Elapsed Time: 0 ms");
    private long startTime;

    /**
     * Main method to launch the application.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        new Lab6();
    }

    /**
     * Constructor for Lab6.
     * Sets up the GUI components and initializes button listeners.
     */
    public Lab6() {
        // Set the layout and add components
        setLayout(new FlowLayout());
        add(start);
        add(stop);
        add(show);

        // Add listeners to buttons
        start.addActionListener(new StartClass(this));
        stop.addActionListener(new StopClass(this));

        // Configure the JFrame
        setTitle("Elapsed Timer");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Gets the current start time.
     * 
     * @return the recorded start time
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time.
     * 
     * @param startTime the time to set as the start time
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * Gets the label used to display elapsed time.
     * 
     * @return the JLabel showing elapsed time
     */
    public JLabel getShowLabel() {
        return show;
    }
}
