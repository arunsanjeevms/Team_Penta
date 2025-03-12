package pack1;

public class Hotel {
   private String hotelName;
	Hotel(){
		System.out.println(" WELCOME TO " +hotelName+" Unavagam - $ "+" \nRestaurant was Open !!");
		}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	void HotelName(){
		System.out.println(hotelName);
	}
}
