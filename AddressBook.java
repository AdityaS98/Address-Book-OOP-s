package programmaddress;
/**
 * 
 */

import java.util.*;
/**
 * 
 * @author DELL
 *
 */

public class AddressBook {
	/*
	 * Instance Variables
	 */
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	/*
	 * Constructor
	 */

	AddressBook(String firstName, String lastName, String address, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
		
	}
	/*
	 * Printing the instance of employee
	 */

	public String toString() {
		return firstName + " " + lastName + " " + address + " " + city + " " + state + " " + zip + " " + phone + " "
				+ email;
	}
}

class Demo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/*
		 *Array List 
		 */
		List<AddressBook> c= new ArrayList<AddressBook>();
		Scanner sc = new Scanner(System.in);
		/*
		 * Initializing Variables for taking choice
		 */
		int choice;
		/*
		 * Display message for taking choice
		 */
		System.out.println("1.Insert");
		System.out.println("2.Display");
		System.out.println("3.Delete");
		System.out.println("4.Update");
		System.out.println("Enter your choice");
		/*
		 * Input of choice
		 */
		choice=sc.nextInt();
		AddressBook e = null;
		/*
		 * Switch Case for taking choice
		 */
		switch (choice) {
		/*
		 * Switch case for Inserting Details
		 */
		case 1:
			/*
			 * Taking Input form the user for the following fields
			 */
			System.out.println("Enter the details of the person");
			System.out.println("Enter the First Name");
			String personfirstname=sc.next();
			System.out.println("Enter the Last Name");
			String personlastname=sc.next();
			System.out.println("Enter the Address Name");
			String personAddress=sc.next();
			System.out.println("Enter the City Name");
			String personcity=sc.next();
			System.out.println("Enter the State Name");
			String personstate=sc.next();
			System.out.println("Enter the Pincode");
			String personCode=sc.next();
			System.out.println("Enter the Phone No");
			String personphone=sc.next();
			System.out.println("Enter the E mail");
			String personemial=sc.next();
			/*
			 * Collection
			 */
			c.add(new AddressBook (personfirstname,personlastname,personAddress,personcity,personstate,personCode));
			break;
			/*
			 * Use case to Display the Address
			 */
		case 2:
			/*
			 * Instance of iterator
			 */
			Iterator<AddressBook> i = c.iterator();
			/*
			 * Next object
			 */
			while (i.hasNext()) {
				AddressBook e1=i.next();
				System.out.println(e1);
				}
			break;
			/*
			 * Use case to search an address
			 */
		case 3:
			boolean found=false;
			
			System.out.println("Enter the address to be searched");
			/*
			 * Instance of Iterator
			 */
			i = c.iterator();
			 String address = sc.next();
			if(e.getAddress().equals(address)) {
				 found=true;
			 }
			while (i.hasNext()) {
				AddressBook e1=i.next();
				System.out.println(e1);
				}
			if(!found) {
				System.out.println("Record not found");
				
			}
			break;
			/*
			 * Use case for delete an address
			 */
		case 4:
			 found=false;
			
			System.out.println("Enter the address to be deleted");
			i = c.iterator();
			  address = sc.next();
			if(e.getAddress()==address) {
				 found=true;
			 }
			while (i.hasNext()) {
				i.remove();
				System.out.println(e);
				}
			if(!found) {
				System.out.println("Record not found");
				
			}else {
				System.out.println("Record is deleted");
				
			}
			break;
		/*
		 * Use case to update the address
		 */
		
		case 5:
		found = false;
		
		System.out.println("Enter the adress to be updated");
		address=sc.next();
		ListIterator<AddressBook>li=c.listIterator();
		while(li.hasNext()) {
			AddressBook e1=li.next();
			if(e1.getAddress().equals(address)) {
				System.out.println("Enter the new name");
				String firstName=sc.next();
				System.out.println("Enter the new last name");
				String lastName=sc.next();
				System.out.println("Enter the new address");
				address=sc.next();
				System.out.println("Enter the new city");
				String city=sc.next();
				System.out.println("enter new State");
				String state=sc.next();
				System.out.println("Enter new Pincode");
				String zip=sc.next();
				System.out.println("Enter new phone number");
				String phone=sc.next();
				System.out.println("Enter new email");
				String email=sc.next();
				li.set(new AddressBook(firstName,city,state,zip,phone,email));
				
				found=true;
			}
		}
		if(!found) {
			System.out.println("Record not found");
		}
		else {
			System.out.println("Record updated successfully");
				
				
			}
				
			}
		
		
		while(choice!=0) ;
			
		

	}
}
