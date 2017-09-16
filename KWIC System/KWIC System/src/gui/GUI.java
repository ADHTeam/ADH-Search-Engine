package gui;

public class GUI {
	private static GUI instance = null;
	
	private static final int MAIN_FRAME_WIDTH = 500;
	private static final int MAIN_FRAME_HEIGHT = 950;
	
	public GUI() {
		MainFrame mainFrame = new MainFrame(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		mainFrame.setVisible(true);
	}

	public static GUI v() {
		if(instance == null) {
			instance = new GUI();
		}
		return instance;
	}
}
