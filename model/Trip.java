package model;

import java.util.ArrayList;


public class Trip {

  private int date;
  private String extra;
  private String name;
  private int price;
  private ArrayList<Companion> companions = new ArrayList<Companion>();

  public Trip(int date, String extra, String name, int price) {
    this.date = date;
    this.extra = extra;
    this.name = name;
    this.price = price;
  }

  public ArrayList<Companion> getCompanions() {
    return companions;
  }

  public int getDate() {
    return date;
  }

  public String getExtra() {
    return extra;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void addCompanion(Companion c) {
    if (!companions.contains(c)) {
      companions.add(c);
    } else {
      System.out.println("### Woops! companion already in Arrylist!");
    }
  }

}
