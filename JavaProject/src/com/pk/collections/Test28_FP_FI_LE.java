package com.pk.collections;

interface I1{ //#1: marker interface
	//only for prividing type to implementation classes
		//Ex: Serializable, Cloneable, RandomAccess, 
		//SingleThreadModel
}			


interface I2 { //#2: functional interface
void m1();  //for implemeting functional programming
}				//with the help of LE or MR
		//Ex: Runnable, Comparable, Comparator, Iterable

interface I3 { //#3: business interface
void m1();	//for specifiying one business objects funcationality
void m2();		//Ex: Vechicle, SIM, ATMCard, Bank

}

//=============================
@FunctionalInterface
interface Addition {
void calculate(int a, int b);
//void calculate(float a, float b) { };//ce: Invalid '@FunctionalInterface' annotation; Addition is not a functional interface
default void calculate(float a, float b) { };
static void calculate(double a, double b) { };
}
//we can provide implementation to above interface in 4 ways
/*
* 1. outer class
* 2. anonymous class
* 3. lambda expression
* 4. method reference
* 
* 
*/
//Approach #1: outer class
class AdditionImpl implements Addition {
@Override
public void calculate(int a, int b) {
System.out.println("From OC: " + (a + b));
}
public void calculate(float a, float b) {
System.out.println("From OC: " + (a + b));
}
}

public class Test28_FP_FI_LE {
public static void main(String[] args) {

//Approach #1:
Addition ao1 = new AdditionImpl();
ao1.calculate(10, 20);


//Approach #2: 
Addition ao2 = 
		new Addition() {
				@Override
				public void calculate(int a, int b) {
					System.out.println("From AC: "+ (a + b));
				}
				@Override
				public void calculate(float a, float b) {
					System.out.println("From AC: "+ (a + b));
				}
	   }; 	
ao2.calculate(30, 40);

//Approach #3: 
Addition ao3 = 
		(a, b) -> System.out.println("From LE: "+ (a + b));

ao3.calculate(50, 60);				

//Subtract s1 = (a, b) -> {return a - b;}; //allowed
//Subtract s1 = (a, b) -> return a - b; //CE: because of return
Subtract s1 = (a, b) -> a - b; //no CE, after removing return

int res = s1.calculate(10, 5);
System.out.println(res);
}
}

@FunctionalInterface
interface Subtract {
int calculate(int a, int b);
}

/*
* 
* FIM => no-param method 
* 		|=> () -> { }
* 		|=> () -> {  multiple stmts }
* 		|=> () -> {  one stmt }
* 		|=> () ->   one stmt 
* 
* FIM => one-param method 
* 		|=> (int a) -> { System.out.println(a);};
* 		|=> (int a) -> System.out.println(a);
* 		|=> (a) -> System.out.println(a);
* 		|=> a -> System.out.println(a);
* 
* FIM => two-param method 
* 		|=> (int a, int b) -> { System.out.println(a+b);};
* 		|=> (a, b) -> System.out.println(a + b);
*
* FIM => non-void type ex: int
* 		|=> (a, b) -> { return a + b;} ;
* 		|=> (a, b) -> a + b ;
* 
*/