package ch5;

public class GoodsStock {
	//상품 재고 관리를 위한 클래스
	//속성 - 상품코드(p210135), 재고수량(100)
	
	String goodsCode;
	int stock;
	
	//생성자 - 기본 생성자, 인자를 받는 생성자
	
	GoodsStock() {}
	
	GoodsStock(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	
	GoodsStock(String goodsCode, int stock) {
		this.goodsCode = goodsCode;
		this.stock = stock;
	}
	
	//기능 - 재고를 더한다. 재고를 뺀다
	
	void addStock(int amount) {
		stock +=amount;
	}
	
	void removeStock(int amount) {
		if(stock>amount) {
			stock -=amount;
		}
		
	}
	
	
	
	
}
