package service;

import java.util.ArrayList;
import dao.ConferenceDAO;
import model.Conference;
import model.Hotel;

public class ConferenceService
{
	public static ArrayList<Conference> getAllConferences() {
		return ConferenceDAO.getAllConferences();
	}
	
	public static Conference addConference(String name, String location, int date, int price) {
		Conference c = new Conference(name, location, date, price);
		ConferenceDAO.addConference(c);
		return c;
	}
	
	public static Hotel addHotel(String name, String addition, String location, int singlePrice, int doublePrice, int addPrice, Conference c) {
		Hotel h = new Hotel(name, addition, location, singlePrice, doublePrice, addPrice, c);
		ConferenceDAO.addHotel(h, c);
		return h;
	}
	

}
