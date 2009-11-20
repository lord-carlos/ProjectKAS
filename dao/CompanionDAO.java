package dao;

import java.util.ArrayList;
import model.Trip;

public class CompanionDAO
{
	private static ArrayList<Trip> trips = new ArrayList<Trip>();
	
	public static ArrayList<Trip> getAllTrips() {
		return trips;
	}
	
	public static Trip getTrip(int i) {
		return trips.get(i);
	}
	
	public static void addTrip(Trip t) {
		trips.add(t);
	}
}
