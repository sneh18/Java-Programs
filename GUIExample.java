
package JAVA.gui;
import javax.swing.*;
import java.awt.*;

class GUIExample
{
	public static void main(String[] args)
	{
		
		JFrame jf = new JFrame();
		int windowWidth = 400; // Window width in pixels
		int windowHeight = 400; // Window height in pixels
		jf.setBounds(50, 100, // Set position
		windowWidth, windowHeight); // and size
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("My JFrame");
		jf.getContentPane().setBackground(Color.ORANGE);
		
		Dimension d = new Dimension(100,100);
		
		jf.setMinimumSize(d);
		
		jf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addComponents(jf.getContentPane());
		
		jf.setVisible(true);
	}
	
	public static void addComponents(Container c)
	{
		c.setLayout(new FlowLayout()); 
		for(int i = 1; i <= 6; i++)
		{
			JButton button = new JButton("Press " + i);
			button.setName("Button : "+i);
			c.add(button); 
			button.addActionListener(new ButtonClickListener());
		}
	}
}