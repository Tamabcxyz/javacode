package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtom {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtom window = new RadioButtom();
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
	public RadioButtom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton rdVui = new JRadioButton("Vui");
		buttonGroup.add(rdVui);
		rdVui.setSelected(true);
		
		JRadioButton rdBuon = new JRadioButton("Buon");
		buttonGroup.add(rdBuon);
		
		JRadioButton rdPhanNo = new JRadioButton("Phan no");
		buttonGroup.add(rdPhanNo);
		
		JButton btSave = new JButton("Save");
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdVui.isSelected()) {
					JOptionPane.showMessageDialog(null,"Vui la lua chon cua ban");
				}
				else if(rdBuon.isSelected()) {
					JOptionPane.showMessageDialog(null,"Buon la lua chon cua ban");
				}
				else if(rdPhanNo.isSelected()) {
					JOptionPane.showMessageDialog(null,"Ban se phan no");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btSave)
						.addComponent(rdVui)
						.addComponent(rdPhanNo)
						.addComponent(rdBuon))
					.addContainerGap(312, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(62)
					.addComponent(rdVui)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdBuon)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdPhanNo, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(btSave)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
