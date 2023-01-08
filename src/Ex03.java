
public class Ex03 {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50,60,70,80,90,100};
		                  // 0  1   2   3   4   5
		
		System.out.println("공간의갯수 : " + nums.length);
		
		for (int i =0; i<nums.length; i++ ) 
			               // i <= ( 이상 이하를 쓰면 오류남)  미만 초과로 써야함
			            // 0 부터 시작해서 0 1 2 3 4 5 (6개)
		{	System.out.println(nums[i]); }

	}

}
