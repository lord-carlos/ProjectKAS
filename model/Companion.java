package model;

import java.util.ArrayList;

public class Companion {

  private String name;
  private Attendee attendee;
  private Conference conference;
  private ArrayList<Trip> attendingTrips = new ArrayList<Trip>();
  

  public Companion(String name, Conference conference) {
    this.name = name;
    this.conference = conference;
  }

  public void addAttendee(Attendee attendee) {
    this.attendee = attendee;
    if(attendee.getCompanion() != this){
      this.attendee.setCompanion(this);
    }
  }

  public Attendee getAttendee() {
    return attendee;
  }

  public ArrayList<Trip> getAttendingTrips() {
    return attendingTrips;
  }

  public void addTrip(Trip trip) {
    if (attendingTrips==null || !attendingTrips.contains(trip)) {
      attendingTrips.add(trip);
    } else {
      System.out.println("### Woops! This shold not happen! Trip already in Arrylist");
    }
  }

  public String getName() {
	  return this.name;
  }
  
  public Conference getConference() {
	  return this.conference;
  }
}
