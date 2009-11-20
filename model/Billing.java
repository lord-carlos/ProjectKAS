package model;

public class Billing {

  private String name;
  private String address;
  private int hotelPrice;
  private int conferencePrice;
  private int tripPrice = 0;
  private int totalPrice;

  public Billing(Attendee a, Conference c) {
    this.name = a.getName();
    this.address = a.getAddress();
    }
  
	public int getTotalPrice() {
		return this.totalPrice; 
	}
	
	public void setTotalPrice(int price) {
		this.totalPrice = price;
	}

	public String getAddress() {
		return this.address; 
	}

	public String getName() {
		return this.name;
	}

	public void setTripPrice(int tripPrice)
		{
				this.tripPrice = tripPrice;
		}

	public int getTripPrice()
		{
				return tripPrice;
		}

	public void setConferencePrice(int conferencePrice)
		{
				this.conferencePrice = conferencePrice;
		}

	public int getConferencePrice()
		{
				return conferencePrice;
		}

	public void setHotelPrice(int hotelPrice)
		{
				this.hotelPrice = hotelPrice;
		}

	public int getHotelPrice()
		{
				return hotelPrice;
		}
}
