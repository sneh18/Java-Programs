
package JAVA.gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TextBoxFocusListener implements FocusListener
{
	public void focusGained(FocusEvent event)
	{
		Component c = (JComponent)event.getSource();
		c.setBackground(Color.YELLOW);
		System.out.println("FocusGained-"+c.getName());
	}
	
	public void focusLost(FocusEvent event)
	{
		Component c = (JComponent)event.getSource();
		c.setBackground(Color.WHITE);
		System.out.println("Focus Lost-"+c.getName());
	}
}