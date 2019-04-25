package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Algorithm{

	private JFrame frame;
	private JTextField tfThreshold;
	private final String INSERTION=" insertion sort";
	private final String MERGE="merge sort";
	private final String QUICK="quick sort";
	private final String QUICK_INSERTION="quick insertion sort";
	private String algorithm;
	private int size;
	private int orderAlgorithm;
	private int array[];
	
	/**
	 * Launch the application.
	 */
	private void createSet(int size) {
		array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*array.length*array.length);
		}
	}
	private void showSetSize() {
		JLabel lbsetSize = new JLabel("");
		lbsetSize.setText("the size of the set is "+size);
		
	}
	private void showResult(JLabel label, String algorithm, String duration) {
		label.setText("the time of the "+algorithm+" algorithm is "+duration);
	}
	private void resetResult(JLabel label, String algorithm) {
		showResult(label,algorithm,"0 ns");
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algorithm window = new Algorithm();
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
	public Algorithm() {
		initialize();
		algorithm=INSERTION;
		size=10;
		orderAlgorithm=0;
		createSet(size);
		showSetSize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Set Size");
		
		JLabel lblAlgorithm = new JLabel("Algorithm");
		
		JLabel lblThreshold = new JLabel("Threshold");
		
		JLabel lbsetSize = new JLabel("the size of the set is 10");
		
		JLabel lbInsertionSort = new JLabel("the time of the insertion sort algorithm is 0 ms");
		
		JLabel lbMergeSort = new JLabel("the time of the merge sort algorithm is 0 ms");
		
		JLabel lbQuickSort = new JLabel("the time of the quick sort algorithm is 0 ms");
		
		JLabel lbQuickInsertionSort = new JLabel("the time of the quick insertion sort algorithm is 0 ms");
		
		JComboBox cbSetSize = new JComboBox();
		cbSetSize.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				size=Integer.parseInt((String)cbSetSize.getSelectedItem());
				createSet(size);
				showSetSize();
				resetResult(lbInsertionSort, INSERTION);
				resetResult(lbMergeSort, MERGE);
				resetResult(lbQuickSort, QUICK);
				resetResult(lbQuickInsertionSort, QUICK_INSERTION);
			}
		});
		cbSetSize.setModel(new DefaultComboBoxModel(new String[] {"10", "50", "100", "500", "1000", "5000", "10000", "50000", "100000", "500000", "1000000", "5000000", "10000000", "50000000"}));
		
		JComboBox cbAlgorithm = new JComboBox();
		cbAlgorithm.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				algorithm=(String)cbAlgorithm.getSelectedItem();
				orderAlgorithm=cbAlgorithm.getSelectedIndex();
				if(cbAlgorithm.getSelectedIndex()==3) {
					lblThreshold.setEnabled(true);
					tfThreshold.setEnabled(true);
				}else {
					lblThreshold.setEnabled(false);
					tfThreshold.setEnabled(false);
				}
			}
		});
		cbAlgorithm.setModel(new DefaultComboBoxModel(new String[] {"Insertion Sort", "Merge Sort", "Quick Sort", "Quick Insertion Sort"}));
		
		tfThreshold = new JTextField();
		tfThreshold.setEnabled(false);
		tfThreshold.setColumns(10);
		
		JButton btExecute = new JButton("Execute");
		btExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					SortingAlgorithm sortalgorithm=new SortingAlgorithm(array);
					
					switch(orderAlgorithm){
						case 0: showResult(lbInsertionSort,INSERTION,sortalgorithm.insertionSort());break;
						case 1: showResult(lbMergeSort,MERGE,sortalgorithm.mergeSort());break;
						case 2: showResult(lbQuickSort,QUICK,sortalgorithm.quickSort());break;
						case 3: 
							try {
								int threshold=Integer.parseInt(tfThreshold.getText());
								sortalgorithm.setThreshold(threshold);
								showResult(lbQuickInsertionSort,QUICK_INSERTION,sortalgorithm.quickInsertionSort());
							}catch(Exception e) {
								JOptionPane.showMessageDialog(null,"error format");
							}
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lbQuickInsertionSort)
						.addComponent(lbQuickSort)
						.addComponent(lbMergeSort)
						.addComponent(lbInsertionSort)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lbsetSize)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btExecute))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblAlgorithm)
									.addComponent(lblThreshold)
									.addComponent(lblNewLabel))
								.addGap(46)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(cbAlgorithm, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cbSetSize, 0, 216, Short.MAX_VALUE)
									.addComponent(tfThreshold)))))
					.addGap(82))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbSetSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAlgorithm)
						.addComponent(cbAlgorithm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblThreshold)
						.addComponent(tfThreshold, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
							.addComponent(lbsetSize)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbInsertionSort)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbMergeSort)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbQuickSort)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbQuickInsertionSort)
							.addGap(12))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(btExecute)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
