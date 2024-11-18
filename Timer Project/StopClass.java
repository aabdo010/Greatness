import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * ActionListener for the "Stop" button.
 * Calculates the elapsed time and displays it on the GUI and in a pop-up.
 * 
 * @author YourName
 * @version 1.0
 */
public class StopClass implements ActionListener {

    private Lab6 lab6Instance;

    /**
     * Constructor for StopClass.
     * 
     * @param lab6Instance an instance of the Lab6 class to access its components
     */
    public StopClass(Lab6 lab6Instance) {
        this.lab6Instance = lab6Instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Record the current system time as the stop time
        long stopTime = System.currentTimeMillis();

        // Calculate the elapsed time
        long elapsedTime = stopTime - lab6Instance.getStartTime();

        // Update the label to show the elapsed time
        lab6Instance.getShowLabel().setText(String.format("Elapsed Time: %d ms", elapsedTime));

        // Show the elapsed time in a dialog box
        JOptionPane.showMessageDialog(null, String.format("Elapsed time: %d milliseconds", elapsedTime));
    }
}
