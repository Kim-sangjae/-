package dayy10.sub4;

import java.util.function.*;

public class Ex03 {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> cal = (x,y)->x+y;
		int result = cal.apply(10,20);
				System.out.println(result);
				
				
		Consumer <String> c = s -> System.out.println(s);
		
		c.accept("안녕");

	}

}
