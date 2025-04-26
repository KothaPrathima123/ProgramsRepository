package com.pk.dvlpsv;

public class Test03 {

		int x = 10;
//		int x = 20;					//duplicate variable
//		static int x = 30;			//duplicate variable
//		static String x = "a";	//duplicate variable
//		double x = 30.0;			//duplicate variable

		void m1() {
			int x = 50;	
		}
		
		void m2() {
			int x = 70;
		}

		void m3() {
	                 
			System.out.println(x); //x value is read from class NSV x from CO
		}

		void m4(){	
			int x = 80;						//it is local variable to m4(), it is Variable Shadowing
			System.out.println(x);		//as per LP algorithm compiler reads x from LV x from this method	
		}

		void m5() {	
			int x = 90;							//variable shadowing 
			System.out.println(x);			//variable value is reading from LV  x
			System.out.println(this.x);	//variable value is is reading from NSV from CO
		}

		static int a = 15;
		static void m6(){
												//no VS 
			System.out.println(a); //reads value from SV, O/P: 15
		}

		static void m7(){
			int a = 16;					//VS
			System.out.println(a);  //reads value from LV, O/P: 16
			System.out.println(Test03.a);  //reads value from SV, O/P: 15
		}

		static int m = 10;
		int n = 20;

		void m8(){
			int m = 13;
			int n = 14; 

			System.out.println(m + "  "  + n);
			System.out.println(Test03.m + "  "  + this.n);
			System.out.println(this.m + "  "  + this.n);

		}

		public static void main(String[] args) {
			Test03 t1 = new Test03();
			t1.m3();
			t1.m4();
			m6();
			m7();
			t1.m8();
		}
	}