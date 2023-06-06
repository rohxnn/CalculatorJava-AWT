//ROHAN CALCULATOR PROJECT#1

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculate implements ActionListener {
	JFrame jf;
	JLabel Displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton pointbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton plusbutton;
	JButton minusbutton;
	JButton intobutton;
	JButton divbutton;
	JButton clearbutton;
	JButton delbutton;
	boolean isOperatortap=false;
	Double oldvalue=(double) 0,newvalue=(double) 0,result=(double) 0;
	char operator;
	String s;
	public Calculate()
	{
		jf=new JFrame("ROHAN CALCULATOR");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setLocation(500, 150);
		Displaylabel=new JLabel();
		Displaylabel.setBounds(30, 20, 400, 30);
		Displaylabel.setBackground(Color.WHITE);
		Displaylabel.setOpaque(true);
		Displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		//Displaylabel.setForeground(Color.white);
		jf.add(Displaylabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 70, 80, 80);
		sevenbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		sevenbutton.addActionListener(this);
		//sevenbutton.setBackground(Color.green);
		//sevenbutton.setOpaque(true);
		//sevenbutton.setForeground(Color.white);
		jf.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(130, 70, 80, 80);
		eightbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		eightbutton.addActionListener(this);
		//eightbutton.setBackground(Color.red);
		//eightbutton.setOpaque(true);
		//eightbutton.setForeground(Color.white);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230, 70, 80, 80);
		ninebutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 170, 80, 80);
		fourbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		fourbutton.addActionListener(this);
		//fourbutton.setBackground(Color.white);
		//fourbutton.setOpaque(true);
		//fourbutton.setForeground(Color.white);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130, 170, 80, 80);
		fivebutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		fivebutton.addActionListener(this);
		//fivebutton.setBackground(Color.cyan);
		//fivebutton.setOpaque(true);
		//fivebutton.setForeground(Color.white);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230, 170, 80, 80);
		sixbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		sixbutton.addActionListener(this);
		//sixbutton.setBackground(Color.gray);
		//sixbutton.setOpaque(true);
		//sixbutton.setForeground(Color.white);
		jf.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(30, 270, 80, 80);
		onebutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		onebutton.addActionListener(this);
		//onebutton.setBackground(Color.blue);
		//onebutton.setOpaque(true);
		//onebutton.setForeground(Color.white);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130, 270, 80, 80);
		twobutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		twobutton.addActionListener(this);
		//twobutton.setBackground(Color.MAGENTA);
		//twobutton.setOpaque(true);
		//onebutton.setForeground(Color.white);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230, 270, 80, 80);
		threebutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		threebutton.addActionListener(this);
		//threebutton.setBackground(Color.YELLOW);
		//threebutton.setOpaque(true);
		//onebutton.setForeground(Color.white);
		jf.add(threebutton);
		
		pointbutton=new JButton(".");
		pointbutton.setBounds(30, 370, 80, 80);
		pointbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		pointbutton.addActionListener(this);
		//pointbutton.setBackground(Color.WHITE);
		//pointbutton.setOpaque(true);
		jf.add(pointbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 370, 80, 80);
		zerobutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		zerobutton.addActionListener(this);
		//zerobutton.setBackground(Color.orange);
		//zerobutton.setOpaque(true);
		jf.add(zerobutton);
		
		equalbutton=new JButton("=");
	    equalbutton.setBounds(230, 370, 80, 80);
		equalbutton.setBackground(Color.green);
		equalbutton.setOpaque(true);
		equalbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(330, 370, 80, 80);
		plusbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		plusbutton.addActionListener(this);
		//plusbutton.setBackground(Color.BLUE);
		//plusbutton.setOpaque(true);
		jf.add(plusbutton);
		
		minusbutton=new JButton("-");
		minusbutton.setBounds(330, 270, 80, 80);
		minusbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		minusbutton.addActionListener(this);
		//minusbutton.setBackground(Color.orange);
		//minusbutton.setOpaque(false);
		jf.add(minusbutton);
		
		intobutton=new JButton("X");
		intobutton.setBounds(330, 170, 80, 80);
		intobutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		intobutton.addActionListener(this);
		//intobutton.setBackground(Color.GREEN);
		//intobutton.setOpaque(true);
		jf.add(intobutton);
		
		divbutton=new JButton("/");
		divbutton.setBounds(330, 70, 80, 80);
		divbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		divbutton.addActionListener(this);
		jf.add(divbutton);
		
		clearbutton=new JButton("CLEAR");
		clearbutton.setBounds(80, 500, 300, 50);
		clearbutton.setFont(new Font("Arial" ,Font.PLAIN, 40));
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		delbutton=new JButton("D");
		delbutton.setBounds(400, 490, 60, 60);
		delbutton.setFont(new Font("Arial" ,Font.PLAIN, 30));
		delbutton.addActionListener(this);
		jf.add(delbutton);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenbutton)
		{
			if(isOperatortap)
			{
				Displaylabel.setText("7");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"7");
		}
		else if(e.getSource()==eightbutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("8");
				isOperatortap=false;
			}
			else
			Displaylabel.setText(Displaylabel.getText()+"8");}
		else if(e.getSource()==ninebutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("9");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"9");
		}
		else if(e.getSource()==fourbutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("4");
				isOperatortap=false;
			}
			else 	
		
			Displaylabel.setText(Displaylabel.getText()+"4");
		}
	
		else if(e.getSource()==fivebutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("5");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"5");
		}
		else if(e.getSource()==sixbutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("6");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"6");}
		else if(e.getSource()==onebutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("1");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"1");}
		else if(e.getSource()==twobutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("2");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"2");}
		else if(e.getSource()==threebutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("3");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"3");}
		else if(e.getSource()==pointbutton)
			Displaylabel.setText(Displaylabel.getText()+".");
		else if(e.getSource()==zerobutton) {
			if(isOperatortap)
			{
				Displaylabel.setText("0");
				isOperatortap=false;
			}
			else 	
			Displaylabel.setText(Displaylabel.getText()+"0");}
		else if(e.getSource()==plusbutton)
			{
			isOperatortap=true;
			oldvalue=Double.parseDouble(Displaylabel.getText());
			operator='+';
			Displaylabel.setText(" ");
		}
		else if(e.getSource()==minusbutton)
		{
			isOperatortap=true;
			oldvalue=Double.parseDouble(Displaylabel.getText());
			operator='-';
			Displaylabel.setText(" ");
		}
			

		else if(e.getSource()==intobutton)
		{
			isOperatortap=true;
			oldvalue=Double.parseDouble(Displaylabel.getText());
			operator='x';
			Displaylabel.setText(" ");
		}
			
			
		else if(e.getSource()==divbutton)
		{
			isOperatortap=true;
			oldvalue=Double.parseDouble(Displaylabel.getText());
			operator='/';
			Displaylabel.setText(" ");
		}
		else if(e.getSource()==delbutton)
		{
			s= Displaylabel.getText();
			Displaylabel.setText(" ");
			for(int i=0;i<s.length()-1;i++)
			{
				Displaylabel.setText(Displaylabel.getText()+s.charAt(i));
			}
		}
			
			if(e.getSource()==equalbutton)
			{
				newvalue=Double.parseDouble(Displaylabel.getText());
				switch(operator) {
				case '+':
					result=oldvalue+newvalue;
					break;
				case '-':
					result=oldvalue-newvalue;
					break;
				case 'x':
					result=oldvalue*newvalue;
					break;
				case '/':
					result=oldvalue/newvalue;
					break;
				}Displaylabel.setText(String.valueOf(result));
				//oldvalue=result;
			}
			else if(e.getSource()==clearbutton)
			Displaylabel.setText(" ");
			
				
					
			
			
		
	}
}
