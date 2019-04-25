package thuchanhjavaswing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class HelloWorld extends JFrame {

	public HelloWorld() {
		setSize(200,200);// tao cai bang nho co chieu rong va cao la bao nhieu
		//setVisible(true); // co trong ham main thi khoi khong thi bat buot co moi chay
		JLabel lb=new JLabel("hello I'm studying java swing");
		add(lb);
		setResizable(false);// neu co cai nay thi cai bang khong the co dan duoc nua
		lb.setText("chao ban minh la tam");
		lb.setToolTipText("day la gioi thieu ^^");
		lb.setForeground(Color.RED);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h=new HelloWorld();
		h.setVisible(true);// neu = true thi hien thi cai bang nho, false thi ko hien thi
		h.setLocation(500, 200);// vi tri xuat hien cua cai bang nho
	}

}
