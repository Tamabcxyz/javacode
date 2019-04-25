package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBox {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox window = new CheckBox();
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
	public CheckBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox cbEgg = new JCheckBox("Egg");
		
		JCheckBox cbMilk = new JCheckBox("Milk");
		
		JCheckBox cbMeat = new JCheckBox("Meat");
		
		JButton btSave = new JButton("Save");
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbMeat.isSelected()) {
					System.out.println("ban chon thit");
				}
				if(cbEgg.isSelected()) {
					System.out.println("ban chon trung");
				}
				if(cbMilk.isSelected()) {
					System.out.println("ban chon sua");
				}
			}
		});
		
		JCheckBox cbSelectAll = new JCheckBox("Select to All");
		cbSelectAll.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				boolean chon=cbSelectAll.isSelected();
				if(chon) {
					cbMeat.setSelected(true);
					cbEgg.setSelected(true);
					cbMilk.setSelected(true);
				}
				else {
					cbMeat.setSelected(false);
					cbEgg.setSelected(false);
					cbMilk.setSelected(false);
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btSave)
								.addComponent(cbMilk)
								.addComponent(cbMeat)
								.addComponent(cbEgg)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(cbSelectAll)))
					.addContainerGap(295, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addComponent(cbMeat)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbEgg)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbMilk)
					.addGap(8)
					.addComponent(cbSelectAll)
					.addGap(18)
					.addComponent(btSave)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
