package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import service.ConferenceService;

import model.Conference;
import model.Hotel;
//import model.Environment;
import gui.MainFrame;

public class ConferenceFrame extends JFrame {
	// declare the component on the Frame
	private JLabel lblName;
	private JTextField txfConference, txfLocation, txfDate, txfMonth, txfYear, txfPrice, txfHotel, txfRoom,
	txfPTrips, txfTrip;
	private JTextArea txaCreateHotel;
	private JButton btnTilLinie, btnCreateConf, btnCreateHotel, btnCreateTrip, btnOk;
	private MainFrame frame;

	int count=0;

	private Controller controller = new Controller();
	
	Font font = new Font ("Arial", Font.ITALIC |Font.BOLD, 14);

	public ConferenceFrame(MainFrame frame) {
		// properties for the Frame (Window)
		this.setTitle("Opret konference");
		this.setSize(950, 875);
		this.setLocation(300, 10);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLayout(null);
		this.frame = frame;

		// create the components and set the properties for them 
		lblName = new JLabel("Navn paa konference:");
		lblName.setSize(800, 15);
		lblName.setLocation(20, 10);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("Sted");
		lblName.setSize(800, 15);
		lblName.setLocation(20, 70);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("Pris");
		lblName.setSize(800, 15);
		lblName.setLocation(20, 130);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("Dato");
		lblName.setSize(200, 15);
		lblName.setLocation(250, 130);
		this.add(lblName);
		lblName.setFont(font);

		Font font = new Font ("Arial", Font.BOLD, 10);

		lblName = new JLabel("dd");
		lblName.setSize(200, 15);
		lblName.setLocation(305, 155);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("mm");
		lblName.setSize(200, 15);
		lblName.setLocation(305, 180);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("yy");
		lblName.setSize(200, 15);
		lblName.setLocation(305, 205);
		this.add(lblName);
		lblName.setFont(font);

		Font font1 = new Font ("Arial", Font.ITALIC |Font.BOLD, 14);

		lblName = new JLabel("Navn paa Hotel:");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 375);
		this.add(lblName);
		lblName.setFont(font1);

		lblName = new JLabel("Navn på Udflugt:");
		lblName.setSize(200, 15);
		lblName.setLocation(500, 375);
		this.add(lblName);
		lblName.setFont(font1);

		lblName = new JLabel("Priser: dobbelt / enkelt");
		lblName.setSize(800, 15);
		lblName.setLocation(20, 450);
		this.add(lblName);
		lblName.setFont(font1);

		lblName = new JLabel("Priser på udflugt");
		lblName.setSize(800, 15);
		lblName.setLocation(500, 450);
		this.add(lblName);
		lblName.setFont(font1);

		txfConference = new JTextField();             //name of conference
		txfConference.setSize(430, 25);
		txfConference.setLocation(20, 30);
		this.add(txfConference);

		txfLocation = new JTextField();            // location on conference
		txfLocation.setSize(430, 25);
		txfLocation.setLocation(20, 90);
		this.add(txfLocation);

		txfDate = new JTextField("");            // date
		txfDate.setSize(50, 25);
		txfDate.setLocation(250, 150);
		this.add(txfDate); 

		txfMonth = new JTextField("");            // month
		txfMonth.setSize(50, 25);
		txfMonth.setLocation(250, 175);
		this.add(txfMonth);

		txfYear = new JTextField("");            // year
		txfYear.setSize(50, 25);
		txfYear.setLocation(250, 200);
		this.add(txfYear); 

		txfPrice = new JTextField();            // price
		txfPrice.setSize(200, 25);
		txfPrice.setLocation(20, 150);
		this.add(txfPrice);

		txfHotel = new JTextField();             //name on hotel
		txfHotel.setSize(430, 25);
		txfHotel.setLocation(20, 400);
		this.add(txfHotel);

		txfTrip = new JTextField();             //name on trip
		txfTrip.setSize(430, 25);
		txfTrip.setLocation(500, 400);
		this.add(txfTrip);

		txfRoom = new JTextField();             //prices dobbel/single
		txfRoom.setSize(430, 25);
		txfRoom.setLocation(20, 475);
		this.add(txfRoom);

		txfPTrips = new JTextField();             //prices trips
		txfPTrips.setSize(430, 25);
		txfPTrips.setLocation(500, 475);
		this.add(txfPTrips);

		txaCreateHotel = new JTextArea();            //kombinerings box
		txaCreateHotel.setSize(800, 200);
		txaCreateHotel.setLocation(20, 575);
		this.add(txaCreateHotel);


		btnCreateConf = new JButton("Opret konference");
		btnCreateConf.setSize(150, 25);
		btnCreateConf.setLocation(20, 250);
		this.add(btnCreateConf);
		btnCreateConf.addActionListener(controller);

		btnCreateHotel = new JButton("Opret hotel");
		btnCreateHotel.setSize(150, 25);
		btnCreateHotel.setLocation(20, 525);
		this.add(btnCreateHotel);
		btnCreateHotel.addActionListener(controller);

		btnCreateTrip = new JButton("Opret udflugt");
		btnCreateTrip.setSize(150, 25);
		btnCreateTrip.setLocation(500, 525);
		this.add(btnCreateTrip);
		btnCreateTrip.addActionListener(controller);

		btnOk = new JButton("OK");
		btnOk.setSize(75, 25);
		btnOk.setLocation(20, 800);
		this.add(btnOk);
		btnOk.addActionListener(controller);
	}
	// declare an inner Controller class
	private class Controller implements ActionListener {
		//Environment en = new Environment();
		/*private String name;
		private String location;
		private int price;
		private int date;
		Conference con = new Conference(name,  location,  date,  price);*/
		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(btnCreateConf)){
				int pris = Integer.parseInt(txfPrice.getText());
				int d = Integer.parseInt(txfDate.getText()+txfMonth.getText()+txfYear.getText());
				
				Conference con = ConferenceService.addConference(txfConference.getText(),txfLocation.getText(), d, pris);
				
				txaCreateHotel.append(con.getName()+"\n");
				txaCreateHotel.append(con.getLocation()+"\n");
				txaCreateHotel.append(con.getDate()+"\n");
				txaCreateHotel.append(con.getPrice()+"\n");

			}
			if (e.getSource().equals(btnCreateHotel)){
				Hotel ritz = ConferenceService.addHotel("Ritz", "med morgenmad", "banegården", 100, 200, 42, ConferenceService.getAllConferences().get(ConferenceService.getAllConferences().size()-1));
				txaCreateHotel.append(ritz.getName());
			}
			if (e.getSource().equals(btnOk)){
				frame.updateDisplay();
				setVisible(false);
			}
		}
	}
}

