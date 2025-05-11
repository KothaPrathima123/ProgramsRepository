package com.pk.dvlpsv;

class Example {
	int x;
	int y;

	void setX(int x){
		this.x = x;
	}

	int getX(){
		return x;
	}

	void setY(int y){
		this.y = y;
	}

	int getY(){
		return y;
	}

	void display(){
		System.out.println(x + " " + y);
	}	

}
public class Test01 {
	public static void main(String[] args) 	{
		
		Example e1 = new Example();
		Example e2 = new Example();
		
		System.out.println("e1 and e2 object values");
		e1.display(); e2.display();

		e1.setX(10); e1.setY(20);
		e2.setX(30); e2.setY(40);

		System.out.println("\ne1 and e2 object values");
		System.out.println(e1.getX() + " " + e1.getY());
		System.out.println(e2.getX() + " " + e2.getY());

		e1.setX(15); e1.setY(16);
		e2.setX(17); e2.setY(18);

		System.out.println("\ne1 and e2 object values");
		e1.display(); e2.display();

	}
}