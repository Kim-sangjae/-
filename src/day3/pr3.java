package day3;

public class pr3 {

	public static void main(String[] args) {
//5건물 1층 약국 2층 정형외과 3층 피부과 4층 치과 5층 헬스클럽
 int floor = 5;
		switch(floor) {
		case 1 : System.out.println("1층은 약국입니다");
		break;
		case 2 : System.out.println("2층은 정형외과 입니다");
		break;
		case 3 : System.out.println("3층은 피부과 입니다");
		break;
		case 4 : System.out.println("4층은 치과 입니다");
		break;
		case 5 : System.out.println("5층은 헬스클럽입니다");
		
		default : System.out.println("없는 층 입니다");
		
		}
		
	}

}
