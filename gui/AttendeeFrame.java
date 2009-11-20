package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.*;

public class AttendeeFrame extends JFrame {
	// declare the component on the Frame
	private JLabel lblName;
	private JTextField txfAttendee, txfAddress, txfTown, txfCountry, txfArrDate, txfDepDate, txfComName, txfComPhone,
	                   txfAttPhone, txfCompanionName;
	private JTextArea txfCreateHotel;
	private JButton btnTilLinie, btnCreateConf, btnCreateHotel, btnOk;
	private JComboBox hotelCombo, confCombo, tripCombo;
	private JCheckBox lecturerCheck, companionCheck, adition1Check, adition2Check;
	private ComboboxController dropdownCon = new ComboboxController();
	private CheckboxController checkCon = new CheckboxController();
	
	
	int count=0;

	private Controller controller = new Controller();

	Font font = new Font ("Arial", Font.ITALIC |Font.BOLD, 14);

	public AttendeeFrame() {
		// properties for the Frame (Window)
		this.setTitle("Opret deltager");
		this.setSize(900, 550);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
	

		//ComboBoxModel hotelNames = null;
		
		String[]conferenceNames = {" V�lg konference...", " Alle tiders kvinder",
				" Kreativitet & inspiration - tre perspektiver", 
				" Forskningsnet Konference", " Environment Tomorrow"};
		
		confCombo = new JComboBox (conferenceNames);              // dropdownmenu conferences
		confCombo.setSize(250, 25);
		confCombo.setLocation(475,45);
		confCombo.setBackground (Color.white);
		add (confCombo);
		
		// Create the list of strings for the combo box options
		String[]hotelNames = {" V�lg hotel...", " Den Hvide Svane",
				" Hotel Ph�nix",	" Pension Tusindfryd"};
		
		hotelCombo = new JComboBox (hotelNames);              // dropdownmenu hotels
		hotelCombo.setSize(250, 25);
		hotelCombo.setLocation(475,115);
		hotelCombo.setBackground (Color.white);
		add (hotelCombo);
		
		String[]tripNames = {" V�lg udflugt...", " Byrundtur",
				" Museum",	" I operaen"};
		
		tripCombo = new JComboBox (tripNames);              // dropdownmenu trips
		tripCombo.setSize(250, 25);
		tripCombo.setLocation(475,200);
		tripCombo.setBackground (Color.white);
		add (tripCombo);
		
		lecturerCheck = new JCheckBox ("Lecturer");           // checkbox  
		lecturerCheck.setSize(20, 18);
		lecturerCheck.setLocation(475,270);
		lecturerCheck.setBackground (null);
		add (lecturerCheck);
		
		companionCheck = new JCheckBox ("Companion");           // checkbox  
		companionCheck.setSize(20, 18);
		companionCheck.setLocation(475,295);
		companionCheck.setBackground (null);
		add (companionCheck);
		
		adition1Check = new JCheckBox ("Adition1");           // checkbox  
		adition1Check.setSize(20, 18);
		adition1Check.setLocation(740,200);
		adition1Check.setBackground (null);
		add (adition1Check);
		
		adition2Check = new JCheckBox ("Adition2");           // checkbox  
		adition2Check.setSize(20, 18);
		adition2Check.setLocation(740,115);
		adition2Check.setBackground (null);
		add (adition2Check);

		// create the components and set the properties for them 
		lblName = new JLabel("Navn p� deltager:");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 10);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("Addresse");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 70);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("By");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 130);
		this.add(lblName);
		lblName.setFont(font);

		lblName = new JLabel("Land");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 190);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Ankomst dato");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 250);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Afrejse dato");
		lblName.setSize(200, 15);
		lblName.setLocation(250, 250);
		this.add(lblName);
		lblName.setFont(font);
				
		lblName = new JLabel("Firma navn");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 310);
		this.add(lblName);
		lblName.setFont(font);
		
        lblName = new JLabel("Firma tlf.nr.");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 370);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Deltager tlf.nr.");
		lblName.setSize(200, 15);
		lblName.setLocation(250, 370);
		this.add(lblName);
		lblName.setFont(font);
				
		lblName = new JLabel("Ledsager");
		lblName.setSize(200, 15);
		lblName.setLocation(20, 430);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Udflugter");
		lblName.setSize(200, 15);
		lblName.setLocation(475, 175);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Konference");
		lblName.setSize(200, 15);
		lblName.setLocation(475, 20);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Hotel");
		lblName.setSize(475, 50);
		lblName.setLocation(475, 75);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Till�g");
		lblName.setSize(200, 15);
		lblName.setLocation(775, 203);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Till�g");
		lblName.setSize(200, 15);
		lblName.setLocation(775, 118);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Foredragsholder");
		lblName.setSize(200, 15);
		lblName.setLocation(515, 275);
		this.add(lblName);
		lblName.setFont(font);
		
		lblName = new JLabel("Ledsager");
		lblName.setSize(200, 15);
		lblName.setLocation(515, 300);
		this.add(lblName);
		lblName.setFont(font);
		

		txfAttendee = new JTextField();             //name of attendee
		txfAttendee.setSize(430, 25);
		txfAttendee.setLocation(20, 30);
		this.add(txfAttendee);

		txfAddress = new JTextField();            // address
		txfAddress.setSize(430, 25);
		txfAddress.setLocation(20, 90);
		this.add(txfAddress);

		txfTown = new JTextField();            // town
		txfTown.setSize(200, 25);
		txfTown.setLocation(20, 150);
		this.add(txfTown); 
		
		txfCountry = new JTextField();            // country
		txfCountry.setSize(200, 25);
		txfCountry.setLocation(20, 210);
		this.add(txfCountry);
		
		txfArrDate = new JTextField();            // arrival date
		txfArrDate.setSize(200, 25);
		txfArrDate.setLocation(20, 270);
		this.add(txfArrDate); 
		
		txfDepDate = new JTextField();            // departure date
		txfDepDate.setSize(200, 25);
		txfDepDate.setLocation(250, 270);
		this.add(txfDepDate);

		txfComName = new JTextField();            // company name
		txfComName.setSize(200, 25);
		txfComName.setLocation(20, 330);
		this.add(txfComName);
		
		txfComPhone = new JTextField();             //company phone.no
		txfComPhone.setSize(200, 25);
		txfComPhone.setLocation(20, 390);
		this.add(txfComPhone);
		
		txfAttPhone = new JTextField();             //attendee phone.no
		txfAttPhone.setSize(200, 25);
		txfAttPhone.setLocation(250, 390);
		this.add(txfAttPhone);
		
		txfCompanionName = new JTextField();             //companion name
		txfCompanionName.setSize(430, 25);
		txfCompanionName.setLocation(20, 450);
		this.add(txfCompanionName);
		
				
		/*btnCreateConf = new JButton("Opret konference");
	    btnCreateConf.setSize(150, 25);
	    btnCreateConf.setLocation(300, 650);
		this.add(btnCreateConf);
		btnCreateConf.addActionListener(controller);
		
		btnCreateHotel = new JButton("Opret hotel");
		btnCreateHotel.setSize(150, 25);
		btnCreateHotel.setLocation(20, 625);
		this.add(btnCreateHotel);
		btnCreateHotel.addActionListener(controller);*/
		
		btnOk = new JButton("OK",new ImageIcon ("play.gif"));
		btnOk.setSize(75, 25);
		btnOk.setLocation(475, 350);
		this.add(btnOk);
		btnOk.addActionListener(controller);

		
	}

	// declare an inner Controller class
	private class Controller implements ActionListener {
		//private Conference conference=null;
		


		public void actionPerformed(ActionEvent e) {


			/*if (e.getSource() == btnCreateHotel) {			// write name on hotel and pricein JTextArea
				String s = txfHotel.getText();           
				String s1 = txfRoom.getText();
				conference = new Conference(s, s1);

				txfCreateHotel.append(conference.getNameOfHotel() + "\n" +conference.getPriceOnRoom() + "\n");
			}*/

			}
		}
	
			private class ComboboxController implements ActionListener {              // dropdown controller
				public void actionPerformed(ActionEvent cc) {
				}
			}
			
			private class CheckboxController implements ActionListener {              // checkbox controller
				public void actionPerformed(ActionEvent cbc) {
				}
			}
			
			
			private final int MIN = 20;  // smallest picture size

			   private Image kas2;

			   //-----------------------------------------------------------------
			   //  Loads the images.
			   //-----------------------------------------------------------------
			   public void init()
			   {
			      kas2 = getImage (getDocumentBase(), "kas2.gif");
			    

			      //setSize (APPLET_WIDTH, APPLET_HEIGHT);
			   }

			   private Image getImage(Object documentBase, String string) {
				// TODO Auto-generated method stub
				return null;
			}

			private Object getDocumentBase() {
				// TODO Auto-generated method stub
				return null;
			}

			//-----------------------------------------------------------------
			   //  Draws the three images, then calls itself recursively.
			   //-----------------------------------------------------------------
			   public void drawPictures (int size, Graphics page)
			   {
			     
			      page.drawImage (kas2, size/2, size/2, size/2, size/2, this);

			      if (size > MIN)
			         drawPictures (size, page);
			   }

			   //-----------------------------------------------------------------
			   //  Performs the initial call to the drawPictures method.
			   //-----------------------------------------------------------------
			   public void paint (Graphics page)
			   {
			      //drawPictures (APPLET_WIDTH, page);
			   }
			
}
	


