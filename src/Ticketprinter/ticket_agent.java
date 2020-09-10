package Ticketprinter;

import java.util.Scanner;

public class ticket_agent {
	 String movieName;
	 double ticketPrice = 0;
	 int    ticketQty = 0;
	 double totalPrice;
	 double discTotal=0; // After discount price
	
	
	public  void welcomemoduel() {
	// Welcome note
	
	
	System .out.println("------Welcome to AMC Theater at Tyson Corner-------");
	System.out.println("----------------Please Enjoy the movie---------------");
	}
	
	public  void inputModuel() {
	//Ticket input information
	Scanner scanMachine=new Scanner(System.in);
	System.out.println("Please enter the movie name:");
	movieName=scanMachine.nextLine();
	boolean rightprice= false;
	do {
		try {
			Scanner scanMachine1=new Scanner(System.in);
			System.out.println("Please enter the price of ticket:");
		ticketPrice=scanMachine1.nextDouble();
	}catch (Exception e) {
		System.out.println("Please Enter the right price of ticket in between $50 to $250");
		continue;
	}
	if(ticketPrice>=50 && ticketPrice<=250){
		rightprice=true;
	}else {
		System.out.println("Please Enter the price between 50-250");
	
	}	
	}
	
		while (rightprice == false);
		
	//putting quantity
		boolean rightqty= false;
		do {
			try {
				Scanner scanMachine1=new Scanner(System.in);
				System.out.println("Please enter the Quantity of ticket:");
			ticketQty=scanMachine1.nextInt();
		}catch (Exception e) {
			System.out.println("Please Enter the right number of ticket");
			continue;
		}
		if(ticketQty>=1 && ticketQty<=10){
			rightqty=true;
		}
			else{System.out.println("Please Enter the right number of ticket between 1-10");
		}
			
		}
		
			while (rightqty==false);
		

	}	

public  void totalpricemoduel() {
	// Calculation of ticket price
	
	totalPrice=ticketPrice * ticketQty;
	
}
 public  void discountmoduel(){
	//discounted total price process
	if (totalPrice<=100) {
		discTotal=totalPrice;
		}else if (totalPrice>100 && totalPrice<=500) {
			discTotal= totalPrice*(1-.10);
		}else if (totalPrice>500 && totalPrice<1000) {
			discTotal= totalPrice*(1-.20);
		}else if (totalPrice>=1000) {
			discTotal= totalPrice*(1-.30);
		}
	
 }
 public void outputmoduel(){
		// Output of ticket
		
		System.out.println("------Welcome to AMC Theater at Tyson Corner-------");
		System.out.println("----------------Please Enjoy the movie---------------");
		System.out.println("Name of the Movie:                  " + movieName);
		System.out.println("Price of ticket:                    " + ticketPrice);
		System.out.println("Quantity of ticket:                 " + ticketQty);
		System.out.println("Total Price of ticket:         "+ "$" + totalPrice);
		System.out.println("Total net Price after discount:"+ "$" + discTotal);
		
		System.out.println("------------Please Enjoy the Movie-------------------");	
}
}