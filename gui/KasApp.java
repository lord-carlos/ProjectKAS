package gui;

import service.UpDownService;

public class KasApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UpDownService.startUp();
		MainFrame frame = new MainFrame();
		frame.setVisible(true);

	}

}
