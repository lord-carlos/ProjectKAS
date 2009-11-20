package dao;

import java.util.ArrayList;
import model.Conference;
import model.Hotel;

public class ConferenceDAO
{	
	private static ArrayList<Conference> conferences = new ArrayList<Conference>();
	
	
	public static ArrayList<Conference> getAllConferences()  {
		return conferences;
	}
	
	public static void addConference(Conference c) {
		conferences.add(c);
	}
	
	public static void addHotel(Hotel h, Conference c) {
		c.AddHotel(h);
	}

}
