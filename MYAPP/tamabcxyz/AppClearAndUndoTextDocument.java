package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AppClearAndUndoTextDocument {
	private String Describe="";
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppClearAndUndoTextDocument window = new AppClearAndUndoTextDocument();
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
	public AppClearAndUndoTextDocument() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea taDescribe = new JTextArea();
		taDescribe.setBackground(Color.GREEN);
		taDescribe.setWrapStyleWord(true);
		taDescribe.setLineWrap(true);
		
		JButton bUndo = new JButton("Undo");
		bUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taDescribe.setText(Describe);
			}
		});
		
		JButton bClear = new JButton("Clear");
		bClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!taDescribe.getText().equals("")) {
					Describe=taDescribe.getText();
				}
				taDescribe.setText("");
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(taDescribe, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(bUndo)
							.addGap(18)
							.addComponent(bClear)
							.addGap(22))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(taDescribe, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bUndo)
						.addComponent(bClear))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
