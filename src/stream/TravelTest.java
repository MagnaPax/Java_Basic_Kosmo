package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 31, 50);

		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 중간연산 map()메서드를 사용해서 고객의 이름을 가져옴. 최종연산 forEach()메서드로 이름을 클릭함

		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은: " + total + "원 입니다");

		System.out.println("\n== 20세 이상 고객 명단을 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
		/*
		
		stream() ==> 스트림 새로생성
		
		-=-=중간 연산=-=- 
		filter() ==> getAge() 통해 가져온 값을 'c'에 저장
		map()	==> 이름 가져와서 'c'에 저장
		sorted()==> 정렬
		
		-=-=최종 연산=-=-
		forEach()==> 요소를 하나씩 꺼내와서 's'에 저장 
		
		 */

	}

}
