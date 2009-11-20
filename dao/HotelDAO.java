package dao;

import java.util.ArrayList;
import model.Attendee;

public class HotelDAO
{
	private static ArrayList<Attendee> residents = new ArrayList<Attendee>();
	
//	public static ArrayList<Hotel> getAllHotels() {
//		return hotels;
//	}
	
	public static ArrayList<Attendee> getAllResidents() {
		return residents;
	}
	
	public static Attendee getResident(int i) {
		return residents.get(i);
	}
	
	public static void addResident(Attendee a) {
		residents.add(a);
	}
}
