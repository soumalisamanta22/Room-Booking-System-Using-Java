package Entity;

public class Customer
{

	private int cid;
	private String cname;
	private int cage;
	private long cphno;
	private String email;
	private double camount;
	private Address caddress;
	public Customer(int cid, String cname, int cage, long cphno, String email, Address caddress)
	{
//		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.cphno = cphno;
		this.email = email;
		this.camount = camount;
		this.caddress = caddress;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public int getCage()
	{
		return cage;
	}
	public void setCage(int cage)
	{
		this.cage = cage;
	}
	public long getCphno() 
	{
		return cphno;
	}
	public void setCphno(long cphno)
	{
		this.cphno = cphno;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public double getCamount()
	{
		return camount;
	}
	public void setCamount(double camount) 
	{
		this.camount = camount;
	}
	public Address getCaddress() 
	{
		return caddress;
	}
	public void setCaddress(Address caddress) 
	{
		this.caddress = caddress;
	}
	@Override
	public String toString() 
	{
		return "Customer [cid=" + cid + ", cname=" + cname + ", cage=" + cage + ", cphno=" + cphno + ", email=" + email
				+ ", camount=" + camount + ", caddress=" + caddress + "]";
	}
}
