package lab;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class product extends JFrame implements ActionListener,ItemListener 
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JComboBox<String> os;
	public product()
	{
		setLayout(new GridLayout(5,2,10,10));
		setFont(new Font("Times New Roman",Font.BOLD,40));
		l1=new JLabel("PNo:",Label.RIGHT);
		l2=new JLabel("PName:",Label.RIGHT);
		l3=new JLabel("Quantity:",Label.RIGHT);
		l4=new JLabel("cost:",Label.RIGHT); 
		l5=new JLabel("Total:",Label.RIGHT);
		t1=new JTextField(12);
		t2=new JTextField(12);
		t3=new JTextField(12);
		t4=new JTextField(12);
		os=new JComboBox<String>();
		os.addItem("Perk");
		os.addItem("munch");
		os.addItem("dairy milk");
		os.addItem("5 star");
		os.addItem("cadboury");
		add(l1); add(t1); add(l2); add(os);add(l3);
		add(t2); add(l4); add(t3);add(l5); add(t4);
		os.addItemListener(this);
		t2.addActionListener(this);
		setTitle("Product Page to find total Amount");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(os.getSelectedIndex()==0)
		{
			t3.setText("10");
		}
		else if(os.getSelectedIndex()==1)
		{
			t3.setText("12");
		}
		else if(os.getSelectedIndex()==2)
		{
			t3.setText("15");
		}
		else if(os.getSelectedIndex()==3)
		{
			t3.setText("20");
		}
		else if(os.getSelectedIndex()==4) 
		{ 
			t3.setText("30");
		}
		else if(os.getSelectedIndex()==5) 
		{ 
			t3.setText("40");
		}
		else
		{ 
			t3.setText("7");
		}

	}
	
	public void actionPerformed(ActionEvent e)
	{
		int qs,asd,up;
		qs=Integer.parseInt(t2.getText());
		up=Integer.parseInt(t3.getText());
		asd=qs*up;
		t4.setText(String.valueOf(asd));
		repaint();	
	}
	

	public static void main(String[] args) {
		new product();

	}

}
