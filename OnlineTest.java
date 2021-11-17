/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();
			if(current==19)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();
			if(current==19)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}

		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"result="+count*5+"%");
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Qno1: the symbol '0 was introduced by:");
			jb[0].setText("indian");jb[1].setText("egyptian");jb[2].setText("Arabs");jb[3].setText("Britians");
		}
		if(current==1)
		{
			l.setText("Qno2: A set is a collection of ________objects:");
			jb[0].setText("Abstract");jb[1].setText("concrete");jb[2].setText("not defined ");jb[3].setText("well defined");
		}
		if(current==2)
		{
			l.setText("Qno3: Elements of the set must be:");
			jb[0].setText("same");jb[1].setText("distinct");jb[2].setText("abstract");jb[3].setText("concrete");
		}
		if(current==3)
		{
			l.setText("Qno4: sets are denoted by:");
			jb[0].setText("capital letters");jb[1].setText("Small letters");jb[2].setText("roman letters");jb[3].setText("Greek letters");
		}
		if(current==4)
		{
			l.setText("Qno5: '1' is not a :" );
			jb[0].setText("real number");jb[1].setText("natural");jb[2].setText("prime");jb[3].setText("whole");
		}
		if(current==5)
		{
			l.setText("Qno6: which one of the following is not true?");
			jb[0].setText("2 is the only even prime");jb[1].setText("set of primes after the first are always odd");jb[2].setText("primes do not divide each other");jb[3].setText("primes are not the factors of composite");
		}
		if(current==6)
		{
			l.setText("Qno7: the number '0' is:");
			jb[0].setText("rational number");jb[1].setText("irrational number");jb[2].setText("natural number");jb[3].setText("none");
		}
		if(current==7)
		{
			l.setText("Qno8: 0.45 is a:");
			jb[0].setText("rational number");jb[1].setText("irrational number");jb[2].setText("integer");jb[3].setText("none");
		}
		if(current==8)
		{
			l.setText("Qno9: Decimal part of irrational number is:");
			jb[0].setText("terminating");jb[1].setText("repeating");jb[2].setText("neither a or b");jb[3].setText("both a and b");
		}
		if(current==9)
		{
			l.setText("Qno10: every prime number is also:");
			jb[0].setText("rational number");jb[1].setText("irrational number");jb[2].setText("even");jb[3].setText("Odd");
		}
		if(current==10)
				{
					l.setText("Qno11: The identity element under subtraction '-' is:");
					jb[0].setText("0");jb[1].setText("1");jb[2].setText("-1");jb[3].setText("none");
		}
		if(current==11)
				{
					l.setText("Que12: addictive inverse of 0 is:");
					jb[0].setText("0");jb[1].setText("1");jb[2].setText("-1");jb[3].setText("none");
		}
		if(current==12)
				{
					l.setText("Que13: If a+b=0 then a and b are:");
					jb[0].setText("addicitve inverse of each other");jb[1].setText("multiplicative inverse of each other");jb[2].setText("both of these");jb[3].setText("none of these");
		}
		if(current==13)
				{
					l.setText("Que14: An equation remains unchanged if any real number is added on both sides.This property is called:");
					jb[0].setText("addictive");jb[1].setText("addictive inverse");jb[2].setText("commutative");jb[3].setText("associative");
		}
		if(current==14)
				{
					l.setText("Que15: An equation remains unchanged if any real number is added on both sides.This property is called:");
					jb[0].setText("multiplicative");jb[1].setText("multiplicative inverse");jb[2].setText("commutative");jb[3].setText("associative");
		}
		if(current==15)
				{
					l.setText("Que16: If z > 0 and x > y then:");
					jb[0].setText("xz > yz");jb[1].setText("x < z < y");jb[2].setText("xz < yz");jb[3].setText("xz = yz");
		}
		if(current==16)
				{
					l.setText("Que17: If a < 0 and b < 0 then:");
					jb[0].setText("a+b<0");jb[1].setText("a+b>0");jb[2].setText("a+b=0");jb[3].setText("none");
		}
		if(current==17)
				{
					l.setText("Que18: If a < 0 and b < 0 then:");
					jb[0].setText("ab<0");jb[1].setText("ab>0");jb[2].setText("ab=0");jb[3].setText("none");
		}
		if(current==18)
				{
					l.setText("Que19: If the area of the triangle is 26cm and its base is 6cm then its altitude is:");
					jb[0].setText("8cm");jb[1].setText("6cm");jb[2].setText("4cm");jb[3].setText("2cm");
		}
		if(current==19)
				{
					l.setText("Que20: If the width of the rectangle is 9cm and its diagonal is 15cm then its length is:");
					jb[0].setText("11cm");jb[1].setText("12cm");jb[2].setText("14cm");jb[3].setText("16cm");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[3].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[1].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[3].isSelected());
		if(current==6)
			return(jb[3].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[0].isSelected());
		if(current==10)
			return(jb[3].isSelected());
		if(current==11)
			return(jb[0].isSelected());
		if(current==12)
			return(jb[0].isSelected());
		if(current==13)
			return(jb[0].isSelected());
		if(current==14)
			return(jb[0].isSelected());
		if(current==15)
			return(jb[0].isSelected());
		if(current==16)
			return(jb[0].isSelected());
		if(current==17)
			return(jb[1].isSelected());
		if(current==18)
			return(jb[0].isSelected());
		if(current==19)
			return(jb[1].isSelected());
			return false;
	}
	public static void main(String s[])
	{
		new OnlineTest("Online Test Of Java");
	}


}
