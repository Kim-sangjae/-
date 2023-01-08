package day9.sub3;

public class Ex01 {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.buy();
		order.sell();
		
		
		Buy buy = order;
		buy.buy();
		
		
		Sell sell = order;
		sell.sell();
		
		order.order();

	}

}
