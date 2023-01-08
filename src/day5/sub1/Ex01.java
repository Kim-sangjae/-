package day5.sub1;

public class Ex01 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.title = "책책";
	    book1.author = "저자";
        book1.publisher = "출판사";
        book1.price = 100000;
        
        
        Book book2 = new Book();
        
        book2.title = "책책2";
	    book2.author = "저자2";
        book2.publisher = "출판사2";
        book2.price = 200000;
        
        
        //ex
        Book book3 = book2;
        
        book3.title ="책책3";
        book3.price = 30000;
        
        
        
        book1.bookInfo();
        book2.bookInfo();
        
        book1 = null; //  객체와 힙메모리와의 연결이 끊어짐
                                 //-> GC(Garbage Collector) 가 메모리 지워버림 
	}

}
