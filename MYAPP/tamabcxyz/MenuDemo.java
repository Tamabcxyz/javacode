package tamabcxyz.code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuDemo extends JFrame implements ActionListener{
	private JMenuItem miNew, miOpen,miSave, miExit,miUndo,miRedu,mitrai,miphai;
	public static void main(String args[]) {
		MenuDemo md=new MenuDemo();
		
		
		
		
		
		
	}
	public MenuDemo() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JMenuBar menubar= new JMenuBar();
		frame.setJMenuBar(menubar);
		
		JMenu file= new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		menubar.add(file);
		miNew=new JMenuItem("New");
		miNew.setMnemonic(KeyEvent.VK_N);
		miNew.addActionListener(this);
		file.add(miNew);
		
		miOpen=new JMenuItem("Open");
		miOpen.setMnemonic(KeyEvent.VK_O);
		miOpen.addActionListener(this);
		file.add(miOpen);
		
		miSave=new JMenuItem("Save");
		miSave.setMnemonic(KeyEvent.VK_S);
		miSave.addActionListener(this);
		file.add(miSave);
		
		file.addSeparator();// rach ngang
		miExit=new JMenuItem("Exit");
		miExit.setMnemonic(KeyEvent.VK_X);
		miExit.addActionListener(this);
		file.add(miExit);
		
		JMenu edit= new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		menubar.add(edit);
		
		miUndo=new JMenuItem("Undo");
		miUndo.setMnemonic(KeyEvent.VK_U);
		miUndo.addActionListener(this);
		edit.add(miUndo);
		miRedu=new JMenuItem("Redo");
		miRedu.setMnemonic(KeyEvent.VK_R);
		miRedu.addActionListener(this);
		edit.add(miRedu);
		edit.addSeparator();
		JMenu mDelete=new JMenu("Delete");
		mDelete.setMnemonic(KeyEvent.VK_D);
		edit.add(mDelete);
		mitrai=new JMenuItem("trai");
		mitrai.setMnemonic(KeyEvent.VK_T);
		mitrai.addActionListener(this);
		mDelete.add(mitrai);
		miphai=new JMenuItem("phai");
		miphai.setMnemonic(KeyEvent.VK_P);
		miphai.addActionListener(this);
		mDelete.add(miphai);
		
		
		frame.setVisible(true);
		frame.setSize(300,300);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem mi=(JMenuItem)e.getSource();
		if(mi==miNew) {
			JOptionPane.showMessageDialog(null,"you on click New");
		}
		if(mi==miOpen) {
			JOptionPane.showMessageDialog(null,"you on click Open");
		}
		if(mi==miSave) {
			JOptionPane.showMessageDialog(null,"you on click Save");
		}
		if(mi==miExit) {
			JOptionPane.showMessageDialog(null,"you on click Exit");
			System.exit(0);
		}
		if(mi==miUndo) {
			JOptionPane.showMessageDialog(null,"you on click Undo");
		}
		if(mi==miRedu) {
			JOptionPane.showMessageDialog(null,"you on click Redu");
		}
		if(mi==mitrai) {
			JOptionPane.showMessageDialog(null,"you on click Delete trai");
		}
		if(mi==miphai) {
			JOptionPane.showMessageDialog(null,"you on click Delete phai");
		}
		
	}
}
