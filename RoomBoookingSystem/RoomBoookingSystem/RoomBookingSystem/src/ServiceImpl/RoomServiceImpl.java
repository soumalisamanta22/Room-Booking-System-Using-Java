package ServiceImpl;
import java.util.LinkedHashMap;
import java.util.Scanner;
import Dao.RoomRepo;
import Entity.Address;
import Entity.Customer;
import Service.RoomService;
public class RoomServiceImpl implements RoomService, RoomRepo
{
	Scanner ip=new Scanner(System.in);
	{
		for(int i=0;i<=10;i++)
		{
			cm.put(i, null);
		}
		for(int i=0;i<=8;i++)
		{
			sm.put(i, null);
		}
		for(int i=0;i<=5;i++)
		{
			dm.put(i, null);
		}
	}

	@Override
	public void roomInfo() 
	{
		System.out.println("=========Classic Rooms=======");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("Tv:No");
		System.out.println("Wifi:No");
		System.out.println("Price:rs.2000");
		
		System.out.println("=========Standard Rooms=======");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:No");
		System.out.println("Price:rs.2500");
		
		System.out.println("=========Deluxe Rooms=======");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:Yes");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:Yes");
		System.out.println("Price:rs.3500");
		
	}
	public void checkRoom(LinkedHashMap<Integer,Customer>l1)
	{
		boolean flag=false;
		for(Integer ele:l1.keySet())
		{
			if(l1.get(ele)==null)
			{
				System.out.print(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Rooms Are AAvailable");
		}
	}
	
	@Override
	public void availableRoom() 
	{
		System.out.println("========Available Rooms========");
		System.out.println("======Classic Rooms======");
		checkRoom(cm);
		System.out.println("======Standard Rooms======");
		checkRoom(sm);
		System.out.println("======Deluxe Rooms======");
		checkRoom(dm);
	}
	Customer createCustomer()
	{
		System.out.println("Enter Customer Details:");
		System.out.println("Enter Customer id:");
		int cid=ip.nextInt();
		System.out.println("Enter Customer name:");
		String cname=ip.next();
		System.out.println("Enter Customer age:");
		int cage=ip.nextInt();
		System.out.println("Enter Customer phno:");
		long cphno=ip.nextLong();
		System.out.println("Enter Customer email:");
		String email=ip.next();
		System.out.println("Enter Door No:");
		String dn=ip.next();
		System.out.println("Enter Street Address:");
		ip.nextLine();
		String street=ip.nextLine();
		System.out.println("Enter District:");
		String dst=ip.next();
		System.out.println("Enter State:");
		String state=ip.next();
		System.out.println("Enter the pincode:");
		int pincode=ip.nextInt();
		Address a=new Address(dn,street,dst,state,pincode);
		return new Customer(cid,cname,cage,cphno,email,a);
		
	}
	void mapRoom(LinkedHashMap<Integer,Customer>l1,int roomNo,double amt)
	{
		if(l1.get(roomNo)==null)
		{
			Customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo,c);
			c.setCamount(amt);
			System.out.println("Room No:" +roomNo+"had allocated for" +c.getCname());
		}
		else
		{
			System.out.println("Room is not available...!");
		}
	}
	@Override
	public void allocateRoom()
	{
		System.out.println("=====Menu======");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int op=ip.nextInt();
		switch(op)
		{
			case 1: System.out.println("Enter the room no:-");
					int roomNo1=ip.nextInt();
					if(roomNo1>=1 && roomNo1<=10)
					{
						mapRoom(cm,roomNo1,2000);
					}
					else
					{
						System.out.println("Enter Correct Room No");
					}
					break;
			case 2: System.out.println("Enter the room no:-");
			int roomNo2=ip.nextInt();
			if(roomNo2>=1 && roomNo2<=8)
			{
				mapRoom(cm,roomNo2,2500);
			}
			else
			{
				System.out.println("Enter Correct Room No");
			}
			break;
			case 3: System.out.println("Enter the room no:-");
			int roomNo3=ip.nextInt();
			if(roomNo3>=1 && roomNo3<=5)
			{
				mapRoom(cm,roomNo3,3000);
			}
			else
			{
				System.out.println("Enter Correct Room No");
			}
			break;
			default: System.out.println("Invalid Option......!!!!");
		}
	}
	void unMapRoom(LinkedHashMap<Integer,Customer>l1,int roomNo)
	{
		if(l1.get(roomNo)!=null)
		{
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+"need to pay"+c1.getCamount()+"Rs");
			l1.put(roomNo, null);
		}
		else
		{
			System.out.println("Invalid RoomNo........");
		}
	}
	@Override
	public void checkout()
	{
		System.out.println("=====Menu======");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int op=ip.nextInt();
		System.out.println("Enter the room no:");
		int roomno=ip.nextInt();
		switch(op)
		{
			case 1: if(roomno>=1 && roomno<=10)
					{
						unMapRoom(cm,roomno);
					}
					else
					{
						System.out.println("Invalid roomno");
					}
					break;
			case 2: if(roomno>=1 && roomno<=8)
					{
						unMapRoom(sm,roomno);
					}
					else
					{
						System.out.println("Invalid roomno");
					}
					break;
			case 3: if(roomno>=1 && roomno<=5)
					{
						unMapRoom(dm,roomno);
					}
					else
					{
						System.out.println("Invalid roomno");
					}
			default:System.out.println("Invalid option");
		}
		
	}
	@Override
	public void findAllCustomer()
	{
		if(a1.size()==0)
		{
			System.out.println("Database is empty....!!");
		}
		else
		{
			for(Customer ele:a1)
			{
				System.out.println(ele);
			}
		}
		
	}
	@Override
	public void getCustomerById()
	{
		boolean flag=false;
		System.out.println("Enter the customer id:");
		int cid=ip.nextInt();
		for(Customer ele:a1)
		{
			if(ele.getCid()==cid)
			{
				System.out.println(ele);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid Customer Id....!!");
		}
	}
}
