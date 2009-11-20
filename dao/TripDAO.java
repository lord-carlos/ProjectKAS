package dao;

import java.util.ArrayList;

import model.Companion;
import model.Trip;

public class TripDAO
{
	private static ArrayList<Trip> trips = new ArrayList<Trip>();
	private static ArrayList<Companion> companions = new ArrayList<Companion>();
	
	public static void addTrip(Trip t) {
		trips.add(t);
	}
	
	public static ArrayList<Trip> getAllTrips() {
		return trips;
	}
	
	public static void addCompanion(Companion c) {
		companions.add(c);
	}
	
	public static ArrayList<Companion> getAllCompanions() {
		return companions;
	}
}
