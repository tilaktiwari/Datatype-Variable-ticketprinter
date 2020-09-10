package Ticketprinter;

import java.util.Scanner;

public class ticketprinterv1 {

	
	static String movieName;
	static double ticketPrice = 0;
	static int    ticketQty = 0;
	static double totalPrice;
	static double discTotal=0; // After discount price
	
	
	public static void welcomemoduel() {
	// Welcome note
	
	
	System .out.println("------Welcome to AMC Theater at Tyson Corner-------");
	System.out.println("----------------Please Enjoy the movie---------------");
	}
	
	public static void inputModuel() {
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

public static void totalpricemoduel() {
	// Calculation of ticket price
	
	totalPrice=ticketPrice * ticketQty;
	
}
 public static void discountmoduel(){
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
 public static void outputmoduel(){
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
//calling all moduels
 public static void main (String[]agrs) {
	 welcomemoduel();
	 inputModuel();
	 totalpricemoduel();
	 discountmoduel();
	 outputmoduel();
 }

}

	

