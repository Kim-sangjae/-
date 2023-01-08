package day4;

public class Ex04 {

	public static void main(String[] args) {
	
		/**
		int[][] nums = new int [2][3]; //2행 3열
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;
        
        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;
   */
		//int[][]nums = new int[][] { {10,20,30}, {40,50,60} };
          int[][]nums = { {10,20,30}, {40,50,60} };		
          
          for (int i = 0; i< nums.length; i++) 
          {   for (int j = 0;  j<nums[i].length; j++)
          {    System.out.println( i +"행,"+ j +"열=" + nums [ i ][ j ] );  
        }
		}
	
	
	}
}

