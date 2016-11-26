import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;

class BorderLayout1 implements ActionListener
{
	static JFrame jf = new JFrame("This is a Border Layout");
	static BorderLayout1 bl=new BorderLayout1();
	JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
	public   JComponent leftside()
	{
		
		JCheckBox jc1=new JCheckBox("WEST");
		panel1.setLayout(new GridLayout(10,10));
		panel1.add(jc1);
		
		JButton btn1 = new JButton("ORANGE");
		panel1.add(btn1);
		JButton btn2 = new JButton("RED");
		panel1.add(btn2);
		JButton btn3 = new JButton("GREEN");
		panel1.add(btn3);
		JButton btn4 = new JButton("BLUE");
		panel1.add(btn4);
		JButton btn5 = new JButton("YELLOW");
		panel1.add(btn5);
		
		btn1.setName("RED1");
		btn2.setName("ORANGE");
		btn3.setName("GREEN");
		btn4.setName("BLUE");
		btn5.setName("YELLOW");
		btn1.addActionListener(new Btnclklst());
		btn2.addActionListener(new Btnclklst());
		btn3.addActionListener(new Btnclklst());
		btn4.addActionListener(new Btnclklst());
		btn5.addActionListener(new Btnclklst());
		return panel1;
	}
	
	public static void main(String [] args)
	{
		 
		bl.makeFrame();
	
	}
	public void makeFrame()
	{
	Toolkit tlkt = jf.getToolkit(); 
		Dimension dim = tlkt.getScreenSize();
		jf.setBounds(0,0,dim.width,dim.height);
		BorderLayout br=new BorderLayout();
		
		Container content = jf.getContentPane();
		content.setLayout(br);
		 
		content.add(bl.leftside(),BorderLayout.WEST);
		
		JCheckBox jc1=new JCheckBox("EAST");
		content.add(jc1,BorderLayout.EAST);
		
		jc1=new JCheckBox("SOUTH");
		panel2.add(jc1);
	
		content.add(panel2,BorderLayout.SOUTH);
		
		jc1=new JCheckBox("CENTER");
		content.add(jc1,BorderLayout.CENTER);
		
		jc1=new JCheckBox("NORTH");
		content.add(jc1,BorderLayout.NORTH);
			
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800,400);
		jf.setVisible(true);	
	}
	public void actionPerformed(ActionEvent event)
	{
		JPanel panel1 = new JPanel();
		JComponent comp= (JComponent)event.getSource();
		Color color;
		System.out.println(comp.getName());
		if(comp.getName()=="RED1")
		{
			color=Color.RED;
			panel1.setBackground(color);
		}
		else if(comp.getName()=="ORANGE")
		{
			color=Color.ORANGE;
			panel2.setBackground(color);
		}
		else if(comp.getName()=="GREEN")
		{
			color=Color.GREEN;
			panel3.setBackground(color);
		}
		else if(comp.getName()=="BLUE")
		{
			color=Color.BLUE;
			panel4.setBackground(color);
		}
		else if(comp.getName()=="YELLOW")
		{
			color=Color.YELLOW;
			panel5.setBackground(color);
		}
		
			
	
	}
	
}
