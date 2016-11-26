
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

class BorderLayoutFrame extends JFrame implements ActionListener
{

	private JPanel northPanel;
	private JPanel southPanel;
	private JPanel westPanel;
	private JPanel eastPanel;
	private JPanel centerPanel;
	
	private boolean center;
	private boolean north;
	private boolean south;
	private boolean west;
	private boolean east;
	
	BorderLayoutFrame()
	{
		super("myJFrameBorderLayout");
		
		setBounds(50, 100, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My JFrame-BorderLayout");
		setMinimumSize(new Dimension(100,100));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));

		
		JPanel  p;
		JButton button;
		JCheckBox chk;
		
		
		//---------------------------------------
		// For West
		p = new JPanel(null);
		
		button = new JButton("Red");
		button.setBounds(10,30,80,20);
		button.setText("Red");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Green");
		button.setBounds(10,60,80,20);
		button.setText("Green");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Yellow");
		button.setBounds(10,120,80,20);
		button.setText("Yellow");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("White");
		button.setBounds(10,90,80,20);
		button.setText("White");
		button.addActionListener(this);
		p.add(button);
		
		
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("West");
		chk.addActionListener(this);
		
		p.add(chk);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(200, 200));
		
		c.add(p, BorderLayout.WEST);
		
		westPanel = p;
		
		//---------------------------------------
		
		//---------------------------------------
		// For East
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(200, 200));
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("East");
		chk.addActionListener(this);
		
		p.add(chk);
		
		c.add(p, BorderLayout.EAST);
		
		eastPanel = p;
		//---------------------------------------
		
		//---------------------------------------
		// For North
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 175));
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("North");
		chk.addActionListener(this);
		
		p.add(chk);
		
		c.add(p, BorderLayout.NORTH);
		
		northPanel = p;
		//---------------------------------------
		
		//---------------------------------------
		// For South
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 175));
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("South");
		chk.addActionListener(this);
		
		p.add(chk);
		
		c.add(p, BorderLayout.SOUTH);
		
		southPanel = p;
		//---------------------------------------
		
		//---------------------------------------
		// For Center
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 200));
		
		chk = new JCheckBox("Color Me");
		chk.setBounds(10, 10, 20, 20);
		chk.setName("Center");
		chk.addActionListener(this);
		
		p.add(chk);
		
		c.add(p, BorderLayout.CENTER);
		
		centerPanel = p;
		//---------------------------------------
		
		northPanel.setBackground(Color.WHITE);
		westPanel.setBackground(Color.WHITE);
		centerPanel.setBackground(Color.WHITE);
		eastPanel.setBackground(Color.WHITE);
		southPanel.setBackground(Color.WHITE);
		
		center = false;
		north  = false;
		south  = false;
		west   = false;
		east   = false;
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
	
		if(event.getSource() instanceof JButton)
		{
			JButton c = (JButton)event.getSource();
			Color selectedColor = Color.WHITE;
		
			if(c.getText().equals("Red"))
				selectedColor = Color.RED;
			else if(c.getText().equals("Yellow"))
				selectedColor = Color.YELLOW;
			else if(c.getText().equals("White"))
				selectedColor = Color.WHITE;
			else if(c.getText().equals("Green"))
				selectedColor = Color.GREEN;
				
				
			if(center)
				centerPanel.setBackground(selectedColor);
			if(east)
				eastPanel.setBackground(selectedColor);
			if(west)
				westPanel.setBackground(selectedColor);
			if(north)
				northPanel.setBackground(selectedColor);
			if(south)
				southPanel.setBackground(selectedColor);
		
		}
		else if(event.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)event.getSource();
			if(chk.getName().equals("Center"))
			{
				if(chk.isSelected())
					center = true;
				else
					center = false;
			}
			else if(chk.getName().equals("North"))
			{
				if(chk.isSelected())
					north = true;
				else
					north = false;
			}
			else if(chk.getName().equals("South"))
			{
				if(chk.isSelected())
					south = true;
				else
					south = false;
			}
			else if(chk.getName().equals("West"))
			{
				if(chk.isSelected())
					west = true;
				else
					west = false;
			}
			else if(chk.getName().equals("East"))
			{
				if(chk.isSelected())
					east = true;
				else
					east = false;
			}
		}
		
		System.out.println("---------------------------");
		System.out.println("Status : Center->" + center );
		System.out.println("Status : East  ->" + east   );
		System.out.println("Status : West  ->" + west   );
		System.out.println("Status : North ->" + north  );
		System.out.println("Status : South ->" + south  );
		System.out.println("---------------------------");
	}
}
