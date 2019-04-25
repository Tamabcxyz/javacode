package thuchanhjavaswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class buttondemo extends JFrame {
	private JLabel lb;
	public buttondemo (){
		setSize(300,300);
		setVisible(true);
		setLocation(150,50);
		setResizable(false);
		JLabel lb= new JLabel("chao ban");
		lb.setSize(50,50);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buttondemo d=new buttondemo();
		d.setVisible(true);
	}

}
