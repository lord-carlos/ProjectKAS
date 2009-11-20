package model;

import java.util.ArrayList;

public class Conference {

  private String name;
  private String location;
  private int date;
  private int price;
  private ArrayList<Attendee> attendees = new ArrayList<Attendee>();
  private ArrayList<Trip> trips = new ArrayList<Trip>();
  private ArrayList<Hotel> hotels = new ArrayList<Hotel>();

  public Conference(String name, String location, int date, int price) {
    this.name = name;
    this.location = location;
    this.date = date;
    this.price = price;
  }


  public void AddTrip(Trip t) {
    trips.add(t);
  }

  public void AddHotel(Hotel h) {
    hotels.add(h);
  }

  public String ViewAttendees() {
    String s = "";

    for (int i = 0; i < attendees.size(); i++) {
      s += attendees.get(i).getName();
    }
    return s;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public int getDate() {
    return date;
  }

  public int getPrice() {
    return price;
  }

  public ArrayList<Attendee> getAttendees() {
    return attendees;
  }

  public void setAttendees(ArrayList<Attendee> attendees) {
    this.attendees = attendees;
  }

  public ArrayList<Trip> getTrips() {
    return trips;
  }

  public void setTrips(ArrayList<Trip> trips) {
    this.trips = trips;
  }

  public ArrayList<Hotel> getHotels() {
    return hotels;
  }

  public void setHotels(ArrayList<Hotel> hotels) {
    this.hotels = hotels;
  }
}
