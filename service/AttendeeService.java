package service;

import java.util.ArrayList;

import model.Attendee;
import model.Companion;
import model.Conference;
import dao.AttendeeDAO;

public class AttendeeService
{
	public static ArrayList<Attendee> getAllAttendees() {
		return AttendeeDAO.getAllAttendees();
	}
	
	public static Attendee addAttendee(String name, String address, int ArrivalAate, String city, String firmName, int firmPhoneNumber, boolean isTalking, int leavingDate, int phoneNumber) {
		Attendee a = new Attendee(name, address, ArrivalAate, city, firmName, firmPhoneNumber, isTalking, leavingDate, phoneNumber);
		AttendeeDAO.addAttendee(a);
		return a;
	}
	
	public static Conference attendConference(Attendee a, Conference c) {
		a.setConference(c);
		return c;
	}
	
	public static Companion setCompanion(Attendee a, Companion c) {
		a.setCompanion(c);
		return c;
	}
	
	public static void UpdateConference(Attendee a, Conference c) {
		if(c != null) {
				a.setConference(c);
			}
	}
	
	public static void updateCompanion(Attendee a, Companion c) {
		if(c != null) {
			a.setCompanion(c);
		}
	}
	
	public static Companion getCompanion(Attendee a) {
		return a.getCompanion();
	}
	
}
