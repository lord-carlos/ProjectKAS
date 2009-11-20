package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.*;

import service.ConferenceService;

import java.awt.Color;
import java.awt.Font;
import gui.ConferenceFrame;
import model.Conference;
//import model.Environment;

public class MainFrame extends JFrame {
	//private JTextField txfDisplay;
	private JButton btnShowAttendee, btnShowTrip, btnShowHotels;
	private JButton btnAddConference, btnAddAttendee, btnFaktura;
	private JTextArea txaToAttendee;
	private JCheckBox chbAktiv;
	private JComboBox cbconference;

	private MainController mainCtrl = new MainController(this);
	//private Conference conference = new Conference();
	
	public MainFrame(){
		this.setTitle("KAS");
		this.setSize(600, 880);
		this.setLocation(300, 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setBackground(new Color(200,211,220));
		this.setLayout(null);
		
		
		cbconference = new JComboBox ();
		cbconference.setSize(300, 25);
		cbconference.setLocation(20,20);
		cbconference.setBackground (Color.white);
		add(cbconference);

		btnAddConference = new JButton("Opret konference");
		btnAddConference.setSize(150, 25);
		btnAddConference.setLocation(20,700);
		this.add(btnAddConference);
		btnAddConference.addActionListener(mainCtrl);

		btnAddAttendee = new JButton("Opret deltager");
		btnAddAttendee.setSize(150, 25);
		btnAddAttendee.setLocation(200, 700);
		this.add(btnAddAttendee);
		btnAddAttendee.addActionListener(mainCtrl);
		
		btnShowAttendee = new JButton("Vis deltagerliste");
		btnShowAttendee.setSize(150, 25);
		btnShowAttendee.setLocation(20, 75);
		this.add(btnShowAttendee);
		btnShowAttendee.addActionListener(mainCtrl);
		
		btnShowTrip = new JButton("Vis udflugter");
		btnShowTrip.setSize(150, 25);
		btnShowTrip.setLocation(20, 120);
		this.add(btnShowTrip);
		btnShowTrip.addActionListener(mainCtrl);
		
		btnShowHotels = new JButton("Hotel oversigt");
		btnShowHotels.setSize(150, 25);
		btnShowHotels.setLocation(20, 165);
		this.add(btnShowHotels);
		btnShowHotels.addActionListener(mainCtrl);
		
		btnFaktura = new JButton("Udskriv Faktura");
		btnFaktura.setSize(150, 25);
		btnFaktura.setLocation(380, 700);
		this.add(btnFaktura);
		btnFaktura.addActionListener(mainCtrl);

		txaToAttendee = new JTextArea();
		txaToAttendee.setSize(550, 350);
		txaToAttendee.setLocation(20, 300);
		txaToAttendee.setEditable(false);
		this.add(txaToAttendee);
		

		updateDisplay();


		/*chbAktiv = new JCheckBox("Aktiv");
		chbAktiv.setSize(20, 20);
		chbAktiv.setLocation(140, 120);
		this.add(chbAktiv);*/
		
	}
	
	public void updateDisplay() {
		cbconference.removeAllItems();
		for(Conference c : ConferenceService.getAllConferences()){
			cbconference.addItem(c.getName());
		}
	}

	private class MainController implements ActionListener{

		private MainFrame frame;
		
		public MainController(MainFrame frame) {
			this.frame = frame;
		}
		public void actionPerformed(ActionEvent e){
			if(e.getSource().equals(btnAddConference)){
				ConferenceFrame frame1 = new ConferenceFrame(frame);
				frame1.setVisible(true);
			}
			if(e.getSource().equals(btnAddAttendee)){
				AttendeeFrame frame2 = new AttendeeFrame();
				frame2.setVisible(true);
			}
			if(e.getSource().equals(btnFaktura)){
				
			}
			if(e.getSource().equals(btnShowAttendee)){
				
			}
			if(e.getSource().equals(btnShowTrip)){
				
			}
			if(e.getSource().equals(btnShowHotels)){
				
			}
		}
	}
}
