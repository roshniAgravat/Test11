import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;

class BorderLayout1
{
	static JFrame jf = new JFrame("This is a Border Layout");
	public static  JComponent leftside()
	{
		JPanel panel1 = new JPanel();
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
		
		return panel1;
	}
	
	public static void main(String [] args)
	{
		 
		Toolkit tlkt = jf.getToolkit(); 
		Dimension dim = tlkt.getScreenSize();
		jf.setBounds(0,0,dim.width,dim.height);
		BorderLayout br=new BorderLayout();
		
		Container content = jf.getContentPane();
		content.setLayout(br);
		 
		content.add(leftside(),BorderLayout.WEST);
		
		JCheckBox jc1=new JCheckBox("EAST");
		content.add(jc1,BorderLayout.EAST);
		
		jc1=new JCheckBox("South");
		content.add(jc1,BorderLayout.SOUTH);
		
		jc1=new JCheckBox("center");
		content.add(jc1,BorderLayout.CENTER);
		
		jc1=new JCheckBox("North");
		content.add(jc1,BorderLayout.NORTH);
			
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800,400);
		jf.setVisible(true);	
	
	}
	
}
