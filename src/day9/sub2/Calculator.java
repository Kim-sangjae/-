package day9.sub2;

public interface Calculator {
	int num = 10; // public static final
	public static final int num1 =10;
	
	int add (int num1, int num2);  // 인터페이스는 public abstract 를 알아서 추가해줌 
    int plus (int num1, int num2);
 
	
	default int minus (int num1,int num2) {
    	int result = num1 - num2;
    	return result;
    
    }
	
	static void staticMethod () {
		System.out.println("정적 메서드");
	}
	
	private void privateMethod () {
		System.out.println("private 메서드");
	}
}
