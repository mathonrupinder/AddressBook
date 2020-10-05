package com.addressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AddressBook
{
	 
		public String firstName="";
		public String lastName="";
		public  String address="";
		public 	String city="";
		public  int zip=0;
		public  long phoneNumber=0;
		
	static Scanner in=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	String[] arr;
	
	// Initializing nested Hashmap
	Map<String, HashMap<String, String>> map = new HashMap<String, HashMap<String,String>>();
	public HashMap<String,String> hm;
	
	// Add address Book
	public void addAddressBook() 
	{
		try 
		{
			//storing values in Hashmap
			hm = new HashMap<String,String>();  
			System.out.print("Enter first name:");
			firstName=in.nextLine();
			System.out.print("Enter Last name:");
			lastName=in.nextLine();
			System.out.print("Enter your address:");
			address=in.nextLine();
			System.out.print("Enter your city:");
			city=in.nextLine();
			System.out.print("Enter zip code:");
			zip=sc.nextInt();
			System.out.print("Enter phone number:");
			phoneNumber=sc.nextLong();
			String str1 = Integer.toString(zip); 
			String str2 = Long.toString(phoneNumber);
		
			hm.put("FirstName",firstName);
			hm.put("LastName",lastName);
			hm.put("Address",address);
			hm.put("City",city);
			hm.put("Zip",str1);
			hm.put("phone number",str2);
			map.put(str2, hm);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
}

	// fetching all details
	
	public void allDetails() {
		try
		{
			if (hm==null) {
				System.out.println("Your Address Book is Empty ");
			}
			else {
			for (String i : map.keySet()) 
			{
				System.out.println("PhoneNumber: " + i + " Details: " + map.get(i));
			}
		}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	// Delete Address Book
	 
	public void deleteAddressBook() 
	{
		try
		{
			if (hm==null) {
				System.out.println("Your Address Book is Empty ");
			}
			else {
				System.out.println("List of Entries in Address Book");
				printMap(map);
				System.out.print("Enter phone Number to remove particular address book:");
				long phNumber = in.nextLong();
				String str3 = String.valueOf(phNumber); 
				if(map.containsKey(str3)==true) 
				{
					map.remove(str3);
					System.out.println("Removed successfully!");
					printMap(map);
				}
				else 
				{
					System.out.println("Wrong phone Number");
				}
			}
		
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// Printing Keys 	
	public void printMap(Map<String, HashMap<String, String>> map) 
	{
		for(String s : map.keySet()) {
			System.out.println(s);
		}
		  
	}
   // Updating the values
		
	public void update() 
	{
		try
		{   if (hm==null) 
			{
				System.out.println("Your Address Book is Empty ");
			}
			else 
			{
				System.out.println("List of entries in address book--");
				printMap(map);
				System.out.print("Enter phone Number for which you want edit details::");
				String keyy = in.nextLine();
				if(map.containsKey(keyy)==true) 
				{
					System.out.println(map.get(keyy));
					System.out.print("Enter Field you want to edit::");
					String field = in.nextLine();
					if(field.equalsIgnoreCase("FirstName")||field.equalsIgnoreCase("LastName"))
					{
						System.out.println("You cannot update first or last name");
					}
					else
					{
						System.out.print("Enter New value::");
						String new1=in.nextLine();
						map.get(keyy).replace(field,new1);
					System.out.println("Updated Successfully!");
					}
				}
				else 
				{
						System.out.println("Wrong phone Number");
				}
			}
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
		
}

	
