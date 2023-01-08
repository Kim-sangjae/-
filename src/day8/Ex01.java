package day8;

public class Ex01 {

	public static void main(String[] args) {

		
		C c = new C (); // C () ->   super() : B() ->   super() : A()
        B b = c;  // int num A , int num B
        A a = c;  //int num A
        A aa = c;
        
        if (a instanceof C) {
        C cc = (C)a;
        
        }
        
        

		
		

	}

}
