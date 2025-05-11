package com.pk.oops;

class Driver {
	//Loose Coupling  (accepts all different sub types and allows  
void drive(Vehicle v) {				//to change to another sub type without modifying code
//Runtime Polymorphism
v.engine();  //executed from Vehicle implementation classes
v.breaks();  //based on the runtime object passed as argument
	  //and stored in the method parameter v
}
}