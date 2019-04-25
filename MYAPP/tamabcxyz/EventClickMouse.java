package tamabcxyz.code;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventClickMouse {

	private JFrame frame;
	private JTextField textField;
	private String str="",s="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventClickMouse window = new EventClickMouse();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EventClickMouse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				textField.setForeground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea txtrClickOnMouse = new JTextArea();
		txtrClickOnMouse.setWrapStyleWord(true);
		txtrClickOnMouse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				/*if(me.getModifiers()==InputEvent.BUTTON1_MASK) {
					txtrClickOnMouse.append("chao ban minh la Tam hoc cntt k43, minh dang click chuot trai");
					txtrClickOnMouse.setForeground(Color.red);
				}
				if(me.getModifiers()==InputEvent.BUTTON2_MASK) {
					txtrClickOnMouse.append("chao ban minh la Tam hoc cntt k43, minh dang click chuot giua");
				}
				if(me.getModifiers()==InputEvent.BUTTON3_MASK) {
					txtrClickOnMouse.append("chao ban minh la Tam hoc cntt k43, minh dang click chuot phai");
					txtrClickOnMouse.setForeground(Color.black);
				}*/
			}
		});
		txtrClickOnMouse.setLineWrap(true);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				txtrClickOnMouse.setText(s+=str+"\n");
				
				
			}
		});
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyCode()==KeyEvent.VK_1) {
					txtrClickOnMouse.append("tam dep trai vo dich vu tru");
				}
				while(ke.getKeyCode()==KeyEvent.VK_ENTER) {
					str=textField.getText();
					textField.setText("");
					break;
				}
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
					textField.setForeground(Color.red);
				
			}
		});
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(txtrClickOnMouse, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(111, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(178, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(170))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtrClickOnMouse, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
