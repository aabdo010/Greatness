import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * ActionListener for the "Start" button.
 * Records the start time and displays a confirmation message.
 * 
 * @author YourName
 * @version 1.0
 */
public class StartClass implements ActionListener {

    private Lab6 lab6Instance;

    /**
     * Constructor for StartClass.
     * 
     * @param lab6Instance an instance of the Lab6 class to access its components
     */
    public StartClass(Lab6 lab6Instance) {
        this.lab6Instance = lab6Instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Record the current system time as the start time
        lab6Instance.setStartTime(System.currentTimeMillis());
        lab6Instance.getShowLabel().setText("Timer started...");
        JOptionPane.showMessageDialog(null, "Timer started!");
    }
}
