package main;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Alphabetizer {
	private DefaultListModel<String> sortedItemTexts;
	
	public Alphabetizer(JList<String> output) {
		sortedItemTexts = (DefaultListModel<String>) output.getModel();
	}
	
	private void insert(Line item) {
		String itemText = item.toString();
		for(int i = 0; i < sortedItemTexts.size(); i ++) {
			if(itemText.compareTo(sortedItemTexts.get(i)) <= 0) {
				sortedItemTexts.add(i, itemText);
				return;
			}
		}
		sortedItemTexts.addElement(itemText);
	}
	
	public void addItems(Line[] items) {
		for(Line item : items) {
			insert(item);
		}
	}
	
	public String[] getLines() {
		String[] lines = new String[sortedItemTexts.size()];
		for(int i = 0; i < lines.length; i++) {
			lines[i] = sortedItemTexts.get(i);
		}
		return lines;
	}
}
