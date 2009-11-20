package model;

import java.util.ArrayList;

public class Hotel {

  private String name;
  private String address;
  private String addition;
  private int singlePrice;
  private int doublePrice;
  private int additionPrice;
  private Conference conference;
  private ArrayList<Attendee> residents = new ArrayList<Attendee>();

  public Hotel(String name, String addition, String address, int singlePrice, int doublePrice, int addPrice, Conference c) {
    this.name = name;
    this.addition = addition;
    this.singlePrice = singlePrice;
    this.doublePrice = doublePrice;
    this.address = address;
    this.conference = c;
    this.additionPrice = addPrice;
  }

  public ArrayList<Attendee> get_hResidents() {
    return residents;
  }

  public void set_hResidents(ArrayList<Attendee> hResidents) {
    residents = hResidents;
  }

  public String getName() {
    return name;
  }

  public String getAddition() {
    return addition;
  }

  public Conference getConference() {
	  return conference;
  }
  
  public int getSinglePrice() {
    return singlePrice;
  }

  public String getAddress() {
	  return this.address;
  }
  
  public int getDoublePrice() {
    return doublePrice;
  }
  
  public Hotel getHotel(Attendee a) {
		return a.getHotel();
  }

  public int getAdditionPrice() {
    return additionPrice;
  }

  public void addResident(Attendee attendee) {
    if (!residents.contains(attendee)) {
      residents.add(attendee);
    }
  }
  
  public void addResident(Attendee a, String addition) {
	  if(!residents.contains(a)) {
		  residents.add(a);
	  }
  }

public void setAddition(String addition)
	{
			this.addition = addition;
	}

public void setAdditionPrice(int additionPrice)
	{
			this.additionPrice = additionPrice;
	}
}
