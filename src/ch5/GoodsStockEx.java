package ch5;

public class GoodsStockEx {
	public static void main(String[] args) {
		
		GoodsStock goods1 = new GoodsStock("p101010", 1000);
		
		System.out.println(goods1.goodsCode);
		System.out.println(goods1.stock);
		
		goods1.addStock(200);
		
		System.out.println(goods1.stock);
		
		goods1.removeStock(500);
		
		System.out.println(goods1.stock);
		
	}
	
}
