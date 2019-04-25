package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AppCongTruNhanChia {

	private JFrame frame;
	private JTextField tfNumberOne;
	private JTextField tfNumberTwo;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCongTruNhanChia window = new AppCongTruNhanChia();
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
	public AppCongTruNhanChia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("NumberOne");
		
		JLabel lblNewLabel_1 = new JLabel("NumberTwo");
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		
		tfNumberOne = new JTextField();
		tfNumberOne.setColumns(10);
		
		tfNumberTwo = new JTextField();
		tfNumberTwo.setColumns(10);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		
		JButton bCong = new JButton("Cong");
		bCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number1= tfNumberOne.getText();
				String number2= tfNumberTwo.getText();
				int num1=0;
				int num2=0;
				try {
					
					num1= Integer.parseInt(number1);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"error format");
					tfNumberOne.requestFocus();
					return;
				}
				try {
					
					num2= Integer.parseInt(number2);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"error format");
					tfNumberTwo.requestFocus();
					return;
				}
				int sum=num1+num2;
				
				tfResult.setText(sum+"");
			}
		});
		
		JButton bTru = new JButton("Tru");
		bTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=tfNumberOne.getText();
				String b=tfNumberTwo.getText();
				int n1=0;
				int n2=0;
				try {
					n1=Integer.parseInt(a);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"error format");
					tfNumberOne.requestFocus();
					return;
				}
				try {
					n2=Integer.parseInt(b);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "error format");
					tfNumberTwo.requestFocus();
					return;
				}
				int div=n1-n2;
				tfResult.setText(div+"");
			}
		});
		
		JButton bNhan = new JButton("Nhan");
		bNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c=tfNumberOne.getText();
				String d=tfNumberTwo.getText();
				int n3,n4=0;
				try {
					n3=Integer.parseInt(c);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "error format");
					tfNumberOne.requestFocus();
					return;
				}
				try {
					n4=Integer.parseInt(d);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "error format");
					tfNumberTwo.requestFocus();
					return;
				}
				int mul=n3*n4;
				tfResult.setText(mul+"");
			}
		});
		
		JButton bChia = new JButton("Chia");
		bChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String e=tfNumberOne.getText();
				String f=tfNumberTwo.getText();
				int n3,n4=0;
				try {
					n3=Integer.parseInt(e);
				}catch(NumberFormatException k) {
					JOptionPane.showMessageDialog(null, "error format");
					tfNumberOne.requestFocus();
					return;
				}
				try {
					n4=Integer.parseInt(f);
				}catch(NumberFormatException k) {
					JOptionPane.showMessageDialog(null, "error format");
					tfNumberTwo.requestFocus();
					return;
				}
				int div=n3/n4;
				tfResult.setText(div+"");
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel)
										.addGap(67))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addGap(67)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGap(67)))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfResult, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(tfNumberOne, Alignment.LEADING)
									.addComponent(tfNumberTwo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(bCong)
							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
							.addComponent(bTru)
							.addGap(41)
							.addComponent(bNhan)
							.addGap(37)))
					.addComponent(bChia)
					.addGap(53))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(tfNumberOne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfNumberTwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tfResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bChia)
						.addComponent(bNhan)
						.addComponent(bTru)
						.addComponent(bCong))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
