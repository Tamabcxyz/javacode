package thuchanhjavaswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class buttondemo extends JFrame implements ActionListener{
	private JLabel lb;
	private JButton b1;
/*
	public buttondemo (){
		this.setSize(300,300);
		setVisible(true);
		setLocation(150,50);
		setResizable(false);
		lb= new JLabel("chao ban");
//		lb.setSize(50,50);
		add(lb);
		lb.setForeground(Color.red);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b=new JButton("hello");
		add(b,"North",1);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				changeText();
			}
		});
		
	}
	public void changeText() {
		lb.setText("chao ban tre");
	}
*/
	public buttondemo(){
		setSize(200,200);// tao khung
		setVisible(true);// hien thi khung
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// tranh an ram cua may tinh
		lb=new JLabel();
		lb.setText("123456789");
		add(lb);
		JButton b=new JButton("sau");
		add(b,"North",1);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				changeText();
			}
		});// day la 1 abstract 
		
		b1=new JButton("truoc");
		add(b1,"South",1);
		b1.addActionListener(this);// cai nay lam sau quay lai cai truoc
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton bt=(JButton)e.getSource();
		if(bt==b1) {
			lb.setText("123456789");
		}
	}
	public void changeText() {
		lb.setText("abcdefgh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buttondemo d=new buttondemo();
		d.setVisible(true);
	}
	
	

}
