import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
/**
 * Creates a Graphical User Interface to simulate a dice roll.
 * Creates a window that holds one DicePanel object.
 * The DicePanel uses a Dice(default 6 sides) object to obtain a roll value. 
 * Then displays the roll value and image. 
 * @author Brad Murphy
 * @version Oct 14 2008
 *
 */
public class DiceGUISimple extends JFrame {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    static private DicePanel die1;

	public static void main(String[] args) {
		createAndShowGUI();
	}
	/**
	 * Creates and shows the GUI for the DiceGUI class
	 */
	private static void createAndShowGUI() {
		die1 = new DicePanel(new Dice(), "Die", new JTextField(2),false);
		
		// Create window
		DiceGUISimple guiWindow = new DiceGUISimple(die1);

		/****************** Menu Bar ************************/
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menuItem;
		JMenu file, help;
		// Build the file menu.
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		menuBar.add(file);
		// Quit
		menuItem = new JMenuItem("Quit", KeyEvent.VK_Q);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				ActionEvent.ALT_MASK));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		file.add(menuItem);
		// Build the Help menu.
		help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		menuBar.add(help);
		// About
		menuItem = new JMenuItem("About", KeyEvent.VK_A);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				ActionEvent.ALT_MASK));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Set icon image
				ImageIcon icon = new ImageIcon("mypic.jpg");
				JOptionPane.showMessageDialog(null,
						"DiceGUI\nby: Brad Murphy", "About", 0, icon);
			}
		});
		help.add(menuItem);
		/******************** End Menu Bar *************************/
		
		// Set window attributes
		guiWindow.setSize(250, 130);
		guiWindow.setJMenuBar(menuBar);
		guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiWindow.setLocationRelativeTo(null);
		guiWindow.setVisible(true);
	}
	/**
	 * Constructor for the DiceGUI1 class
	 * @param die1 DicePanel object
	 */
	public DiceGUISimple(DicePanel die1) {
		super("Dice GUI");
		this.add(die1, BorderLayout.CENTER);	
	}
}
