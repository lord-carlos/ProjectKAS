package service;

import java.util.ArrayList;

import dao.CompanionDAO;
import model.Attendee;
import model.Companion;
import model.Conference;
import model.Trip;

public class CompanionService
{
	public static Companion addCompanion(String name, Conference c, Attendee a) {
		Companion comp = new Companion(name, c);
		AttendeeService.setCompanion(a, comp);
		return comp;
	}
	
	public static void attendTrip(Trip t, Companion c) {
		t.addCompanion(c);
		CompanionDAO.addTrip(t);
	}
	
	public static ArrayList<Trip> getAttendingTrips(Companion c) {
		ArrayList<Trip> _trips = new ArrayList<Trip>();
		for(int i = 0; i < CompanionDAO.getAllTrips().size(); i++) {
			if(CompanionDAO.getTrip(i).getCompanions().contains(c)) {
				if(!_trips.contains(CompanionDAO.getTrip(i))) {
					_trips.add(CompanionDAO.getTrip(i));
				}
			}
		}
		return _trips;
	}
}
