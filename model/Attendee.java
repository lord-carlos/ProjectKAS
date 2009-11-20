package model;

public class Attendee {
  private String name;
  private String address;
  private int ArrivalAate; //ddmmyy
  private String city;
  private Companion companion = null;
  private Conference conference = null;
  private String firmName;
  private int firmPhoneNumber;
  private Hotel hotel = null;
  private boolean isTalking;
  private int leavingDate; //ddmmyy
  private int phoneNumber;

  public Attendee(String name, String address, int ArrivalAate, String city, String firmName, int firmPhoneNumber, boolean isTalking, int leavingDate, int phoneNumber) {
    this.name = name;
    this.address = address;
    this.ArrivalAate = ArrivalAate;
    this.city = city;
    this.firmName = firmName;
    this.firmPhoneNumber = firmPhoneNumber;
    this.isTalking = isTalking;
    this.leavingDate = leavingDate;
    this.phoneNumber = phoneNumber;
  }
  
  public void setCompanion(Companion c) {
	  if(this.companion != null) {
		  this.setCompanion(null); 
	  }
	  this.companion = c;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public String getAddress() {
    return address;
  }

  public int getArrivalAate() {
    return ArrivalAate;
  }

  public String getCity() {
    return city;
  }

  public Companion getCompanion() {
    return companion;
  }

  public String getFirmName() {
    return firmName;
  }

  public int getFirmPhoneNumber() {
    return firmPhoneNumber;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public int getLeavingDate() {
    return leavingDate;
  }

  public String getName() {
    return name;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public boolean getIsTalking() {
    return isTalking;
  }

  public void setConference(Conference conference)
	{
			this.conference = conference;
	}

  public Conference getConference()
	{
			return conference;
	}
    
}
