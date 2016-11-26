
package JAVA.gui;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class GUIExample extends JFrame
{
	public void paint(Graphics g) 
	{
		// Temporary code
		Graphics2D g2D = (Graphics2D)g; // Get a Java 2D device context
		g2D.setPaint(Color.RED); // Draw in red
		g2D.draw3DRect(50, 50, 150, 100, true); // Draw a raised 3D rectangle
		g2D.drawString("A nice 3D rectangle", 60, 100); // Draw some text
	}
	
	GUIExample()
	{
		super("My Frame");
	}

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		final GUIExample example = new GUIExample();	
	
		SwingUtilities.invokeLater(
			new Runnable() { // Anonymous Runnable class object
				public void run() { // Run method executed in thread
				example.createUI(); // Call static GUI creator
			}
		} );
		
	}
	
	public void createUI()
	{
		System.out.println(Thread.currentThread().getName());
		
		int windowWidth = 400; // Window width in pixels
		int windowHeight = 400; // Window height in pixels
		this.setBounds(50, 100, // Set position
		windowWidth, windowHeight); // and size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My JFrame");
		this.getContentPane().setBackground(Color.ORANGE);
		
		Dimension d = new Dimension(100,100);
		
		this.setMinimumSize(d);
		
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		//addComponents(this.getContentPane());
		
		this.setVisible(true);
	}
	
	public static void addComponents(Container c)
	{
		c.setLayout(new FlowLayout()); 
		for(int i = 1; i <= 6; i++)
		{
			JTextField textBox = new JTextField("Press " + i);
			textBox.setName("textBox : "+i);
			c.add(textBox); 
			textBox.addFocusListener(new TextBoxFocusListener());
		}
	}
}