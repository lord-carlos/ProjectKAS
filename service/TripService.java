package service;

import java.util.ArrayList;

import model.Companion;
import model.Trip;
import dao.TripDAO;

public class TripService
{
	public static Trip addTrip(int date, String extra, String name, int price) {
		Trip t = new Trip(date, extra, name, price);
		TripDAO.addTrip(t);
		return t;
	}
	
	public static void addCompanion(Companion c) {
		TripDAO.addCompanion(c);
	}
	
	public static ArrayList<Trip> getAllTrips() {
		return TripDAO.getAllTrips();
	}
	
	public static ArrayList<Companion> getAllCompanions() {
		return TripDAO.getAllCompanions();
	}
}
