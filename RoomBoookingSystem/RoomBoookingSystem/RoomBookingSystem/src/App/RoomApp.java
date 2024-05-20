package App;

import java.util.Scanner;
import Service.RoomService;
import ServiceImpl.RoomServiceImpl;
public class RoomApp 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		RoomService r1=new RoomServiceImpl();
		System.out.println("======Welcome To Room Booking System======");
		while(true)
		{
			System.out.println("=====Menu=====");
			System.out.println("1.Room Details\n2.Available Rooms\n3.Allocate Room\n4.checkout\n5.Exit");
			System.out.println("Enter your option:-");
			int op=ip.nextInt();
			switch(op)
			{
				case 1:r1.roomInfo();
					break;
				case 2:r1.availableRoom();
					break;
				case 3: r1.allocateRoom();
					break;
				case 4:	r1.checkout();
					break;
				case 5:System.out.println("Thank You Visit Again");
					System.exit(0);
//				default : System.out.println("Invalid option");
			}
			
			
		}
	}
}
