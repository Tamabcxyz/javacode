package tamabcxyz.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;



public class NodePadDemo {

	private JFrame frame;
	private static final int FILE_SAVE=1;
	private static final int FILE_OPEN=2;
	private JTextArea tArea = new JTextArea();
	private static String s="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NodePadDemo window = new NodePadDemo();
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
	public NodePadDemo() {
		initialize();
	}
	public void operationFile(String title, int type) {
		int choose=-1;
		JFileChooser chooser =new JFileChooser();
		chooser.setDialogTitle(title);
		switch(type) {
		case FILE_OPEN:
			choose=chooser.showOpenDialog(null);
			break;
		case FILE_SAVE:
			choose=chooser.showSaveDialog(null);
			break;
		}
		if(choose==JFileChooser.APPROVE_OPTION) {
			File file=chooser.getSelectedFile();
			switch(type) {
			case FILE_OPEN:
				readFile(file);
				break;
			case FILE_SAVE:
				writeFile(file);
				break;
			}
		}
		
		
	}
	

	private void readFile(File file) {
		try {
			tArea.setText("");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			//String line;
			while((s=br.readLine())!=null) {
				tArea.append(s+"\n");
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void writeFile(File file) {
		try {
			file.createNewFile();
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			String data= tArea.getText();
			bw.write(data);
			bw.close();
			fw.close();
			readFile(file);
		}catch(Exception e) {
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(500, 500);
		frame.setLocation(400, 100);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea tArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tArea, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tArea, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mFile = new JMenu("File");
		menuBar.add(mFile);
		
		JMenuItem miNew = new JMenuItem("New");
		miNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tArea.setText("");
				tArea.requestFocus();
			}
		});
		mFile.add(miNew);
		
		
		
		JMenuItem miOpen = new JMenuItem("Open");
		miOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operationFile("Open a file",FILE_OPEN);
			}
		});
		mFile.add(miOpen);
		
		JMenuItem miSave = new JMenuItem("Save");
		miSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operationFile("Save a file",FILE_SAVE);
			}
		});
		mFile.add(miSave);
		
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mFile.add(miExit);
		
		JMenu mEdit = new JMenu("Edit");
		menuBar.add(mEdit);
	}
}
