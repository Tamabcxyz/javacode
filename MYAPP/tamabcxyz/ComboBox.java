package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
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
	public ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private DefaultComboBoxModel model;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox cbName = new JComboBox();
		cbName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(ie.getStateChange()==ItemEvent.SELECTED) {
					JOptionPane.showMessageDialog(null, "annouce");
				}
			}
		});
//		cbName.setModel(new DefaultComboBoxModel(new String[] {"value 1", "value 2", "value 3"}));
		model=new DefaultComboBoxModel();
		model.addElement("tam dep trai");
		model.addElement("Tam ca tinh");
		model.addElement("tam best tan gai");
		cbName.setModel(model);
		JButton bChange = new JButton("Change");
		bChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cbName.removeAllItems();
				model.addElement("tam professional");
				model.addElement("IT chuan soai ca vai ca day");
				cbName.setModel(model);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(131, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(cbName, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
							.addGap(123))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(bChange)
							.addGap(175))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(cbName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
					.addComponent(bChange)
					.addGap(78))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
