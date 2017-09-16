package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import main.Line;

public class EnhancedJList extends JList<String> {
	private static final long serialVersionUID = 1L;
	private DefaultListModel<String> listModel;
	private List<Line> contents;

	public EnhancedJList() {
		super(new DefaultListModel<>());
		listModel = (DefaultListModel<String>) getModel();
		contents = new ArrayList<>();
	}
	
	public Line addItem(Line item, boolean underLined) {
		contents.add(item);
		String itemText = item.toString();
		if(underLined) {
			itemText = "<html><font color=red><u>" + itemText + "</u></font></html>";
		}
		listModel.addElement(itemText);
		return item;
	}
	
	public Line getItem(int index) {
		return contents.get(index);
	}
}
