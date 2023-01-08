package dayy10.sub3;

public class Ex01 {

	public static void main(String[] args) {
		
		
		Outer out = new Outer();
		Calculator cal = out.getCalculator();
		
		
		//add 가 호출될때는 getCalculator() 은 이미 종료 ->> 지역변수 제거상태 cal , num3
		//add 함수 내에서 지역변수 num3 를 사용 하기 위해서 -> 제거되면 안됌 -> num3를 상수화 시킴(데이터영역) , final int num3
		
		
		int result = cal.add(20, 30);
		System.out.println(result);

	}

}
