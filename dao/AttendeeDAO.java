package dao;

import java.util.ArrayList;

import model.Attendee;

public class AttendeeDAO
{
	private static ArrayList<Attendee> attendees = new ArrayList<Attendee>();
	
	public static void addAttendee(Attendee a) {
		attendees.add(a);
	}
	
	public static ArrayList<Attendee> getAllAttendees() {
		return attendees;
	}
	
	
}
