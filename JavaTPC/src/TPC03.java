import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. PDT vs. UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book bk;
		bk = new Book();
		bk.title = "자바";
		bk.price = 15000;
		bk.company = "한빛";
		bk.page = 700;
	
		System.out.print(bk.title + "\t");
		System.out.print(bk.price + "\t");
		System.out.print(bk.company + "\t");
		System.out.println(bk.page);
		
		PersonVO p;
		p = new PersonVO();
		p.name = "이수현";
		p.age = 33;
		p.weight = 100f;
		p.height = 200f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height);
		
	}
}
