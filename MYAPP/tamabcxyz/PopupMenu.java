package tamabcxyz.code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class PopupMenu {

	public static void main(String[] args) {
		
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JTextArea area =new JTextArea();
		JPopupMenu popupmenu=new JPopupMenu();
		JMenuItem mCopy=new JMenuItem("Copy");
		JMenuItem mPast=new JMenuItem("Past");
		JMenuItem mRefesh=new JMenuItem("Refesh");
		
		popupmenu.add(mCopy);
		popupmenu.add(mPast);
		popupmenu.add(mRefesh);
		
		
		area.setComponentPopupMenu(popupmenu);
		frame.add(area);
		
		frame.setVisible(true);
		frame.setSize(300, 300);
		
		
		
	}



}
