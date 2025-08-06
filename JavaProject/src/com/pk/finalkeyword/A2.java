package com.pk.finalkeyword;

class A2 {
private A2() {
}
}
class B2 //extends A2
{//we can stop creating subclass from a class by declaring all constructors as private
	B2(){
		super(); //ce:the constructor A2() is not visible
	}
}
