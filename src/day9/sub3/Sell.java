package day9.sub3;

public interface Sell {
	
	void sell();
	default void order() {
		System.out.println("주문 - Sell");
	}

}
