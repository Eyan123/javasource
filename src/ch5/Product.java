package ch5;

public class Product {
	// 속성 - 상품코드, 상품명, 제조사, 제조단가, 할인율
	// 생성자 - 모든필드를 파라메터로 받는다
	
	
	String code;
	String name;
	String company;
	int price;
	int sale;
	
	public Product() {
		super();
	}

	public Product(String code, String name, String company, int price, int sale) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		this.sale = sale;
	}
	
	// 기능 - 할인율을 변경. 
	// 판매가를 계산 = 제조단가 * (100 - 할인율) / 100
	
	void changeSale(int sale) {
		this.sale = sale;
	}
	
	int priceCalculation() {
		return price * (100 - sale) / 100;
	}
	
}
