package service;

import model.Attendee;
import model.Billing;
import model.Companion;
import model.Conference;
import model.Hotel;
import model.Trip;

public class UpDownService
{
	public static void startUp() {
		  createData();
	}
	
	private static void createData() {
		
	    
	    Conference con = ConferenceService.addConference("kultur pjat", "århus", 949494, 2000);
	    con = ConferenceService.addConference("kultur", "århus", 949494, 1000);
	    
	    Hotel ritz = ConferenceService.addHotel("Ritz", "med morgenmad", "banegården", 100, 200, 42, con);
	    Hotel plaza = ConferenceService.addHotel("Plaza", "med bad", "banegården", 100, 200, 42, con);
	   
	    
	    Attendee a = AttendeeService.addAttendee("peter", "langenæs alle", 121109, "århus", "dba", 88888888, false, 141109, 99999999);
	    Attendee b = AttendeeService.addAttendee("bo", "langenæs alle", 121109, "århus", "dba", 88888888, true, 141109, 99999999);
	    Attendee ab = AttendeeService.addAttendee("carsten", "langenæs alle", 121109, "århus", "dba", 88888888, true, 141109, 99999999);
	    Attendee abc = AttendeeService.addAttendee("david", "langenæs alle", 121109, "århus", "dba", 88888888, true, 141109, 99999999);
	    Attendee abcd = AttendeeService.addAttendee("erik", "langenæs alle", 121109, "århus", "dba", 88888888, true, 141109, 99999999);
	    
	    AttendeeService.attendConference(a, con);
	    AttendeeService.attendConference(b, con);
	    AttendeeService.attendConference(ab, con);
	    AttendeeService.attendConference(abc, con);
	    AttendeeService.attendConference(abcd, con);

	    Companion c = CompanionService.addCompanion("thomas", con, a);
	    Companion d = CompanionService.addCompanion("bo", con, b);
	    
	    Trip t = TripService.addTrip(150390, "mad", "en kedelig tur", 130);
	    Trip s = TripService.addTrip(556161, "bar", "en sjov tur", 150);
	    
	    HotelService.addResident(a, ritz, true);
	    HotelService.addResident(ab, ritz);
	    HotelService.addResident(abc, ritz);
	    HotelService.addResident(b, plaza);
	    HotelService.addResident(abcd, plaza);
	    
	    CompanionService.attendTrip(t, c);
	    CompanionService.attendTrip(s, c);
	    
	    CompanionService.attendTrip(s, d);
	    
	    
	    Billing bill = BillingService.billing(a, con);
	    
	    System.out.println(BillingService.getTotalPrice(bill));
	    System.out.println(BillingService.getName(bill));

	    
	    
	    for(Attendee z : HotelService.getAllResidents(ritz)) {
	    	System.out.println(z.getName());
	    }
	    
	    for(Trip x : CompanionService.getAttendingTrips(c)) {
	    	System.out.println(x.getName());
	    }
	    	

	    
	    
	}
}
