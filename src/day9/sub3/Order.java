package day9.sub3;

public class Order implements Buy , Sell {

	@Override
	public void sell() {
		
		System.out.println("Sell");
		
	}

	@Override
	public void buy() {
		
		System.out.println("Buy");
		
	}

	public void order() {
		System.out.println("주문");
	}

		
	}


