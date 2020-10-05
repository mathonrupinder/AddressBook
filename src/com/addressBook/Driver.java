package com.addressBook;

import java.util.Scanner;

public class Driver {
 
	public static void main(String args[])
	{
		AddressBook addressBook=new AddressBook();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 TO ADD NEW PERSON:");
		System.out.println("Press 2 TO DISPLAY ALL CONTACT INFORMATION:");
		System.out.println("Press 3 TO DELETE THE CONTACT :");
		System.out.println("Press 4 TO UPDATE THE CONTACT :");
		System.out.println("Press 0 to exit");
		while(true) {
			System.out.println("Enter your option:");
			int option =sc.nextInt();
			while(true) {
				if(option==1)
				{
					addressBook.addAddressBook();
					break;
				}
				if(option==2)
				{
					addressBook.allDetails();
					break;
				}
				if(option==3)
				{
					addressBook.deleteAddressBook();
					break;
				}
				if(option==4)
				{
					addressBook.update();
					break;}
				if(option==0)
				{
					System.exit(0);
					break;}
				
		}
	}

}
}