package thuchanhjavaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HopThoai extends JFrame{
	
	public HopThoai() {
		setSize(300,300);
		setVisible(true);
		setResizable(false);
		setLocation(400,150);
		JLabel lb=new JLabel("click ok");
		lb.setSize(10,20);
		add(lb);
		JButton b=new JButton("OK");
		add(b,"North",1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"this is Dialog","title",JOptionPane.CANCEL_OPTION);
				
			}
			
		});
	}
	public static void main(String[] args) {
		HopThoai h=new HopThoai();

	}

}
