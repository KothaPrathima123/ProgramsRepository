package com.pk.multithreading;

/*We can set custom name to a thread in two ways
* 	1. By using constructor and 
* 	2. By using setName(-) method
* 
*  If we create object by using String param constructor,
*  the default name is not applied, index number is not increased
* 
*  
*/
public class Test16_name {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		Thread th2 = new Thread("Child-2");
		
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println();
			
		th1.setName("Child1");	
			
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println();
		
		Thread th3 = new Thread();
		System.out.println(th3.getName());

		Thread th4 = new Thread((Runnable)null);
		System.out.println(th4.getName());

		Thread th5 = new Thread((Runnable)null, "Child3");
		System.out.println(th5.getName());

		Thread th6 = new Thread();
		System.out.println(th6.getName());
		System.out.println();

		Thread th7 = new Thread("Child4");
		Thread th8 = new Thread("Child4");
		System.out.println(th7.getName());
		System.out.println(th8.getName());
		
		MyThread11 mt1 = new MyThread11();
		MyThread11 mt2 = new MyThread11();
		
		mt1.setName("Child5");
		mt2.setName("Child5");
		
		mt1.start();
		mt2.start();
		
	}
}
