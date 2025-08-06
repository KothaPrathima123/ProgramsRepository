package com.pk.oops;
class BusDepo {
	public static void main(String[] args) {

		Driver hk = new Driver();
		//hk.drive( new RedBus() ); //Message passing
		hk.drive( new Volvo() );
		//hk.drive( new SL() );
					
	}
}