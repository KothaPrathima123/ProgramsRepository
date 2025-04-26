package com.pk.oops;

import java.util.Scanner;
public class MobileScreen {
	public static void main(String[] args) {

		Mobile iPhone = new Mobile();
		
		Scanner scn = new Scanner(System.in);

		try{
			
			System.out.print("Insert SIM: ");
			iPhone.insertSIM(scn.nextLine());
			System.out.println("SIM is successfully activated");

			while(true){
				System.out.println("\nChoose one option");
				System.out.println("  Type  1 to recharge");
				System.out.println("  Type  2 to currentBalance");
				System.out.println("  Type  3 to send call");
				System.out.println("  Type  4 to send sms");

				System.out.print("\nEnter option: ");
				int option = scn.nextInt(); scn.nextLine();

				switch(option){
					case 1: //recharge
						System.out.print("Enter amount to recharge: ");
						iPhone.recharge(scn.nextDouble());
						break;

					case 2: //current balance
						iPhone.currentBalance();
						break;

					case 3: //making call
						System.out.print("Enter mobile number: ");
						String response = 
							iPhone.call(scn.nextLong());  scn.nextLine();
						System.out.println(response);
						break;

					case 4: //sending sms
						System.out.println("Enter mobile number: ");
						long mn = scn.nextLong(); scn.nextLine();

						System.out.println("\nType message: ");
						String msg = scn.nextLine();

						response = iPhone.sms(mn, msg); 
						System.out.println(response);
						break;

					default:
						System.out.println("   Tumri fellow ");
						System.out.println("Choose valid option");

				}//switch close
			}//while close
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}