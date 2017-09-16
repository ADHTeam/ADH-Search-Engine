package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.Alphabetizer;
import main.CircularShift;
import main.Line;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private EnhancedJList inter;
	private JList<String> sorted;
	private JTextField input;
	private JButton btnAdd;
	
	public MainFrame(int defWidth, int defHeight) {
		super("ADH-Team KWIC System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panelNorth = new JPanel();
		input = new JTextField(40);
		btnAdd = new JButton(">>");
		btnAdd.addActionListener(new AddNewItem());
		panelNorth.add(new JLabel("Enter a line of text:"));
		panelNorth.add(input);
		panelNorth.add(btnAdd);
		
		JPanel panelCenter = new JPanel(new BorderLayout());
		JScrollPane jspCenterListScroll = new JScrollPane();
		inter = new EnhancedJList();
		jspCenterListScroll.setViewportView(inter);
		inter.setFixedCellWidth(600);
		inter.setFixedCellHeight(30);
		panelCenter.add(jspCenterListScroll);
		
		JPanel panelSouth = new JPanel(new BorderLayout());
		JScrollPane jspSouthListScroll = new JScrollPane();
		sorted = new JList<>(new DefaultListModel<>());
		jspSouthListScroll.setViewportView(sorted);
		sorted.setFixedCellWidth(600);
		sorted.setFixedCellHeight(30);
		
		panelSouth.add(new JLabel("Sorted Results:"), BorderLayout.NORTH);
		panelSouth.add(jspSouthListScroll, BorderLayout.SOUTH);
		
		add(panelNorth, BorderLayout.NORTH);
		add(panelCenter, BorderLayout.CENTER);
		add(panelSouth, BorderLayout.SOUTH);
		
		setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - defWidth / 2, dim.height / 2 - defHeight / 2);
		pack();
	}
	
	private class AddNewItem implements ActionListener {
		/*master control*/
		@Override
		public void actionPerformed(ActionEvent e) {
			String inputLine = MainFrame.this.input.getText();
			CircularShift cs = new CircularShift(inputLine);
			Line[] shifts = cs.generateCircularShifts();
			for(int i = 0; i < shifts.length; i++) {
				inter.addItem(shifts[i], i == 0); 
			}
			Alphabetizer alpha = new Alphabetizer(sorted);
			alpha.addItems(shifts);
		}
	}

}