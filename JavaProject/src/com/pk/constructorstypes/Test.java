package com.pk.constructorstypes;

import com.pk.modifiers.A;

/*class Example {                //Example.class
    class Example extends Object {
}                                Example(){
            super();   //calling super class constructor
        }
    }*/



//Test.java
class Test {
public static void main(String[] args){
//A a1 = new A();
//no-param constructor call    

//a1.m1(); //CE:
//method call

//A a1 = new A(5); //CE
//int-param constructor call    


                Example e1 = new Example(); //no error, DC call                                Example e2 = new Example(5); //CE: int param
                                    //constructor is not available

}
}

