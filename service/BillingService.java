package service;

import model.Attendee;
import model.Billing;
import model.Conference;
import model.Trip;

public class BillingService
{
	public static Billing billing(Attendee a, Conference c) {
		
		Billing bill = new Billing(a,c);
		
		int conPrice = a.getIsTalking() ? 0 : c.getPrice();
		bill.setConferencePrice(conPrice);
	
		bill.setConferencePrice(a.getConference().getPrice());
		if(a.getCompanion() != null) {
			bill.setHotelPrice(a.getHotel().getDoublePrice());
			for(Trip t : CompanionService.getAttendingTrips(a.getCompanion())) {
				bill.setTripPrice(bill.getTripPrice()+t.getPrice());
			}
		}
		else {
			bill.setHotelPrice(a.getHotel().getSinglePrice());
		}
		
		bill.setTotalPrice(bill.getHotelPrice()+bill.getTripPrice()+bill.getConferencePrice()+a.getHotel().getAdditionPrice());
		
		return bill;
	}
	
	public static int getTotalPrice(Billing bill) {
		return bill.getTotalPrice();
	}
	
	public static String getName(Billing bill) {
		return bill.getName();
	}
	
	public static String getAddress(Billing bill) {
		return bill.getAddress();
	}
	

	
}
