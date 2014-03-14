import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Creates a JPanel that contains a roll button, an image, a text
 * field and a label. Uses a Dice object to obtain a roll value. After each
 * roll, the image and text field are updated to display the value of the roll.
 * 
 * @author Brad Murphy 
 * @version Oct 14 2008
 */
public class DicePanel extends JPanel implements ActionListener {
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private ImageIcon image = null;
	private JButton roll;
	private JTextField dieVal;
	private Integer rollVal;
	private Dice dice;
	private int numViewers = 0;
	private ArrayList<DicePanelObserver> viewers = new ArrayList<DicePanelObserver>();

	/**
	 * Constructor for the DicePanel class.
	 * 
	 * @param die
	 *            Dice object
	 * @param lName
	 *            String for label name
	 * @param valField
	 *            JTextField object
	 * @param flag
	 *            boolean set true to call DiceGUI.calc() after roll
	 */
	public DicePanel(Dice die, String lName, JTextField valField, boolean flag) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		rollVal = 0;
		dieVal = valField;
		dice = die;

		// Label
		JLabel label = new JLabel(lName);
		c.ipady = 1;
		c.gridx = 1;
		c.anchor = GridBagConstraints.CENTER;
		this.add(label, c);

		// Roll Button
		roll = new JButton("Roll");
		roll.addActionListener(this);
		if (lName.equals("Die 1")) {
			roll.setMnemonic(KeyEvent.VK_1);
		}
		if (lName.equals("Die 2")) {
			roll.setMnemonic(KeyEvent.VK_2);
		}
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(roll);
		c.anchor = GridBagConstraints.CENTER;
		c.gridy = 2;
		c.gridx = 1;
		this.add(buttonPanel, c);

		// Value Field
		c.gridy = 2;
		c.gridx = 3;
		this.add(dieVal, c);
	}

	/* Action performed when roll button is pressed */
	public void actionPerformed(ActionEvent e) {
		System.out.println("roll event");
		rollVal = dice.roll();
		dieVal.setText(rollVal.toString());
		setDiceImage(rollVal);
		repaint();
		this.updateViewers();
	}

	/* Paints image and sets its location */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			image.paintIcon(this, g, 15, 15);
	}

	/**
	 * Sets the image according to the roll value
	 * 
	 * @param rollVal
	 *            integer - value of dice roll
	 */
	private void setDiceImage(int rollVal) {
		if (rollVal == 1) {
			image = new ImageIcon("images/die_one.gif");
		}
		if (rollVal == 2) {
			image = new ImageIcon("images/die_two_sm.gif");
		}
		if (rollVal == 3) {
			image = new ImageIcon("images/die_three_sm.gif");
		}
		if (rollVal == 4) {
			image = new ImageIcon("images/die_four.gif");
		}
		if (rollVal == 5) {
			image = new ImageIcon("images/die_five_sm.gif");
		}
		if (rollVal == 6) {
			image = new ImageIcon("images/die_six_sm.gif");
		}
		if (rollVal > 6) {
			image = new ImageIcon("images/dice.jpg");
		}
	}
	
	/**
     * Updates all viewers of this panel.
     */
    private void updateViewers() {
        for (int i = 0; i < numViewers; i++) {
            viewers.get(i).update();
        }
    }

    /**
     * Adds a viewer to this panel.
     * 
     * @param o
     *            The viewer to be added.
     */
    public void addViewer(DicePanelObserver o) {
        viewers.add(o);
        numViewers++;
    }

    /**
     * Removes a viewer from this panel.
     * 
     * @param o
     *            The viewer to be removed.
     */
    public void remViewers(DicePanelObserver o) {
        viewers.remove(o);
        numViewers--;
    }
	

	/**
	 * Returns rollVal
	 * @return integer rollVal - the value of the last dice roll
	 */
	public int getRollVal() {
		return rollVal;
	}
}