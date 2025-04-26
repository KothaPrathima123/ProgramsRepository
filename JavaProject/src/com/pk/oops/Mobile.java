package com.pk.oops;

public class Mobile {
	
	private SIM sim;
	
	public void insertSIM(String simName) throws Exception{
		try{
			Class cls = Class.forName(simName);
			Object obj = cls.newInstance();

			if(obj instanceof SIM ){
				this.sim = (SIM)obj;
			}else {
				throw new Exception(sim + " is not a SIM");
			}

		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}
		
	}

	public void recharge(double amt){
		sim.recharge(amt);
	}

	public void currentBalance(){
		sim.currentBalance();
	}

	public String call(long mn){
		return sim.call(mn);
	}

	public String sms(long mn, String msg) {
		return sim.sms(mn, msg);
	}
	
}