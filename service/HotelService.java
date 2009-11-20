package service;

import java.util.ArrayList;
import dao.HotelDAO;
import model.Attendee;
import model.Hotel;

public class HotelService	
{
	public static ArrayList<Attendee> getAllResidents() {
		return HotelDAO.getAllResidents();
	}
	
	public static Attendee addResident(Attendee a, Hotel h) {
		a.setHotel(h);
		HotelDAO.addResident(a);
		return a;
	}
	
	public static Attendee addResident(Attendee a, Hotel h, boolean addition) {
		a.setHotel(h);
		int price = h.getAdditionPrice();
		
		if(addition) {
			a.getHotel().setAdditionPrice(price);
		}
		else {
			a.getHotel().setAdditionPrice(0);
		}
		
		
		HotelDAO.addResident(a);
		return a;
	}
	
	public static ArrayList<Attendee> getAllResidents(Hotel h) {
		ArrayList<Attendee> _residents = new ArrayList<Attendee>();
		for(int i = 0; i < HotelDAO.getAllResidents().size(); i++) {
			if(HotelDAO.getResident(i).getHotel().equals(h)) {
				if(!_residents.contains(HotelDAO.getResident(i))) {
					_residents.add(HotelDAO.getResident(i));
				}
			}
		}	
		return _residents;
	}
	
}
