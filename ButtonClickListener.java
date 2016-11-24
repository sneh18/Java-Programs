
package JAVA.gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ButtonClickListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Component c = (JComponent)event.getSource();
		JOptionPane.showMessageDialog(null, c.getName()+" Clciked.");
		System.out.println("Action Performed");
	}
}