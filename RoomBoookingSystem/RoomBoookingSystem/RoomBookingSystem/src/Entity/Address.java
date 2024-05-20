package Entity;

public class Address 
{
	private String houseno;
	private String street;
	private String district;
	private String state;
	private int pincode;
	public Address(String houseno, String street, String district, String state, int pincode)
	{
//		super();
		this.houseno = houseno;
		this.street = street;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public String getHouseno()
	{
		return houseno;
	}
	public void setHouseno(String houseno) 
	{
		this.houseno = houseno;
	}
	public String getStreet() 
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public String getDistrict() 
	{
		return district;
	}
	public void setDistrict(String district) 
	{
		this.district = district;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public int getPincode()
	{
		return pincode;
	}
	public void setPincode(int pincode)
	{
		this.pincode = pincode;
	}
	@Override
	public String toString()
	{
		return "Address [houseno=" + houseno + ", street=" + street + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	

}
