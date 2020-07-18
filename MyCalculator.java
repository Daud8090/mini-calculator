package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCalculator {

	public static void main(String[] args) {
		calculation obj=new calculation();
		obj.setLocation(500, 200);
		
	}

}
class calculation extends JFrame implements ActionListener
{
	JTextField f1,f2;
	JButton bAdd,bSub,bDiv,bMul,bMod,bPow;
	JLabel l;
	
	calculation()
	{
		f1=new JTextField(24);
		f2=new JTextField(24);
		
		bAdd=new JButton("+");
		bSub=new JButton("-");
		bMul=new JButton("*");
		bDiv=new JButton("/");
		bMod=new JButton("%");
		bPow=new JButton("^");
		
		l=new JLabel("result");
		
		add(f1);
		add(f2);
		add(bAdd);
		add(bSub);
		add(bMul);
		add(bDiv);
		add(bMod);
		add(bPow);
		add(l);
		
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bMod.addActionListener(this);
		bPow.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(285,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int num1 =Integer.parseInt(f1.getText());
		int num2 =Integer.parseInt(f2.getText());
		double value=0;
		if(e.getSource()==bAdd)
			value=num1+num2;
		else if(e.getSource()==bSub)
			value=num1-num2;
		else if(e.getSource()==bMul)
			value=num1*num2;
		else if(e.getSource()==bDiv)
			value=(double)num1/num2;
		else if(e.getSource()==bMod)
			value=num1%num2;
		else if(e.getSource()==bPow)
			value=Math.pow(num1, num2);
		else
			value=-99999;
		l.setText(value+" ");
	}
}







