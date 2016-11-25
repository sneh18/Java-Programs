
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIAssignment
{
	public static void main(String[] args)
	{
		BorderLayoutFrame b = new BorderLayoutFrame();
		
	}
}

class BorderLayoutFrame implements ActionListener
{

	static JPanel northPanel;
	static JPanel southPanel;
	static JPanel westPanel;
	static JPanel eastPanel;
	static JPanel centerPanel;
	
	public int center;
	public int north;
	public int south;
	public int west;
	public int east;
	
	public BorderLayoutFrame()
	{
		JFrame jf = new JFrame();
		int windowWidth = 600; // Window width in pixels
		int windowHeight = 600; // Window height in pixels
		jf.setBounds(50, 100, // Set position
		windowWidth, windowHeight); // and size
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("My JFrame");
		//jf.getContentPane().setBackground(Color.ORANGE);
		
		Dimension d = new Dimension(100,100);
		
		jf.setMinimumSize(d);
		
		jf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//addComponents(jf.getContentPane());
		
		
		Container c = jf.getContentPane();
		c.setLayout(new BorderLayout(5, 5));

		JPanel p = new JPanel(null);
		
		JButton button;
		JCheckBox chk;
		
		// For West
		
		button = new JButton("Blue");
		button.setBounds(10,30,90,40);
		button.setText("Blue");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Orange");
		button.setBounds(10,90,90,40);
		button.setText("Orange");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("White");
		button.setBounds(10,150,90,40);
		button.setText("White");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Green");
		button.setBounds(10,210,90,40);
		button.setText("Green");
		button.addActionListener(this);
		p.add(button);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(150, 200));
		
		c.add(p, BorderLayout.WEST);
		
		westPanel = p;
		
		//---------------------------------------
		
		
		// For East
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(150, 200));
		
		c.add(p, BorderLayout.EAST);
		
		eastPanel = p;
		//---------------------------------------
		
		// For North
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 100));
		
		c.add(p, BorderLayout.NORTH);
		
		northPanel = p;
		//---------------------------------------
		
		// For South
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 100));
		
		c.add(p, BorderLayout.SOUTH);
		
		southPanel = p;
		//---------------------------------------
		
		// For Center
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 400));
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("Center");
		chk.addActionListener(this);
		
		p.add(chk);
		
		c.add(p, BorderLayout.CENTER);
		
		centerPanel = p;
		//---------------------------------------
		
		center = 0;
		north = 0;
		south  = 0;
		west = 0;
		east = 0;
		
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
	
		if(event.getSource() instanceof JButton)
		{
			JButton c = (JButton)event.getSource();
			Color selectedColor = Color.WHITE;
		
			if(c.getText().equals("Blue"))
				selectedColor = Color.BLUE;
			else if(c.getText().equals("Orange"))
				selectedColor = Color.ORANGE;
			else if(c.getText().equals("White"))
				selectedColor = Color.WHITE;
			else if(c.getText().equals("Green"))
				selectedColor = Color.GREEN;
				
				
			if(center == 1)
				centerPanel.setBackground(selectedColor);
		}
		else if(event.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)event.getSource();
			if(chk.getName().equals("Center"))
			{
				if(chk.isSelected())
					center = 1;
				else
					center = 0;
			}
			
		}
	}
}