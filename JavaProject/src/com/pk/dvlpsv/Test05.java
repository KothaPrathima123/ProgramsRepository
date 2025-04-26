package com.pk.dvlpsv;


class Ex {
		int x = 10;
		void m1(){
			x = 5;
		}
		void m2(){                             
			Ex t1 = new Ex();
			t1.x = 7;
		}
		void m3(){
			x = 12;		 
			Ex t1 = new Ex();
			t1.x = 14;	
		}
		void m4(){
			x = 16;	 		
			Ex t1 = this;
			t1.x = 18;
		}
		void m5(){
			//t1.x = 21;  
		}
		void m6(){
			int x;
			x = 22;  
		}
		void m7(){
			int x;
			this.x = 23;  
		}
	}
	public class Test05{
		public static void main(String[] args) {
			Ex t1 = new Ex();
			System.out.println(t1.x);

			t1.m1();
			System.out.println(t1.x );

			t1.m2();
			System.out.println(t1.x );
			
			t1.m3();
			System.out.println(t1.x );

			t1.m4();
			System.out.println(t1.x );

			t1.m5();
			System.out.println(t1.x );

			t1.m6();
			System.out.println(t1.x );
	 
			t1.m7();
			System.out.println(t1.x );
	/**/
		}
	}
