package com.pk.oops;

public class Canteen {
	//void eat(Student s) {			//Tight Coupling 
			//s.eat();				  //Static Binding
	//}

	//void eat(Faculty f) {			//Tight Coupling
			//f.eat();				  //Static Binding
	//}
	
	void eat(Person p) {			//Loose Coupling 
		p.eat();						//Dynamic Binding
	}
}


//TC and SB											//TC and SB	[CDMA Mobile and SIM]			
	//HDFCATM with HDFCCard, withdraw() operation			//AirtelMobile with Airtel, call() operation 
	//ICICIATM with ICICICard, withdraw() operation			//BSNLMobile with BSNL, call() operation   
	//SBIATM with SBICard, withdraw() operation				//JioMobile with jio, call() operation          
																										                                                                                        
																										                                                                                        
//LC and DB												//LC and DB [GSM Mobile and SIM] 
	//ATM with ATMCard[H, I, S], withdraw() operation		//Mobile and SIM[A, B, j], call() operation     
			