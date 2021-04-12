package ch5;

public class ProductEx {
	public static void main(String[] args) {
		Product product1 = new Product("abc12","상품","회사",1000,10);
		
		product1.changeSale(20);
		
		System.out.println("할인율 : " + product1.sale);
		
		System.out.println(product1.priceCalculation());
		
	}
}
